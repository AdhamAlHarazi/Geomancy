/*
 This file is part of Geomancy software named: ضرب التخت لمعرفة ضروب البخت.

    ضرب التخت لمعرفة ضروب البخت is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    ضرب التخت لمعرفة ضروب البخت is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ضرب التخت لمعرفة ضروب البخت.  If not, see <http://www.gnu.org/licenses/>.
	
 */
package RamlComApp;

/**
 *
 * @author Adham
 */
public class Tackht {

    public Tackht() {
        // TODO Auto-generated constructor stub
    }

    public static int[][] calculateTakht(int[][] mothers) {
        int[][] tackht = new int[16][4];
        int[][] daughters, grandDaughters = new int[4][4];
        int[] saiel, masoul, mezan, akeba = new int[4];

        daughters = calculateDaughters(mothers);
        grandDaughters = calculateGrandDaughters(mothers, daughters);
        saiel = calculateSaiel(grandDaughters);
        masoul = calculateMasoul(grandDaughters);
        mezan = calculateMezan(saiel, masoul);
        akeba = calculateAkeba(mezan, mothers);

			// Filling the whole Tackht in
        for (int i = 0; i < 16; i++) {
            if (i <= 3) {
                for (int j = 0; j < 4; j++) {
                    tackht[i][j] = mothers[i][j];
                }
            }

            if (i >= 4 && i <= 7) {
                for (int j = 0; j < 4; j++) {
                    tackht[i][j] = daughters[i - 4][j];
                }
            }

            if (i >= 8 && i <= 11) {
                for (int j = 0; j < 4; j++) {
                    tackht[i][j] = grandDaughters[i - 8][j];
                }

            }

            if (i == 12) {
                tackht[i] = saiel;
            }
            if (i == 13) {
                tackht[i] = masoul;
            }
            if (i == 14) {
                tackht[i] = mezan;
            }
            if (i == 15) {
                tackht[i] = akeba;
            }

        }

        return tackht;
    }

    // Calculate the 4 daughters : daughter1 = mother 1 index 1 + mother 2 index 1+ mother3 index1+ mother4 index1.
    private static int[][] calculateDaughters(int[][] mothers) {
        int[][] daughters = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                daughters[i][j] = mothers[j][i];
                //	System.out.println("Daughters"+i+j+ daughters[i][j]);
            }
        }
        return daughters;
    }

    /* Calculate the 4 grandDaughters : grandDaughter1 = mother1 * mother2, grandDaughter2 = mother 3 * mother4,
     grandDaughter3 = daughter1 * daughter2, grandDaughter4 = daughter3 * daughter4.*/
    private static int[][] calculateGrandDaughters(int[][] mothers, int[][] daughters) {
        int[][] grandDaughters = new int[4][4];
        // Calculate the 1st and 2nd grandDaughter
        for (int i = 0; i < 2; i++) {
            int mothIndex = i;
            if (i > 0) {
                mothIndex = 2;
            }

            grandDaughters[i] = multiplyArrays(mothers, mothers, mothIndex, mothIndex + 1);
        }
        // Calculate the 3rd and 4th grandDaughter	
        for (int k = 2; k < 4; k++) {
            int dauIndex = k - 2;
            if (k == 3) {
                dauIndex = 2;
            }

            grandDaughters[k] = multiplyArrays(daughters, daughters, dauIndex, dauIndex + 1);
        }

			//printFullArray(grandDaughters);
        return grandDaughters;
    }

    // Calculate the Saiel.
    private static int[] calculateSaiel(int[][] grandDaughters) {
        int[] saiel = new int[4];
        saiel = multiplyArrays(grandDaughters, grandDaughters, 0, 1);

		//	System.out.println("saiel = ");
        //	printFullArraySingle(saiel);
        return saiel;
    }

    // Calculate the Masoul.
    private static int[] calculateMasoul(int[][] grandDaughters) {
        int[] masoul = new int[4];
        masoul = multiplyArrays(grandDaughters, grandDaughters, 2, 3);

			//printFullArraySingle(masoul);
        return masoul;
    }

    // Calculate the Mezan
    private static int[] calculateMezan(int[] saiel, int[] masoul) {
        int[] mezan = new int[4];
        mezan = multiplyArrays(saiel, masoul);

			//printFullArraySingle(mezan);
        return mezan;
    }

    // Calculate the Akeba
    private static int[] calculateAkeba(int[] mezan, int[][] mothers) {
        int[] akeba = new int[4];

        akeba = multiplyArrays(mezan, mothers, 0);

			//printFullArraySingle(akeba);
        return akeba;
    }

    // multiply both 1 dimension arrays indices and return the result array.
    private static int[] multiplyArrays(int x[], int y[]) {
        int[] result = new int[4];

        for (int i = 0; i < 4; i++) {
            result[i] = multiplyBothFigures(x[i], y[i]);
        }

        return result;
    }

    // multiply both 2 dimension arrays based on the passed indexes indices and return the result array.
    private static int[] multiplyArrays(int x[][], int y[][], int index1, int index2) {
        int[] result = new int[4];

        for (int j = 0; j < 4; j++) {
            result[j] = multiplyBothFigures(x[index1][j], y[index2][j]);
        }

        return result;
    }

    // multiply both a one dimension array be a 2 dimension array based on the passed indexes indices and return the result array.
    private static int[] multiplyArrays(int x[], int y[][], int index) {
        int[] result = new int[4];

        for (int j = 0; j < 4; j++) {
            result[j] = multiplyBothFigures(x[j], y[index][j]);
        }

        return result;
    }

    // multiply both array's indexes, if both are same then return 1 else return 0. 
    private static int multiplyBothFigures(int x, int y) {
        int result;

        if (x == y) {
            result = 1;
        } else {
            result = 0;
        }

        return result;
    }

}

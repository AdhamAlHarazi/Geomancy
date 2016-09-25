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
public class RMethods {

	public RMethods() {
		// TODO Auto-generated constructor stub
	}

   // enum of all the shapes
   public enum ShaklName{
   	JOOD_LAHO, AHYAN, RAIT_FARAH, BAIATH, NAKI_ALKHAD, ATABA_KHARIGA, HAMARA, INKEES, NASRA_KHARIGA, OOKLA,IGTEMAA, NASRA_DAKHLA, TARIQ, 
   	QABTH_KHARIG, GAMAAA, QABTH_DAKHEL 
   }
   // enum of the four elements
   public enum Elements{
	   FIRE, AIR, WATER, EARTH
   }
   
   public enum TimeOfDay{
	   MORNING, BEFORE_NOON, NOON, AFTERNOON ,EVENING, NIGHT
   }
   
   // enum of all the planets
   public enum Planet{
	   SATURN, JUPITER, MARS, SUN, VENUS, MERCURY, MOON, RAAS, THANAB
   }
   
   // enum of all the Horoscopes
   public enum Horoscope{
	   ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTARIUS, CAPRICON, AQUARIUS,PISCES
   }
   
   // enum of all the regions.
   public enum Region{
	   AL_IFRANG, AL_HEGAZ, WEST, CHINA, AL_ROOM, AL_KHARAB, INDIA, AL_TURK, EGYPT, AL_BEHAR, AL_GEBAL  
   }
   
   // enum for the 4 directions
  // public enum Direction{
	 //  EAST, WEST, 
//   }
   
   // enum of Taskeen Altabiaa orderd by Al-Taskeen altabiee
   public enum TaskeenAltabiaa{
	   HAMARA, AHYAN, ATABA_KHARIGA, NAKI_ALKHAD, RAIT_FARAH, QABTH_KHARIG, NASRA_DAKHLA, INKEES, NASRA_KHARIGA, QABTH_DAKHEL, JOOD_LAHO,
	   BAIATH, OOKLA, TARIQ, IGTEMAA,GAMAAA;
	   
	//  public static TaskeenAltabiaa get(int i){
		   //return values()[i];
	 //  }
   }
   
   // custom boolean
   public enum cBoolean{
		SAAD, NAHS, M_SAAD, M_NAHS
	}
   
   // custom tfmBoolean    true, false, maybe(so and so)
   public enum tfmBoolean{
      TRUE, FALSE, MAYBE;
   }
   
   
   // enum of male and female
   public enum Sex{
       MALE, FEMALE;
   }
   
   //enum of days
   public enum Days{
       SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
   }
  
   // Get the name of the Shakhl, for the 2 dim array
    public ShaklName getShaklName(int[][] Tackht,int index){
    	 ShaklName nameOfShakl = null;

    		if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.JOOD_LAHO;
    		}
    		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.AHYAN;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.RAIT_FARAH;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.BAIATH;
    		}
    		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.NAKI_ALKHAD;
    		}
    		if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.ATABA_KHARIGA;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.HAMARA;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.INKEES;
    		}
    		if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.NASRA_KHARIGA;
    		}
    		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.OOKLA;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.IGTEMAA;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.NASRA_DAKHLA;
    		}
    		if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.TARIQ;
    		}
    		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.QABTH_KHARIG;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
    			nameOfShakl = ShaklName.GAMAAA;
    		}
    		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
    			nameOfShakl = ShaklName.QABTH_DAKHEL;
    		}
    		
    		
	 return nameOfShakl;
    }
    
    
    // Get the name of the Shakhl for the single passed shape
    public ShaklName getShaklName(int[] shape){
    	 ShaklName nameOfShakl = null;

    		if(shape[0] == 0 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.JOOD_LAHO;
    		}
    		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.AHYAN;
    		}
    		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.RAIT_FARAH;
    		}
    		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.BAIATH;
    		}
    		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.NAKI_ALKHAD;
    		}
    		if(shape[0] == 0 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.ATABA_KHARIGA;
    		}
    		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.HAMARA;
    		}
    		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.INKEES;
    		}
    		if(shape[0] == 0 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.NASRA_KHARIGA;
    		}
    		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.OOKLA;
    		}
    		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.IGTEMAA;
    		}
    		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.NASRA_DAKHLA;
    		}
    		if(shape[0] == 0 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.TARIQ;
    		}
    		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.QABTH_KHARIG;
    		}
    		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 1){
    			nameOfShakl = ShaklName.GAMAAA;
    		}
    		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 0){
    			nameOfShakl = ShaklName.QABTH_DAKHEL;
    		}
    		
    		
	 return nameOfShakl;
    }
    
    // Get the name of the Taskeen.
    public TaskeenAltabiaa getTaskeen(int[][] Tackht,int index){
    	TaskeenAltabiaa taskeen = null;
    	
    	if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
    		taskeen = TaskeenAltabiaa.JOOD_LAHO;
		}
		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.AHYAN;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
			taskeen = TaskeenAltabiaa.RAIT_FARAH;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.BAIATH;
		}
		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
			taskeen = TaskeenAltabiaa.NAKI_ALKHAD;
		}
		if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.ATABA_KHARIGA;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.HAMARA;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
			taskeen = TaskeenAltabiaa.INKEES;
		}
		if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.NASRA_KHARIGA;
		}
		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
			taskeen = TaskeenAltabiaa.OOKLA;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.IGTEMAA;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
			taskeen = TaskeenAltabiaa.NASRA_DAKHLA;
		}
		if(Tackht[index][0] == 0 && Tackht[index][1] == 0 && Tackht[index][2] == 0 &&  Tackht[index][3] == 0){
			taskeen = TaskeenAltabiaa.TARIQ;
		}
		if(Tackht[index][0] == 0 && Tackht[index][1] == 1 && Tackht[index][2] == 0 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.QABTH_KHARIG;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 1 && Tackht[index][2] == 1 &&  Tackht[index][3] == 1){
			taskeen = TaskeenAltabiaa.GAMAAA;
		}
		if(Tackht[index][0] == 1 && Tackht[index][1] == 0 && Tackht[index][2] == 1 &&  Tackht[index][3] == 0){
			taskeen = TaskeenAltabiaa.QABTH_DAKHEL;
		}
		
		
    	return taskeen;
    }
    
    
    // Get the name of the Taskeen.
    public TaskeenAltabiaa getTaskeen(int[] shape){
    	TaskeenAltabiaa taskeen = null;
    	
    	if(shape[0] == 0 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 0){
    		taskeen = TaskeenAltabiaa.JOOD_LAHO;
		}
		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.AHYAN;
		}
		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 0){
			taskeen = TaskeenAltabiaa.RAIT_FARAH;
		}
		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.BAIATH;
		}
		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 0){
			taskeen = TaskeenAltabiaa.NAKI_ALKHAD;
		}
		if(shape[0] == 0 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.ATABA_KHARIGA;
		}
		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.HAMARA;
		}
		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 0){
			taskeen = TaskeenAltabiaa.INKEES;
		}
		if(shape[0] == 0 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.NASRA_KHARIGA;
		}
		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 0){
			taskeen = TaskeenAltabiaa.OOKLA;
		}
		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.IGTEMAA;
		}
		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 0){
			taskeen = TaskeenAltabiaa.NASRA_DAKHLA;
		}
		if(shape[0] == 0 && shape[1] == 0 && shape[2] == 0 &&  shape[3] == 0){
			taskeen = TaskeenAltabiaa.TARIQ;
		}
		if(shape[0] == 0 && shape[1] == 1 && shape[2] == 0 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.QABTH_KHARIG;
		}
		if(shape[0] == 1 && shape[1] == 1 && shape[2] == 1 &&  shape[3] == 1){
			taskeen = TaskeenAltabiaa.GAMAAA;
		}
		if(shape[0] == 1 && shape[1] == 0 && shape[2] == 1 &&  shape[3] == 0){
			taskeen = TaskeenAltabiaa.QABTH_DAKHEL;
		}
		
		
    	return taskeen;
    }
    
    // get taskeen Al-Adad
    public int getTaskeenAlAdad(int[] shape){
        int counter=0;
        
        for(int i=0; i<4; i++){
            counter+= shape[i];
        }
        
        return counter;
    }
    
    // return the array of the passed shape
    public int[] getShapeArray(ShaklName shape){
    	int[] result= new int[4];
    	
    	switch(shape){
    	case JOOD_LAHO:    result[0]= 0; result[1]=0; result[2]=1; result[3]=0;  break;
    	case AHYAN:       result[0]= 0; result[1]=1; result[2]=1; result[3]=1;  break;
    	case RAIT_FARAH:   result[0]= 1; result[1]=0; result[2]=0; result[3]=0;  break;
    	case BAIATH:      result[0]= 1; result[1]=1; result[2]=0; result[3]=1;  break;
    	case NAKI_ALKHAD:  result[0]= 0; result[1]=1; result[2]=0; result[3]=0;  break;
    	case ATABA_KHARIGA:result[0]= 0; result[1]=0; result[2]=0; result[3]=1;  break;
    	case HAMARA:      result[0]= 1; result[1]=0; result[2]=1; result[3]=1;  break;
    	case INKEES:	  result[0]= 1; result[1]=1; result[2]=1; result[3]=0;  break;
    	case NASRA_KHARIGA:result[0]= 0; result[1]=0; result[2]=1; result[3]=1;  break;
    	case OOKLA:       result[0]= 0; result[1]=1; result[2]=1; result[3]=0;  break;
    	case IGTEMAA:     result[0]= 1; result[1]=0; result[2]=0; result[3]=1;  break;
    	case NASRA_DAKHLA: result[0]= 1; result[1]=1; result[2]=0; result[3]=0;  break;
    	case TARIQ:       result[0]= 0; result[1]=0; result[2]=0; result[3]=0;  break;
    	case QABTH_KHARIG: result[0]= 0; result[1]=1; result[2]=0; result[3]=1;  break;		
    	case GAMAAA:      result[0]= 1; result[1]=1; result[2]=1; result[3]=1;  break;		
    	case QABTH_DAKHEL: result[0]= 1; result[1]=0; result[2]=1; result[3]=0;  break;		
    	
    	}
    	
    	return result;
    }
    

    // is the passed shape within Tacket Dakhel?
    public boolean isDakhel(int[][] Tackht, int index ){

    	if(Tackht[index][0]== 1 && Tackht[index][3] == 0){
    		return true;
    	}else{
    		return false;
    	}
    	
    }
    
      // is the passed shape Dakhel?
    public boolean isDakhel(int[] shape){

    	if(shape[0]== 1 && shape[3] == 0){
    		return true;
    	}else{
    		return false;
    	}
    	
    }
    
    // is the passed shape within Khareg?

    public boolean isKhareg(int[][]Tackht, int index){

    	if(Tackht[index][0]== 0 && Tackht[index][3] == 1){
    		return true;	
    	} else{ 
    		return false;}
    }
    
     // is the passed shape Khareg?
    public boolean isKhareg(int[] shape){

    	if(shape[0]== 0 && shape[3] == 1){
    		return true;	
    	} else{ 
    		return false;}
    }
    
    // is the passed shape within Tacket Thabit?
    public boolean isThabit (int[][]Tackht, int index){
   
    	if(Tackht[index][0]== 1 && Tackht[index][3] == 1){
    		return true;
    	}else{
    		return false;}		
    }
    
     // is the passed shape Thabit?
    public boolean isThabit (int[] shape){
   
    	if(shape[0]== 1 && shape[3] == 1){
    		return true;
    	}else{
    		return false;}		
    }

    // is the passed shape within Tackhet Munqalib?
    public boolean isMunqalib(int[][]Tackht, int index){
    	
    	if(Tackht[index][0]== 0 && Tackht[index][3] == 0){
    		return true;
    	}else{
    		return false;}
    }
    
    // is the passed shape Munqalib?
    public boolean isMunqalib(int[] shape){
    	
    	if(shape[0]== 0 && shape[3] == 0){
    		return true;
    	}else{
    		return false;}
    }
    
    
 /*   public String getCorospondingLetter(int[][]Tackht,int index){
    	String result ="";
    	
    	switch (getShaklName(Tackht,index)){
    	case "Tariq": result = "ع" ; break;
    	case "Ataba Khariqa": result = "ح خ"; break;
    	}
    	
    	return result;
    }
 */  
    
    // Check if the shape is Sammet or not.
    public boolean isSameta(int[][] Tackht, int index){
    	 ShaklName shaklName = getShaklName(Tackht,index);
    	
    	if(shaklName == ShaklName.OOKLA || shaklName ==  ShaklName.IGTEMAA ||shaklName==ShaklName.TARIQ || shaklName==ShaklName.GAMAAA
    			|| isDakhel(Tackht,index)){
    		return true;
    	}else{
    		return false;
    	}
    }

    // Check if shape is Nateq or not
    public boolean isNateq(int[][] Tackht, int index){
    	 ShaklName shaklName = getShaklName(Tackht,index);
    	 
    	 if(shaklName == ShaklName.JOOD_LAHO || shaklName == ShaklName.NAKI_ALKHAD || shaklName == ShaklName.HAMARA 
    			 || shaklName == ShaklName.BAIATH
    			 || isKhareg(Tackht,index)){
    		 return true;
    	 }else{
    		 return false;
    	 }
    }
	
	// Check if shape is opened from the passed order -fire, Air, Water Earth- or not
	public boolean isShapeOpenAt(int[][] Tackht, int index, int order){
            
            if(Tackht[index][order] == 0 )
                return true;	 
            else
                return false;	 
 
    }
	
	
	
    
    // Check wither passed shape is Saad, Nahs,Mummtazeg Saad, Mummtazeg Nahs (a Tackhet Shape)
    public cBoolean isSaad_Nahs_MSaad_MNahs(int[][] Tackht, int index){
    	ShaklName shaklName = getShaklName(Tackht,index);
    	cBoolean result = null;
    	
    	if(shaklName == ShaklName.AHYAN || shaklName == ShaklName.RAIT_FARAH || shaklName == ShaklName.QABTH_DAKHEL ||
    			shaklName == ShaklName.NASRA_DAKHLA || shaklName == ShaklName.NASRA_KHARIGA || shaklName == ShaklName.BAIATH){
    		result = cBoolean.SAAD;
    		
    	}else if(shaklName == ShaklName.GAMAAA || shaklName == ShaklName.IGTEMAA || shaklName == ShaklName.TARIQ ||
    			shaklName == ShaklName.JOOD_LAHO){
    		result = cBoolean.M_SAAD;
    		
    	}else if(shaklName == ShaklName.HAMARA || shaklName == ShaklName.INKEES || shaklName == ShaklName.QABTH_KHARIG ||
    			shaklName == ShaklName.ATABA_KHARIGA){
    		result = cBoolean.NAHS;
    		
    	}else if(shaklName == ShaklName.OOKLA || shaklName == ShaklName.NAKI_ALKHAD){
    		result = cBoolean.M_NAHS;
    	}
    	return result;
    }
    
    // Check wither passed shape is Saad, Nahs,Mummtazeg Saad, Mummtazeg Nahs (for individual shape)
    public cBoolean isSaad_Nahs_MSaad_MNahs(int[] shape){
    	ShaklName shaklName = getShaklName(shape);
    	cBoolean result = null;
    	
    	if(shaklName == ShaklName.AHYAN || shaklName == ShaklName.RAIT_FARAH || shaklName == ShaklName.QABTH_DAKHEL ||
    			shaklName == ShaklName.NASRA_DAKHLA || shaklName == ShaklName.NASRA_KHARIGA || shaklName == ShaklName.BAIATH){
    		result = cBoolean.SAAD;
    		
    	}else if(shaklName == ShaklName.GAMAAA || shaklName == ShaklName.IGTEMAA || shaklName == ShaklName.TARIQ ||
    			shaklName == ShaklName.JOOD_LAHO){
    		result = cBoolean.M_SAAD;
    		
    	}else if(shaklName == ShaklName.HAMARA || shaklName == ShaklName.INKEES || shaklName == ShaklName.QABTH_KHARIG ||
    			shaklName == ShaklName.ATABA_KHARIGA){
    		result = cBoolean.NAHS;
    		
    	}else if(shaklName == ShaklName.OOKLA || shaklName == ShaklName.NAKI_ALKHAD){
    		result = cBoolean.M_NAHS;
    	}
    	return result;
    }
    
 
    // Check if the passed shape(from Tackht) is Saad
    public boolean isSaad(int[][] Tackht, int index){
    	ShaklName shaklName = getShaklName(Tackht,index);
    	
    	if(shaklName == ShaklName.AHYAN || shaklName == ShaklName.RAIT_FARAH || shaklName == ShaklName.QABTH_DAKHEL ||
    			shaklName == ShaklName.NASRA_DAKHLA || shaklName == ShaklName.NASRA_KHARIGA || shaklName == ShaklName.BAIATH){
    		return true;
    	}else{ 
    		return false;
    	}
    }
    
 // Check if the passed shape(individual shape) is Saad.
    public boolean isSaad(int[] shape){
    	ShaklName shaklName = getShaklName(shape);
    	
    	if(shaklName == ShaklName.AHYAN || shaklName == ShaklName.RAIT_FARAH || shaklName == ShaklName.QABTH_DAKHEL ||
    			shaklName == ShaklName.NASRA_DAKHLA || shaklName == ShaklName.NASRA_KHARIGA || shaklName == ShaklName.BAIATH){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    // Check if the passed shape is Mummtazeg Saad (from Tackht)
    public boolean isMummtazagSaad(int[][] Tackht, int index){
    	ShaklName shaklName = getShaklName(Tackht,index);
    	
    	if(shaklName == ShaklName.GAMAAA || shaklName == ShaklName.IGTEMAA || shaklName == ShaklName.TARIQ ||
    			shaklName == ShaklName.JOOD_LAHO){
    		return true;
    	}else{
    		return false;
    	}
    }
    
   // Check if the passed shape is Mummtazeg Saad (Individual Shape)
    public boolean isMummtazagSaad(int[] shape){
    	ShaklName shaklName = getShaklName(shape);
    	
    	if(shaklName == ShaklName.GAMAAA || shaklName == ShaklName.IGTEMAA || shaklName == ShaklName.TARIQ ||
    			shaklName == ShaklName.JOOD_LAHO){
    		return true;
    	}else{
    		return false;
    	}
    }
    // Check if the passed shape is Nahs (from Tackht)
    public boolean isNahs(int[][] Tackht, int index){
    	ShaklName shaklName = getShaklName(Tackht,index);
    	
    	if(shaklName == ShaklName.HAMARA || shaklName == ShaklName.INKEES || shaklName == ShaklName.QABTH_KHARIG ||
    			shaklName == ShaklName.ATABA_KHARIGA){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    // Check if the passed shape is Nahs (Individual Shape)
    public boolean isNahs(int[] shape){
    	ShaklName shaklName = getShaklName(shape);
    	
    	if(shaklName == ShaklName.HAMARA || shaklName == ShaklName.INKEES || shaklName == ShaklName.QABTH_KHARIG ||
    			shaklName == ShaklName.ATABA_KHARIGA){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    // Check if the passed shape is Mumtazeg Nahs(from Tackht)
    public boolean isMumtazegNahs(int[][] Tackht, int index){
    	ShaklName shaklName = getShaklName(Tackht,index);
    	
    	if(shaklName == ShaklName.OOKLA || shaklName == ShaklName.NAKI_ALKHAD){
    		return true;
    	}else{
    		return false;
    	}
    }
    
 // Check if the passed shape is Mumtazeg Nahs(Individual Shape)
    public boolean isMumtazegNahs(int[] shape){
    	ShaklName shaklName = getShaklName(shape);
    	
    	if(shaklName == ShaklName.OOKLA || shaklName == ShaklName.NAKI_ALKHAD){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    
    // return name of planet for the passed shape  ,  2 dim shape
    public Planet getPlanet(int[][] Tackht, int index){
    	
    	ShaklName shaklName = getShaklName(Tackht,index);
    	Planet planetName = null;
    	
    	if(shaklName == ShaklName.INKEES ||shaklName == ShaklName.OOKLA){
    		 planetName = Planet.SATURN;	
    	}
    	if(shaklName == ShaklName.AHYAN ||shaklName == ShaklName.RAIT_FARAH){
    		 planetName = Planet.JUPITER;
    	}
    	if(shaklName == ShaklName.HAMARA ||shaklName == ShaklName.JOOD_LAHO){
    		 planetName = Planet.MARS;
    	}
    	if(shaklName == ShaklName.NASRA_KHARIGA ||shaklName == ShaklName.QABTH_DAKHEL){
    		 planetName = Planet.SUN;
    	}
    	if(shaklName == ShaklName.NASRA_DAKHLA ||shaklName == ShaklName.NAKI_ALKHAD){
    		 planetName = Planet.VENUS;
    	}
    	if(shaklName == ShaklName.GAMAAA ||shaklName == ShaklName.IGTEMAA){
    		 planetName = Planet.MERCURY;
    	}
    	if(shaklName == ShaklName.BAIATH ||shaklName == ShaklName.TARIQ){
    		 planetName = Planet.MOON;
    	}
    	if(shaklName == ShaklName.QABTH_KHARIG){ //needs to make sure of this one
    		planetName = Planet.RAAS;
    	}
    	if(shaklName == ShaklName.ATABA_KHARIGA){
    		planetName = Planet.THANAB;
    	}
    	
    	return planetName;
    }	
    
    // return name of planet for the passed shape , single shape
    public Planet getPlanet(int[] shape){
    	
    	ShaklName shaklName = getShaklName(shape);
    	Planet planetName = null;
    	
    	if(shaklName == ShaklName.INKEES ||shaklName == ShaklName.OOKLA){
    		 planetName = Planet.SATURN;	
    	}
    	if(shaklName == ShaklName.AHYAN ||shaklName == ShaklName.RAIT_FARAH){
    		 planetName = Planet.JUPITER;
    	}
    	if(shaklName == ShaklName.HAMARA ||shaklName == ShaklName.JOOD_LAHO){
    		 planetName = Planet.MARS;
    	}
    	if(shaklName == ShaklName.NASRA_KHARIGA ||shaklName == ShaklName.QABTH_DAKHEL){
    		 planetName = Planet.SUN;
    	}
    	if(shaklName == ShaklName.NASRA_DAKHLA ||shaklName == ShaklName.NAKI_ALKHAD){
    		 planetName = Planet.VENUS;
    	}
    	if(shaklName == ShaklName.GAMAAA ||shaklName == ShaklName.IGTEMAA){
    		 planetName = Planet.MERCURY;
    	}
    	if(shaklName == ShaklName.BAIATH ||shaklName == ShaklName.TARIQ){
    		 planetName = Planet.MOON;
    	}
    	if(shaklName == ShaklName.QABTH_KHARIG){ //needs to make sure of this one
    		planetName = Planet.RAAS;
    	}
    	if(shaklName == ShaklName.ATABA_KHARIGA){
    		planetName = Planet.THANAB;
    	}
    	
    	return planetName;
    }	

    // get the nathar by multiplying be the Ahyan shape.
    public int[] getNathraho(int[][] Tackht, int index){
    	int[] result = new int[4];
    	
    	result= multIndexByShape(Tackht,index,getShapeArray(ShaklName.AHYAN));
    	
    	return result;
    }
    
    // get the Notkaho by multipliying by the Hamara shape
    public int[] getNotkaho(int[][] Tackht, int index){
    	int[] result = new int[4];
    	
    	result= multIndexByShape(Tackht,index,getShapeArray(ShaklName.HAMARA));
    	
    	return result;
    }
   
    // get the Itesalhao by multiplying be the Baiath shape
    public int[] getItsalaho(int[][] Tackht, int index){
    	int[] result = new int[4];
    	
    	result= multIndexByShape(Tackht,index,getShapeArray(ShaklName.BAIATH));
    	
    	return result;
    }
    
    // get the Infesalaho by multiplying be the Inkees shape
    public int[] getInfesalaho(int[][] Tackht, int index) {
    	int[] result = new int[4];
    	
    	result= multIndexByShape(Tackht,index,getShapeArray(ShaklName.INKEES));
    	
    	return result;
    }
    
   
    //multiply a tackht shape by a fixed passed shape
    public int[] multIndexByShape(int[][] Tackht, int index, int[] multiplier){
    	int[] result = new int[4];
    	
    	for(int i=0; i<4; i++){
    		 if(Tackht[index][i] == multiplier[i]){
    			result[i]=1;
    		}else{
    			result[i]=0;
    		}
    	}
    	return result;
    }
    
    // Multiply a tackht index by another tackht index
    public int[] multIndexByIndex(int[][] Tackht,int index1, int index2){
    	int[] result = new int[4];
    	
    	for(int i=0; i<4; i++){
    		if(Tackht[index1][i] == Tackht[index2][i]){
    			result[i]=1;
    		}else{
    			result[i]=0;
    		}
    	}
    	return result;
    }
    
    // Multiply an individual shape by an individual shape
    public int[] multiplyShapeByShape(int[]shape1,int[] shape2){
    	int[] result = new int[4];
    	
    	for(int i=0; i<4; i++){
    		if(shape1[i] == shape2[i]){
    			result[i]=1;
    		}else{
    			result[i]=0;
    		}
    	}
    	return result;
    }
    
    // Multiply index by index   and another index by index    and the product of both is then multiplied (all from the passed Tackhet)
    public int[] mult_4IndexesAndMultProductOf2(int[][] Tackht,int ind1, int ind2, int ind3, int ind4){
    	int [] result = new int[4];
    	
    	int[] shape1 = multIndexByIndex(Tackht,ind1,ind2);
    	int[] shape2 = multIndexByIndex(Tackht,ind3,ind4);
    	
    	result = multiplyShapeByShape(shape1,shape2);
    	return result;
    }
    
    
    // Check if the two shapes are Mumtazageen for the passed 2 dim arrays /// still one rule to be added
    public boolean isMummtazagen(int[][] TackhtIndex1, int index1, int[][] TackhtIndex2, int index2){
    	
    	TaskeenAltabiaa array1 = getTaskeen(TackhtIndex1,index1);
    	TaskeenAltabiaa array2 = getTaskeen(TackhtIndex2,index2);
    	
    	int indexofarray1 = array1.ordinal();
    	int indexofarray2 = array2.ordinal();
    	
    	int indexofits7 = indexofarray1+6;

    	
    	// are the two shapes under the same planet ?
    	if( getPlanet(TackhtIndex1,index1) == getPlanet(TackhtIndex2,index2) ){
    		return true;
    	}else{
    		// if not are the second shape the 7th of the 1st shape in Taskeen altabiaa ?
    		if(indexofits7 == indexofarray2){
    			return true;
    		}
    	}
    	return false;
    	
    }
    
 // Check if the two shapes are Mumtazagee, for the passed shape and the passed 2 dim array /// still one rule to be added
    /**
     * To check if the passed shape do Emazeg the other passed parameter from the Tackht
     * @param shape: the shape to compare by
     * @param TackhtIndex2 : the shape to compare with from the Tackht 2dim array
     * @param index2: the location of the shape in the Tackht 2dim array
     * @return Yes or NO
     */
    public boolean isMummtazagen(int[] shape, int[][] TackhtIndex2, int index2){
    	
    	TaskeenAltabiaa array1 = getTaskeen(shape);
    	TaskeenAltabiaa array2 = getTaskeen(TackhtIndex2,index2);
    	
    	int indexofarray1 = array1.ordinal();
    	int indexofarray2 = array2.ordinal();
    	
    	int indexofits7 = indexofarray1+6;

    	
    	// are the two shapes under the same planet ?
    	if( getPlanet(shape) == getPlanet(TackhtIndex2,index2) ){
    		return true;
    	}else{
    		// if not are the second shape the 7th of the 1st shape in Taskeen altabiaa ?
    		if(indexofits7 == indexofarray2){
    			return true;
    		}
    	}
    	return false;
    	
    }
    
    //get the corresponding Horoscope for the passed shape
    public Horoscope getHoroscope(int[][] Tackht, int index){
    	ShaklName shapeName = getShaklName(Tackht,index);
    	Horoscope result= null;
    	
    	switch(shapeName){
    	case JOOD_LAHO: 		result = Horoscope.ARIES; 		break;
    	
    	case AHYAN: 
    	case ATABA_KHARIGA : 
    							result = Horoscope.SAGITTARIUS; break;
    	
    	case RAIT_FARAH:        result = Horoscope.PISCES;      break;
    	
    	case BAIATH:
    	case TARIQ:
    						    result = Horoscope.CANCER;      break;
    	case NASRA_KHARIGA:
    	case QABTH_DAKHEL:      result = Horoscope.LEO;         break;
    	
    	case NAKI_ALKHAD:       result = Horoscope.LIBRA;       break;
    	case HAMARA:            result = Horoscope.SCORPIO;     break;
    	case INKEES:            result = Horoscope.CAPRICON;    break;
    	case OOKLA:             result = Horoscope.AQUARIUS;    break;
    	
    	case IGTEMAA:
    	case QABTH_KHARIG:      result = Horoscope.GEMINI;      break;
    	
    	case NASRA_DAKHLA:      result = Horoscope.TAURUS;      break;
    	case GAMAAA:            result = Horoscope.VIRGO;       break;
    	
    	}
    	return result;
    }
    
    // is it Dhahek Mutahark?
    public boolean isDhahekMutaharek(int[][] Tackht, int index){
        
    	int [] shape = getShapeArray(getShaklName(Tackht,index));
    	
    	if(shape[0]==0 && shape[1]==0){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    // is it Bak Saken?
    public boolean isBakSaken(int[][] Tackht, int index){
    	int [] shape = getShapeArray(getShaklName(Tackht,index));
    	
    	if(shape[0]==1 && shape[1]==1){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    // is it Dhahek saken?
    public boolean isDhakehSaken(int[][] Tackht, int index){
    	int [] shape = getShapeArray(getShaklName(Tackht,index));
    	
    	if(shape[0]==0 && shape[1]==1){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    // is it Bak Mutaharek?
    public boolean isBakMutaharek(int[][] Tackht, int index){
    	int [] shape = getShapeArray(getShaklName(Tackht,index));
    	
    	if(shape[0]==1 && shape[1]==0){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    // is it in a Wataad?
    public boolean isInWataad(int index){
    	
    	if(index == 0 || index == 3 || index == 6 || index ==9 ||
    	   index == 12 || index == 13 || index == 14 || index == 15){    // this line is the general rule, there is still another Tukhi rule for them
    		return true;
    	}else{
    		return false;
    	}
    	
    }
    
    // is it in mayali alwattad.
   public boolean isInYaliAlwataad(int index){
	   
	   if(index == 1 || index == 4 || index == 7 || index == 12){
		   return true;
	   }else{
		   return false;
	   }
	  
   }
   // is it saket? 
   public boolean isSaket(int index){
	   
	   if(index == 2 || index == 5 || index == 8 || index == 11){
		   return true;
	   }else{
		   return false;
	   }
	   
   }
   
   // get shape element: fire, air, water or earth
   public Elements getShapeElement(int[][] Tackht, int index){
	   
	   Elements currentElement = null;
	   ShaklName shapeName = getShaklName(Tackht,index);
	   
	   switch(shapeName){
	   
		   case AHYAN: 
		   case NASRA_KHARIGA:
		   case JOOD_LAHO:
		   case GAMAAA:
			   				currentElement = Elements.FIRE;  break;
		   
		   case HAMARA:
		   case RAIT_FARAH:
		   case QABTH_DAKHEL:
		   case IGTEMAA:
			   				currentElement = Elements.AIR;   break;
			   				
		   case BAIATH:
		   case ATABA_KHARIGA:
		   case QABTH_KHARIG:
		   case TARIQ:
			   				currentElement = Elements.WATER; break;
			   				
		   case INKEES:
		   case NASRA_DAKHLA:
		   case NAKI_ALKHAD:
		   case OOKLA:
			   				currentElement = Elements.EARTH; break;
	   }
		   
	   return currentElement;
   }
   
   // get the time of the day for the passed shape.
   public TimeOfDay getTimeOfDay(int[][] Tackht, int index){
	   TimeOfDay currentTime = null;
	   ShaklName shapeName = getShaklName(Tackht,index);
	   
	   switch(shapeName){
	   
		   case AHYAN: 					currentTime = TimeOfDay.MORNING;	 break;
		   case NASRA_KHARIGA:			currentTime = TimeOfDay.NOON;		 break;
		   case JOOD_LAHO:				currentTime = TimeOfDay.NOON;		 break;
		   case GAMAAA:					currentTime = TimeOfDay.MORNING;     break;
			  	  	
		   case HAMARA:					currentTime = TimeOfDay.BEFORE_NOON; break;	
		   case RAIT_FARAH:				currentTime = TimeOfDay.BEFORE_NOON; break;	
		   case QABTH_DAKHEL:			currentTime = TimeOfDay.AFTERNOON;   break;
		   case IGTEMAA:				currentTime = TimeOfDay.MORNING;     break;
			      				
		   case BAIATH:					currentTime = TimeOfDay.EVENING;     break;
		   case ATABA_KHARIGA:			currentTime = TimeOfDay.NIGHT;       break;
		   case QABTH_KHARIG:			currentTime = TimeOfDay.AFTERNOON;   break;
		   case TARIQ:					currentTime = TimeOfDay.NOON;        break;
			   		   				
		   case INKEES:					currentTime = TimeOfDay.NIGHT;       break;
		   case NASRA_DAKHLA:			currentTime = TimeOfDay.EVENING;     break;
		   case NAKI_ALKHAD:			currentTime = TimeOfDay.NOON;        break;
		   case OOKLA:					currentTime = TimeOfDay.EVENING;     break;
		   
	   }
	   
	   return currentTime;
	   
   }
   
   // get the region for the corrosponding passed shape.
   public Region getRegion(int[][] Tackht, int index){
	   Region currentRegion = null;
	   ShaklName shapeName = getShaklName(Tackht,index);
	   
	   switch(shapeName){
	   		case JOOD_LAHO: 
	   		case HAMARA:
	   		case OOKLA:
	   							currentRegion = Region.AL_IFRANG;	break;
	   		
	   		case AHYAN:			currentRegion = Region.AL_HEGAZ;    break;
	   					
	   		case RAIT_FARAH:	currentRegion = Region.WEST;		break;
	   					
	   		case BAIATH: 		currentRegion = Region.CHINA;		break;
	   		
	   		case NAKI_ALKHAD:
	   		case NASRA_DAKHLA:
	   							currentRegion = Region.AL_ROOM;		break;
	   		case ATABA_KHARIGA:
	   							currentRegion = Region.AL_KHARAB;   break;
	   		case INKEES:
	   							currentRegion = Region.INDIA;		break;
	   		case NASRA_KHARIGA:
	   		case QABTH_DAKHEL:
	   							currentRegion = Region.AL_TURK;		break;
	   		case IGTEMAA:
	   		case GAMAAA:
	   							currentRegion = Region.EGYPT;		break;
	   							
	   		case TARIQ:			currentRegion = Region.AL_BEHAR;	break;
	   		
	   		case QABTH_KHARIG:  currentRegion = Region.AL_GEBAL;	break;	   					
	   }	
	   return currentRegion;
   }
   
   // Check if the passed shape is in the passed tackht
   public boolean isShapeInTackht(int[] shape, int[][] Tackht){
	   int matchingCounter = 0;
           
	   for(int i=0; i<16; i++){
		for(int j=0; j<4; j++){
                    
                   if(shape[j] == Tackht[i][j]){
			  matchingCounter++;
		   }else{
			  matchingCounter--;
		   }  
                   if(matchingCounter==4)
                       break;
                }		   
	   }
           
           if(matchingCounter == 4)
              return true; 
           else
               return false;
   }
   
   // Check if a specific index in tackht got another location in Tackht
   public boolean isShapeInTackht(int[][] Tackht,int index){
	   int matchingCounter = 0;
           
	   for(int i=0; i<16; i++){
               if(i==index) break;
		for(int j=0; j<3; j++){
                   if(Tackht[index][j] == Tackht[i][j]){
			  matchingCounter++;
		   }else{
			  matchingCounter--;
		   }  
                }		   
	   }
           if(matchingCounter == 4)
              return true; 
           else
               return false;
   }
   
   
   // Check the location of the passed shape in the passed Tackht, YOU SHOULD MAKE SURE FIRST USING THE PREVIOUS METHOD THAT IT IS THERE
   public int getShapeLocationInTackht(int[] shape, int[][] Tackht){
      	   int resultIndex = 0;
           
	   for(int i=0; i<16; i++){
		for(int j=0; j<3; j++){
                   if(shape[i] == Tackht[i][j])
			  resultIndex= i;
                }		   
	   }
           return resultIndex;
   }
   
    // Check the location of the passed shape in the passed Tackht, YOU SHOULD MAKE SURE FIRST USING THE PREVIOUS METHOD THAT IT IS THERE
   public int getShapeLocationInTackht(int[][] Tackht, int index){
      	   int resultIndex = 0;
           
	   for(int i=0; i<16; i++){
               if(i ==  index) break;
		for(int j=0; j<3; j++){
                   if(Tackht[index][j] == Tackht[i][j])
			  resultIndex= i;
                }		   
	   }
           return resultIndex;
   }
   
      // Check if the shape at specific index equals to some shape
   public boolean isShapeAtIndexEqualsShakl(int[][] Tackht, int index, ShaklName Shakl){
	   
	   if(getShaklName(Tackht,index) == Shakl ){
		return true;   
	   }else{
		   return false;
	   }
   }
   
   // Check if the Passed shape from tacket is male?
   public boolean isShapeAtIndexMale(int[][] Tackht, int index){
       if(getShapeElement(Tackht, index) == Elements.FIRE 
               || getShapeElement(Tackht, index) == Elements.AIR){
          return true; 
       }else{
          return false;
       }
   }
   
   // minus the given int by a specific number until there is no more to minus.
   public int minusMinus(int x,int minser){
       int result = x;
       
       while(true){
          result-= minser;
          
          if(result <= minser)
          break;
       }
       
       return result;   
   }
   
}

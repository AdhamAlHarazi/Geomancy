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
public class Answers {
	 
	// ---------------Inner class for General questions that doesn't fit other inner classes.---------------------------------//
	public class GeneralQs{
		
		// is the Raml results true of false
		public String isRamlTrue(int[][] Tackht){
                    
			int product[] = rM.mult_4IndexesAndMultProductOf2(Tackht, 3-G, 5-G, 11-G, 15-G);
			
                        if(rM.isShapeInTackht(product, Tackht))
                            return "صحيحة";
                        else
                            return "غير صحيحة";
		}
		
		// Aqebat AL-Raml
		public String Aqebat_Alraml(int[][] Tackht){
                    
			RMethods.cBoolean result = null;
			int product[] = rM.mult_4IndexesAndMultProductOf2(Tackht, 1-G, 12-G, 8-G, 9-G);
			
			result = rM.isSaad_Nahs_MSaad_MNahs(product);
			
			if(result == RMethods.cBoolean.M_NAHS )
                            return "عاقبة الرمل هي ممتزجة نحسة";
                        else if(result == RMethods.cBoolean.M_SAAD)
                            return "عاقبة الرمل هي ممتزجة سعدة";
                        else if(result == RMethods.cBoolean.NAHS)
                            return "عاقبة الرمل هي نحسة";
                        else if(result == RMethods.cBoolean.SAAD)
                            return "عاقبة الرمل هي سعدة";
                        else
                        return "لا اعلم" ;
                        
		}
                
                // is the question for the questioner or for another one.
		public String isTheQForTheQuestionarOrNot(int[][] Tackht){
			
			 int[] result = rM.mult_4IndexesAndMultProductOf2(Tackht, 1-G, 7-G, 3-G, 14-G);
			 
			 if(rM.isShapeInTackht(result, Tackht))
                             return "نعم";
                         else
                             return "لا";
		}
                
                // does secret stays secret?
                public String isSecretStaysSo(int[][] Tackht){
                    if(rM.isSaad(Tackht, 14-G) && rM.isSaad(Tackht, 15-G)){

                        if( (rM.isDakhel(Tackht, 14-G) || rM.isThabit(Tackht, 14-G))
                         || (rM.isDakhel(Tackht, 15-G) || rM.isThabit(Tackht, 15-G)) ){

                            return "نعم";

                        }else
                            return "لا";
                    }else{
                        return "لا";
                    }    
                }
                
                // does comer good
                public String isComerGood(int[][] Tackht){
                    if(rM.isSaad(rM.multIndexByIndex(Tackht, 1-G, 4-G)))
                        return "القادم خيرا";
                        
                    else if(rM.isNahs(rM.multIndexByIndex(Tackht, 1-G, 4-G)))
                        return "القادم شرا";
                        
                    else
                        return "القادم وسطا";
                }
                
                // في خير اليوم وشرة    
                public String isTodayGood(int[][] Tackht){
                    int[] outCome = new int[4];
                    outCome = rM.multIndexByShape(Tackht, 7-G,rM.getShapeArray(RMethods.ShaklName.INKEES) );
                    
                    if(rM.isSaad(outCome))
                        return "اليوم سعيد";
                    else if(rM.isNahs(outCome))
                        return "اليوم نحس";
                    else 
                        return "اليوم ممتزج";
                }
                
                //  مايحصل للسائل في يومة
                public String WhatHappenToAskerToday(int[][] Tackht){
                    int[] outCome = new int[4];
                    outCome = rM.multIndexByIndex(Tackht, 1-G, 7-G);
                    
                    if(rM.isSaad(outCome))
                        return "حصل له الخير في يومه";
                    else if(rM.isNahs(outCome))
                        return "حصل كدر";
                    else 
                        return "لاهذا ولا ذاك حالة ممتزجة";
                    
                }
                
                     //لسان الأمر
                public String lessanAlamr(int[][] Tackht){
                    int[] outCome = new int[4];
                    outCome = rM.multIndexByIndex(Tackht, 5-G, 9-G);
                    int outComeLocation=0;
                    
                    if(rM.isSaad(outCome)){
                        
                         if(rM.isShapeInTackht(outCome, Tackht)){
                            outComeLocation = rM.getShapeLocationInTackht(outCome, Tackht);
                         }  
                         
                        if(rM.isInWataad(outComeLocation))
                            return "قضى في الحال";
                        else if(rM.isInYaliAlwataad(outComeLocation))
                            return "يقضى في المستقبل";
                        else
                            return "غير مبرمجه";
                    }else{
                        return "غير مبرمجة";
                    }
                   
                }   
                
                //هل الخبر الشائع صحيح
                public String isNewsTrue(int[][] Tackht){
                    
                    if(rM.isDakhel(Tackht, 1-G) || rM.isThabit(Tackht, 1-G))
                        return "الخبر صحيح";
                    else if(rM.isKhareg(Tackht, 1-G) || rM.isMunqalib(Tackht, 1-G))
                        return "الخبر كذب";
                    else
                        return "لا أعلم";
                }
                
                //هل الخبر الشائع صحيح2
                public String isNewsTrue2(int[][] Tackht){
                    int sumOfDots = 0;
                    int result=0;
                    int[] iIndex = {1-G,9-G,10-G,13-G};
                    
                    for(int i=0; i<4; i++){
                        for(int j=0; j<4; j++){
                             sumOfDots+= Tackht[iIndex[i]][j];
                       
                        }
                    }
                    
                    sumOfDots+=9;
                    result = rM.minusMinus(sumOfDots, 8);
                    
                    if((result %2 == 0 ))
                        return "الخبر صحيح";
                    else
                        return "الكبر كذب";
                }
                 //هل الخبر الشائع صحيح3
                public String isNewsTrue3(int[][] Tackht){
                    RMethods.ShaklName sName = rM.getShaklName(Tackht, 1-G);
                    
                    if(sName == RMethods.ShaklName.BAIATH
                       ||sName == RMethods.ShaklName.HAMARA
                       ||sName == RMethods.ShaklName.QABTH_DAKHEL
                       ||sName == RMethods.ShaklName.NASRA_DAKHLA
                       ||sName == RMethods.ShaklName.NASRA_KHARIGA
                       || sName ==RMethods.ShaklName.IGTEMAA)
                        return "ماوصل إليك حق";
                    else if(sName == RMethods.ShaklName.TARIQ
                            || sName == RMethods.ShaklName.RAIT_FARAH
                            || sName == RMethods.ShaklName.JOOD_LAHO
                            || sName == RMethods.ShaklName.NAKI_ALKHAD)
                        return "بعضه صدق وبعضة كذب";
                    else if(sName == RMethods.ShaklName.GAMAAA
                            || sName == RMethods.ShaklName.AHYAN
                            || sName == RMethods.ShaklName.INKEES)
                        return "مبالغا في الأمر دون ماوصل إليك";
                    else 
                        // العقلة أو القبض الخارج أو العتبة الخارجة
                        return "كل ماوصل إليك باطل";
                        
                }
                
                // هل المتهم برئ
                public String isAccusedInnocent(int[][] Tackht){
                    
                    if(rM.isMummtazagen(Tackht, 11-G, Tackht, 5-G))
                        return "المتهم برئ";
                    else if(rM.isMummtazagen(Tackht, 11-G, Tackht, 6-G))
                            return "أحكم بالتهمة";
                    else
                        return "لا أعلم";
                            
                }
                
                //لمعرفة الحق من الباطل من هو صاحب الحق السائل أم المسئول
                public String whoIsRight(int[][] Tackht){
                    
                    if(rM.isSaad(Tackht, 13-G) && rM.isSaad(Tackht, 14-G))
                        return "الإثنان على حق يبدوا أن هناك خطأ في الرمل والله أعلم";
                    else if(rM.isSaad(Tackht, 13-G))
                        return "السائل على حق";
                    else if(rM.isSaad(Tackht, 14-G))
                        return "المسئول على حق";
                    else
                        return "لا أعلم";
                }   
                
                
                //الكرب يزول أم لا
                public String isSadnessOut(int[][] Tackht){
                    int[] outCome = new int[4];
                    int duration=0;
                    
                    outCome = rM.multIndexByIndex(Tackht, 6-G, 12-G);
                    duration = rM.getTaskeenAlAdad(outCome);
                    
                    if(rM.isSaad(outCome))
                        return "يوم"+duration+"زال في ";
                    else if(rM.isNahs(outCome))
                        return "يوم"+duration+"طال في ";
                    else
                        return "يوم"+duration+"زال بعد مدة";
                }
                
                
	}
	
	// ---------------Inner class for marriage related questions. ------------------------------------------------------------//
	public class Zawag{
		
		// Does the marriage happens or not.
		public String DoesTheMarriageHappens_R1(int[][] Tackht){
			
			int[] result = rM.multIndexByIndex(Tackht, 9-G, 11-G);
			
			if(rM.isMummtazagen(result, Tackht, 9-G))
                            return "نعم";
                        else
                            return "لا";
		}
                
                // Does the marriage happens or not.
		public String DoesTheMarriageHappens_R2(int[][] Tackht){
			
			int[] result = rM.multIndexByIndex(Tackht, 1-G, 7-G);
                        result = rM.multIndexByShape(Tackht, 5-G, result);
			
			if(rM.isSaad(result))
                            return "نعم";
                        else
                            return "لا";
		}
	
		// Do couple agree, (for both before and after the are married Questions) rule 1
		public String DoCouplesAgree_R1(int[][] Tackht){
			RMethods.cBoolean result = null;
			
			result = rM.isSaad_Nahs_MSaad_MNahs(Tackht, 3-G);
                        
                        if(result == RMethods.cBoolean.M_NAHS)
                              return "نتيحة الإتفاق هي ممتزجه نحسه";
                        else if (result == RMethods.cBoolean.M_SAAD)
                             return "نتيحة الإتفاق هي ممتزجه سعده";
                        else if(result == RMethods.cBoolean.NAHS)
                             return "نتيحة الإتفاق هي نحسه";
                        else if(result == RMethods.cBoolean.SAAD)
                             return "نتيحة الإتفاق هي سعده";
			else
                            return "لا اعلم";
		
		}
	
		// Do couple agree, (for both before and after the are married Questions) rule 2
		public String DoCouplesAgree_R2(int[][] Tackht){
			RMethods.cBoolean result = null;
			
			int[] re = new int[4];
			re = rM.mult_4IndexesAndMultProductOf2(Tackht, 4-G, 11-G, 7-G, 14-G);
			
			result = rM.isSaad_Nahs_MSaad_MNahs(re);
                        
                        if(result == RMethods.cBoolean.M_NAHS)
                              return "نتيحة الإتفاق هي ممتزجه نحسه";
                        else if (result == RMethods.cBoolean.M_SAAD)
                             return "نتيحة الإتفاق هي ممتزجه سعده";
                        else if(result == RMethods.cBoolean.NAHS)
                             return "نتيحة الإتفاق هي نحسه";
                        else if(result == RMethods.cBoolean.SAAD)
                             return "نتيحة الإتفاق هي سعده";
			else
                            return "لا اعلم";
			
		}
		
		// Does the husband marry/sleep with another woman
		public String isHusbandCheater(int[][] Tackht){
			
			RMethods.ShaklName product = rM.getShaklName(rM.multIndexByIndex(Tackht, 7-G, 9-G));
			
			if(product == RMethods.ShaklName.NASRA_KHARIGA || product == RMethods.ShaklName.JOOD_LAHO){
				return "نعم";
			}else{
				return "لا";
			}	
		}
		
		// Is she a bitch
		public String isSheBitch(int[][] Tackht){
                    
			String result = "";
			RMethods.ShaklName shaklAt7 = rM.getShaklName(Tackht, 7-G);
			
			if(shaklAt7 == RMethods.ShaklName.NASRA_KHARIGA 
			   || shaklAt7 == RMethods.ShaklName.QABTH_KHARIG
			   || shaklAt7 == RMethods.ShaklName.JOOD_LAHO
                           || shaklAt7 == RMethods.ShaklName.GAMAAA
                           || shaklAt7 == RMethods.ShaklName.TARIQ){
				result = "نعم";
				
			}else if(shaklAt7 == RMethods.ShaklName.NASRA_DAKHLA
					|| shaklAt7 == RMethods.ShaklName.QABTH_DAKHEL
					|| shaklAt7 == RMethods.ShaklName.AHYAN
					|| shaklAt7 == RMethods.ShaklName.IGTEMAA){
				result = "لا";
			}else
                            result = "لا أعلم";
			
			return result;
		}
		
		// Is the divorced women  will return back to her husband    		 // maybe should be added
		public String isDivocredGetBack(int[][] Tackht){
                    
			if( (rM.isShapeOpenAt(Tackht,5-G,3-G) && rM.isShapeOpenAt(Tackht,6-G,3-G) && rM.isShapeOpenAt(Tackht,7-G,3-G))
				|| (rM.isShapeOpenAt(Tackht,8-G,3-G) && rM.isShapeOpenAt(Tackht,9-G,3-G) && rM.isShapeOpenAt(Tackht,11-G,3-G) && rM.isShapeOpenAt(Tackht,15-G,3-G)) ){
				return "نعم";
			}else{
				
				return "لا";
			}
			
		}
		
                
		// Is divorced women and fired servant come back
		// to be coded
		
		// How much does the pregnant women being pregnant in months
		
                // Does Pregnant women have two babies or one baby with additional parts
                public String isEmbryoTwoInPregnantOrAddi_Parts(int[][] Tackht){
                    
                    if(rM.isShapeAtIndexEqualsShakl(Tackht, 6-G, RMethods.ShaklName.GAMAAA) 
                            || rM.isShapeAtIndexEqualsShakl(Tackht, 10-G, RMethods.ShaklName.GAMAAA) ){
                        return "نعم";
                    }else{
                        return "لا";
                    }
                }
		
                // Is the Embryo Male Or Female
                public String isEmbryoMaleOrFemale (int[][] Tackht){
                    
                    if(rM.isShapeAtIndexMale(Tackht, 10-G) == true 
                            && rM.isShapeAtIndexMale(Tackht, 11-G) == true ){
                        return "الجنين ذكر";
                    }else
                        return "الجنين أنثى";
                    
                }
                
                // Is Pregenancy Halal
                public String isPregnancyHalal(int[][] Tackht){
                    
                    if( rM.isSaad(Tackht, 1-G )== true && rM.isSaad(Tackht, 5-G) == true ){
                        return "نعم";
                    }else if (rM.isSaad(Tackht, 1-G )== false && rM.isSaad(Tackht, 5-G) == true){ 
                        return "نعم";
                    }else{
                        return "لا";
                    }
                }
                
             /*   // In which day does the pregnant gives birth
                public RamlMethods.days inWhichDayPregnantGivesBirth(int[][] Tackht){
                    int[][] mothers = new int[4][4];
                    
                    for(int i=0; i<=4; i++){
                      mothers[0][i] = Tackht[1][i];
                         
                    }
                    
                            
                    cTackht.calculateTakht(mothers);
                }
              */
              
                // Will he have a thuriaذرية 
                public String isHeGoingToHaveThuria(int[][] Tackht){
                    
                    int[] outcomeShape = new int[4];
                    int[] finalOutcome = new int[4];
                    // multiplay index by index and save the outcome into outcomeShape
                    outcomeShape = rM.multIndexByIndex(Tackht, 1-G, 7-G);
      
                    finalOutcome =rM.multIndexByShape(Tackht, 5-G, outcomeShape);
                                 
                    if(rM.isDakhel(finalOutcome) == true 
                            || rM.isThabit(finalOutcome) == true){
                        return "نعم";
                    }else{
                        return "لا";
                    }
                }
	}
	
        // ---------------Inner class for Friends related questions. ------------------------------------------------------------//
        
        public class Friends{
                
                // Does good come from your friends?
                public String isFriendGivesGood(int[][] Tackht){
                    
                    int[] outComeShape = new int[4];
                    outComeShape = rM.multIndexByIndex(Tackht, 1-G, 3-G);
                    
                    if(rM.isSaad(outComeShape) == true){
                        return "نعم يأتي منه خير";
                    }else if(rM.isNahs(outComeShape) == true){
                        return "لا يأتي منه خير";
                    }else{
                        return "ربما يأتي من خير";
                    }  
                }
                
                // does your friend loves you?
                public String isFriendLoveYou(int[][] Tackht){
                    
                    if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.JOOD_LAHO
                            || rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.NAKI_ALKHAD)
                        return "ينقلب من حب إلى بغض";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.AHYAN)
                        return "هو لك وأنت علية";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.RAIT_FARAH)
                        return "محبتكما متساوية";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.BAIATH)
                        return "صحبتة رياء وتنقلب إلى عداوة";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.ATABA_KHARIGA)
                        return "صحبتة نكد وشر وهم";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.HAMARA)
                        return "هو محب لك";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.INKEES)
                        return "سيواسيك ويحب غيرك";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.NASRA_DAKHLA
                            || rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.NASRA_KHARIGA)
                        return "هو محب وسيهجرك لو كلمة غير واضحة";
                       
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.OOKLA)
                        return "إنه يبغضك";
                        
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.IGTEMAA
                            || rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.GAMAAA )
                        return "سيفسد حالة من أعداء لكما";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.QABTH_DAKHEL
                            || rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.QABTH_KHARIG )
                        return "محب ولكنه لا ينتفع بك";
                    
                    else if(rM.getShaklName(Tackht, 1-G) == RMethods.ShaklName.TARIQ)
                        return "صحبتة لا خير فيها ولا شر";
                    
                    return "لا أعلم";
                    
                }
                
                
        }
        
        
         // ---------------Inner class for Doyoon related questions. ------------------------------------------------------------//
        public class Doyoon{
                
                // Does debitors pay?
                public String isDebitorPay(int[][] Tackht){
                    int[] outcome = new int[4];
                  

                     outcome = rM.mult_4IndexesAndMultProductOf2(Tackht, 1-G, 7-G, 2-G, 8-G);
                             
                    if(rM.isSaad(Tackht, 8-G) && rM.isNahs(Tackht, 2-G))
                        return "لا يدفع";
                    else if(rM.isSaad(Tackht, 1-G) && rM.isSaad(Tackht, 9-G) && rM.isNahs(Tackht, 2-G) && rM.isSaad(Tackht, 8-G))
                        return "يهب الدين";
                    
                    else if(Tackht[1-G] == Tackht[10-G])
                        return "يرفع الأمر إلى الحاكم";
                    
                    else if(rM.isSaad(outcome))
                        return "القرض حاضرا ويريد المقترض ردة";  
                    
                    else if(rM.isNahs(outcome))
                        return "لا";
                    
                    else if(rM.isMumtazegNahs(outcome))
                        return "ماطل ولا يرد";
                    
                    else if(rM.isMummtazagSaad(outcome))
                        return "يردة بعد المماطلة";
                    
                    else
                        return "لا أعلم";

                }
                
                // does what has been gone come back?
                public String isGoneThingComeBack(int[][] Tackht){
                    int[] outCome = { Tackht[1-G][4-G], Tackht[12-G][4-G], Tackht[7-G][4-G], Tackht[2-G][4-G]};
                    
                    if(rM.isSaad(outCome) && rM.isDakhel(outCome))
                        return "عاد إليك بهناء";
                    
                    else if(rM.isNahs(outCome) && rM.isDakhel(outCome))
                        return "عاد بنكد";
                        
                    else if(rM.isSaad(outCome) && rM.isKhareg(outCome))
                        return "كان الامل ضعيفا في عودتة";
                    
                    else if(rM.isNahs(outCome) && rM.isKhareg(outCome))
                        return "لا يعود";
                    
                    else
                        return "لا أعلم";
                }
                
                // Does Wadiaa وديعة come back?
                public String isWadeaaComeBack(int[][] Tackht){
                    
                    int[] outCome = rM.multIndexByIndex(Tackht, 1-G, 4-G);
                    outCome = rM.multIndexByShape(Tackht, 7-G, outCome);
                    
                    if(rM.isSaad(outCome))
                        return "نعم";
                    else
                        return "لا";
                }
        }
        
        
        // ---------------Inner class for Doyoon related questions. ------------------------------------------------------------//
        public class Trading{
                
            // هل يحصل الربح والرزق
                public String isProfitable(int[][] Tackht){
                    int[] outCome = new int[4];
                    outCome = rM.multIndexByIndex(Tackht, 7-G, 15-G);
                    outCome = rM.multIndexByShape(Tackht, 9-G, outCome);
                    
                    if(rM.isSaad(outCome))
                        return "الربح كثير";
                    else if(rM.isNahs(outCome))
                        return "الربح قليل حجا وربما لايحصل قطعا";
                    else if(rM.isMummtazagSaad(outCome) || rM.isMumtazegNahs(outCome))
                        return "الربح متوسط";
                    else
                        return "لا أعلم";
                }
                
                // هل التجارة خير أو الصنعة
                public String isTradingBetterOrSanaa(int[][] Tackht){
                    int[] outCome = new int[4];
                    outCome = rM.multIndexByIndex(Tackht, 2-G, 10-G);
                    
                    if(rM.isKhareg(outCome) || rM.isMunqalib(outCome))
                        return "التجارة خير";
                    else
                        return "االصنعة خير";
                }
                
                
                // الشراء سعيد أم لا
                public String isBuyingGood(int[][] Tackht){
                    int saad =0;
                    int nahs =0;
                   
                    if(rM.isSaad(Tackht, 1-G))
                        saad++;
                    else
                        nahs++;
                   
                    if(rM.isSaad(Tackht, 3-G))
                        saad++;
                    else
                        nahs++;

                    if(rM.isSaad(Tackht, 6-G))
                        saad++;
                    else
                        nahs++;
                   
                    if(rM.isSaad(Tackht, 8-G))
                        saad++;
                    else
                        nahs++;
                    
                    if(saad > nahs)
                        return "الشراء سعيد";
                    else if (saad == nahs)
                        return "تساوت السعود والنحوس انظر إلى الميزان واحكم بسعده ونحسة";
                    else
                        return "عدم الشراء أفضل";
                    
                        
                }
                
                //المبيع خير أم لا
                public String isSellingGood(int[][] Tackht){
                    
                    if(rM.isSaad(Tackht, 2-G) && rM.isSaad(Tackht, 6-G)
                            && ((rM.isKhareg(Tackht, 2-G) && rM.isKhareg(Tackht, 6-G))
                            ||  (rM.isMunqalib(Tackht, 2-G)&&rM.isMunqalib(Tackht, 6-G))))
                            
                        return "المبيع رابح";
                    
                    else if(rM.isNahs(Tackht, 2-G) && rM.isNahs(Tackht, 6-G))
                        return "المبيع خاسر";
                    
                    else if(rM.isNahs(Tackht, 2-G) && rM.isSaad(Tackht, 6-G)
                            || rM.isSaad(Tackht, 2-G) && rM.isNahs(Tackht, 6-G))
                        return "المبيع متوسط";
                    else
                        return "لا أعلم";
                }
                
             /*   //ما هو مستقبل المعشية
                public String livingFuture(int[][] Tackht){
                    int[] outCome = new int[4];
                    // أفتح ماقفل من الشكل العاشر واقفل ما فتح
                    outCome = rM.multIndexByShape(Tackht, 10-G, (rM.getShapeArray(RMethods.ShaklName.TARIQ)));
                   
                    if(rM.isInWataad(G))
                    return "";
                }
             */
                
                
        }
      
         // ---------------Inner class for Ages related questions. ------------------------------------------------------------//
        public class Ages{
            
            // لمعرفة العمر
                public String askerAge(int[][] Tackht){
                      int[] outCome = new int[4];
                      RMethods.ShaklName shapeName;
                      outCome = rM.multIndexByIndex(Tackht, 6-G, 8-G);
                      shapeName = rM.getShaklName(outCome);
                      
                      String result;
                      
                      switch(shapeName){
                          case NASRA_KHARIGA:
                          case QABTH_KHARIG:
                          case ATABA_KHARIGA:
                             result= "سنة"+"17"+"والمرتبة الصغرى "+"سنة"+"39.5"+"والمرتبة الوسطى "+"سنة"+"120"+"المرتبة الكبرى ";
                             break;
                              
                          case NASRA_DAKHLA:
                          case JOOD_LAHO:
                             result= "سنين"+"8"+"والمرتبة الصغرى "+"سنة"+"45"+"والمرتبة الوسطى "+"سنة"+"82"+"المرتبة الكبرى ";
                             break;
                              
                          case GAMAAA:
                          case IGTEMAA:
                             result= "سنة"+"20"+"والمرتبة الصغرى "+"سنة"+"42"+"والمرتبة الوسطى "+"سنة"+"96"+"المرتبة الكبرى ";
                             break;  
                              
                          case HAMARA:
                          case NAKI_ALKHAD:
                             result= "سنة"+"25"+"والمرتبة الصغرى "+"سنة"+"39.5"+"والمرتبة الوسطى "+"سنة"+"180"+"المرتبة الكبرى ";
                             break;    
                              
                          case INKEES:
                          case OOKLA:
                             result= "سنة"+"30"+"والمرتبة الصغرى "+"سنة"+"44"+"والمرتبة الوسطى "+"سنة"+"57"+"المرتبة الكبرى ";
                             break;         
                          
                          case AHYAN:
                          case QABTH_DAKHEL:
                          case RAIT_FARAH:
                             result= "سنة"+"30"+"والمرتبة الصغرى "+"سنة"+"45"+"والمرتبة الوسطى "+"سنة"+"79"+"المرتبة الكبرى ";
                             break;  
                              
                          case BAIATH:
                          case TARIQ:
                             result= "سنة"+"25.5"+"والمرتبة الصغرى "+"سنة"+"40"+"والمرتبة الوسطى "+"سنة"+"66"+"المرتبة الكبرى ";
                             break;      
                          default:
                              result = "لا أعلم";
                              
                      }
                      return result;
                }
                
                
                //في أي مكان يموت الإنسان
                public String whereIsDeath(int[][] Tackht){
                   RMethods.ShaklName shapeName;
                   shapeName = rM.getShaklName(Tackht, 8-G);
                   String result;
                   
                   switch(shapeName){
                       case AHYAN:
                       case RAIT_FARAH:
                           result = "في البلاد في مكان مثل المسجد أو العبادة أو مكان درس أو في مجلس العلماء";
                           break;
                       case QABTH_DAKHEL:
                           result = "في بلد مع مولة أهل دين وديانة ومعاملة ";
                           break;
                       case QABTH_KHARIG:
                           result = "في القرى أو في الجبال";
                            break;
                       case IGTEMAA:
                       case GAMAAA:   
                           result = "في الزراعات";
                            break;
                       case JOOD_LAHO:
                           result = "ضد المغنيين أو المطربين أو أهل المساخر او محل الشراب";
                           break;
                       case OOKLA:
                           result = "في محل قطاعات الحجر والجبال";
                           break;
                       case INKEES:   
                           result = "في مقام قديم خراب محل الحبس";
                           break;
                       case HAMARA:
                           result = "مكان الخوف أو قطاع الطريق والقلاع وما شابهها";
                           break;
                       case BAIATH:
                           result = "مكان فرح مثل بستان والماء الجاري والأشجار والأنهار";
                           break;
                       case NASRA_KHARIGA:
                           result= "في بلدة كبيرة محل الأمر والنهي والعمران العالية";
                           break;
                       case NASRA_DAKHLA:
                           result = "في محل الملوك والأكابر والماء الجاري او في شارع مزدحم";
                           break;
                       case ATABA_KHARIGA:
                           result = "في موضع خراب وفي مراعي الدواب";
                           break;
                       case NAKI_ALKHAD:
                           result = "في مكان الفرح ومحل العلم والعلوم والنقاشة والأحجار";
                           break;
                       case TARIQ:
                           result = "في مكان مفرح محل الأشجار والأنهار";
                           break;
                       default:
                           result = "لا أعلم";
                   }    
                   return result;
                           
                }
              
                // ماسبب الموت        
                public String deathCause(int[][] Tackht){
                   String result = "";
                   
                   if(rM.isShapeInTackht(Tackht, 8-G)){
                       int secondLocationInTackhet = rM.getShapeLocationInTackht(Tackht, 8-G);
                       
                       switch(secondLocationInTackhet){
                           case 1:
                               result="بسبب نفسة"; 
                               break;
                           case 2:
                               result="بسبب فلوس ومعاملة"; 
                               break;
                           case 3:
                               result="بسبب الأقرباء والإخوان والأخوات";
                               break;
                           case 4:
                               result="بسبب الملك والأرض";
                               break;
                           case 5:
                               result="بسبب المحبين والمعشوقين";
                               break;
                           case 6:
                               result=" بسبب العبيد أو الخدم و الأصحاب";
                               break;
                           case 7:
                               result="من قبل الغريم أو السقوط من شئ مرتفع";
                               break;
                           case 8:
                               result="بسبب الخوف والميراث والخطر";
                               break;
                           case 9:
                               result="بسبب السفر والعلم والتحرير أو القراعة أو الحبس";
                               break;
                           case 10:
                               result="بسبب السلاطين والحكام أو العمل";
                               break;
                           case 11:
                               result="من قبل الأصدقاء والمحبين";
                               break;
                           case 12:
                               result="من قبل العدو والأصحاب";
                               break;
                           case 13:
                               result="بسبب نفسة";
                               break;
                           case 14:
                               result = "بسبب الملك والأرض";
                               break;
                           case 15:
                               result="من قبل الغريم أو السقوط من شئ مرتفع";
                               break;
                           case 16:
                               result="بسبب السلاطين والحكام أو العمل";
                               break;
                           default:
                               result="لا أعلم";
                               break;      
                       }
                       return result;
                   }else
                       return "البيت الثامن غير متكرر في التخت أعد الحساب";
                }
        }        
        public class Muhakamat{
            
            // للمحاكمة عند القاضي هل يكون غالبا أو مغلوبا
            public String isHeWinnerInCourt(int[][] Tackht){
                
                int[] outCome = rM.multIndexByIndex(Tackht, 5-G, 10-G);
                if(rM.isMummtazagen(outCome, Tackht, 5-G))
                    return "كان غالبا";
                else if(rM.isMummtazagen(outCome, Tackht, 10-G))
                    return "كان مغلوبا";
                else 
                    return "أعد حساب الرمل";
                
            }
            
            
            
            
            
            
        }        
          
        
	//----instance variables ------------------------------------------------------------------------------------------------//
	RMethods rM = new RMethods();
	static final int G = 1;
        Tackht cTackht = new Tackht();
}

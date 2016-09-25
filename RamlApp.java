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

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.geometry.NodeOrientation;
import javafx.scene.layout.AnchorPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Border;
import javafx.scene.text.Font;
import javafx.util.Callback;




/**
 *
 * @author Adham
 */
public class RamlApp extends Application {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
         
    }
    
     

    @Override
    public void start(Stage primaryStage) {

        boardBtn.setText("لوح قذف الرمل");
        boardBtn.setLayoutX(100);
        boardBtn.setLayoutY(12);
        getPShapesBtn.setText("استخلاص الأشكال");
         
        donate.setImage(new Image("resources/Donate.png"));
       // donate.setLayoutX(550);
       // donate.setLayoutY(400);
        
        btnTackht.setText("إحتساب التخت بالطريقة القديمة");
        btnTackht.setLayoutX(335);
        btnTackht.setLayoutY(110);
        btnTackht.setPrefWidth(162);
        
        btnTackht2.setText("إحتساب التخت بطريقة الشيخ المحسن");
        btnTackht2.setLayoutX(335);
        btnTackht2.setLayoutY(140);
        
        desc.setLayoutX(180);
        desc.setLayoutY(12);

        comboBoxesSettings();
        
        aPane.getChildren().addAll(combo1,combo2,combo3,combo4);
       // aPane.getStylesheets().add("resources/css.css");
           
        //--------------------------------------------------------------------------------//
        imagesViewsSettings();
        //--------------------------------------------------------------------------------//       
        treesSettings();
    
        //--------------------------------------------------------------------------------//
        answerText.setPrefSize(230, 50);
        answerText.setLayoutX(10);
        answerText.setLayoutY(440);
        answerText.setWrapText(true);
        answerText.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        answerText.setEditable(false);
        //answerText.setFont(Font.font ("Verdana", 14));
        //--------------------------------------------------------------------------------//
        
        questBtn.setText("الإجابة عن سؤال");
        questBtn.setLayoutX(100);
        questBtn.setLayoutY(123);
        // questBtn.setLayoutY(180);
        
        answerBtn.setText("الإجابة");
        answerBtn.setPrefWidth(250);
        answerBtn.setLayoutY(405);
        answerBtn.setBorder(Border.EMPTY);
        //-------------------------------------------------------------------------------//   
        aPane.getChildren().addAll(btnTackht,btnTackht2,questBtn,boardBtn,desc,
                house1,house2,house3,house4,house5,house6,house7,
                house8,house9,house10,house11,house12,house13,
                house14,house15,house16, h1Label, h2Label, h3Label, h4Label, h5Label,
                h6Label, h7Label, h8Label, h9Label, h10Label, h11Label, h12Label,
                h13Label, h14Label, h15Label, h16Label,donate
        );
        
        treePane.getChildren().addAll(tree,answerBtn,answerText);
        boardPane.getChildren().addAll(boardText1,boardText2,boardText3,boardText4,
               boardText5, boardText6, boardText7, boardText8, boardText9, boardText10,
               boardText11,boardText12,boardText13,boardText14,boardText15,boardText16,getPShapesBtn);
        
        //--------------------------------------------------------------------------------//
        primaryStage.setTitle("ضرب التخت لمعرفة ضروب البخت"); 
        primaryStage.getIcons().add(new Image("resources/icon.png"));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        
        btnTackht.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
                // Check if there are any unselected mothers from comboboxes
                if (combo1.getSelectionModel().getSelectedIndex() == -1
                        || combo2.getSelectionModel().getSelectedIndex() == -1
                        || combo3.getSelectionModel().getSelectedIndex() == -1
                        || combo4.getSelectionModel().getSelectedIndex() == -1) {
                    return;

                }
  
                // get the selected item's number from jComboBoxes into the array
                String mothersFromComboBox[] = {combo1.getValue().toString(),
                    combo2.getValue().toString(),
                    combo3.getValue().toString(),
                    combo4.getValue().toString()
                };
                    
                RMethods rM1 = new RMethods();
                int[][] mothers = new int[4][4];

                // get the array by passing the name of the shakl
                for(int i=0; i<=3; i++){
                    switch (mothersFromComboBox[i]){
                        case "جودله":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.JOOD_LAHO); break;
                        case "أحيان":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.AHYAN); break;
                        case "راية فرح":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.RAIT_FARAH); break; 
                        case "البياض":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.BAIATH); break;     
                        case "نقي الخد":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.NAKI_ALKHAD); break;     
                        case "العتبة الخارجة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.ATABA_KHARIGA); break; 
                        case "الحمرة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.HAMARA); break;      
                        case "الأنكيس":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.INKEES); break; 
                        case "نصرة خارجة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.NASRA_KHARIGA); break; 
                        case "العقلة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.OOKLA); break;      
                        case "الإجتماع":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.IGTEMAA); break;      
                        case "نصرة داخلة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.NASRA_DAKHLA); break;      
                        case "الطريق":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.TARIQ); break;      
                        case "القبض الخارج":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.QABTH_KHARIG); break;                    
                        case "الجماعة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.GAMAAA); break;      
                        case "القبض الداخل":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.QABTH_DAKHEL); break;
                        
                            
                    }
                }

             
                // calculate the tackht by passing the mothers array
                NewTackht  = Tackht.calculateTakht(mothers);
                 //int[][] NewTackht  = Tackht.calculateTakht(mothers);
                
                // If the tackht is already calculated then turn the switch on to be used when answring questions
                tackhtOnOff = true;
 
                RMethods.ShaklName sName;
                String imagePath="";
                
                //Image image;// = new Image("");

                String[] pathsArr = new String[16];

                for(int i=0; i<16; i++){
                    sName= rM1.getShaklName(NewTackht,i);

                    switch(sName){
                        case JOOD_LAHO:
                            imagePath="resources/JOOD_LAHO.png"; break;
                        case AHYAN:
                            imagePath="resources/AHYAN.png";break;
                        case RAIT_FARAH:
                            imagePath="resources/RAIT_FARAH.png";break;
                        case BAIATH:
                            imagePath="resources/BAIATH.png";break;
                        case NAKI_ALKHAD:
                            imagePath="resources/NAKI_ALKHAD.png";break;
                        case ATABA_KHARIGA:
                            imagePath="resources/ATABA_KHARIGA.png";break;
                        case HAMARA:
                            imagePath="resources/HAMARA.png";break;
                        case INKEES:
                            imagePath="resources/INKEES.png"; break;     
                        case NASRA_KHARIGA:
                            imagePath="resources/NASRA_KHARIGA.png"; break;
                        case OOKLA:
                            imagePath="resources/OOKLA.png"; break;
                        case IGTEMAA:
                            imagePath="resources/IGTEMAA.png";break;     
                        case NASRA_DAKHLA:
                            imagePath="resources/NASRA_DAKHLA.png"; break;          
                        case TARIQ:
                            imagePath="resources/TARIQ.png";  break;  
                        case QABTH_KHARIG:
                            imagePath="resources/QABTH_KHARIG.png"; break;
                        case GAMAAA:
                            imagePath="resources/GAMAAA.png"; break;  
                        case QABTH_DAKHEL:
                            imagePath="resources/QABTH_DAKHEL.png"; break;
                    }
                    
                    pathsArr[i] =  imagePath;
                }
               
                imageAppearance(pathsArr);
          
            }
        });
        
        btnTackht2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
                // Check if there are any unselected mothers from comboboxes
                if (combo1.getSelectionModel().getSelectedIndex() == -1
                        || combo2.getSelectionModel().getSelectedIndex() == -1
                        || combo3.getSelectionModel().getSelectedIndex() == -1
                        || combo4.getSelectionModel().getSelectedIndex() == -1) {
                    return;

                }
  
                // get the selected item's number from jComboBoxes into the array
                String mothersFromComboBox[] = {combo1.getValue().toString(),
                    combo2.getValue().toString(),
                    combo3.getValue().toString(),
                    combo4.getValue().toString()
                };
                    
                RMethods rM1 = new RMethods();
                int[][] mothers = new int[4][4];

                // get the array by passing the name of the shakl
                for(int i=0; i<=3; i++){
                    switch (mothersFromComboBox[i]){
                        case "جودله":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.JOOD_LAHO); break;
                        case "أحيان":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.AHYAN); break;
                        case "راية فرح":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.RAIT_FARAH); break; 
                        case "البياض":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.BAIATH); break;     
                        case "نقي الخد":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.NAKI_ALKHAD); break;     
                        case "العتبة الخارجة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.ATABA_KHARIGA); break; 
                        case "الحمرة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.HAMARA); break;      
                        case "الأنكيس":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.INKEES); break; 
                        case "نصرة خارجة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.NASRA_KHARIGA); break; 
                        case "العقلة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.OOKLA); break;      
                        case "الإجتماع":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.IGTEMAA); break;      
                        case "نصرة داخلة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.NASRA_DAKHLA); break;      
                        case "الطريق":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.TARIQ); break;      
                        case "القبض الخارج":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.QABTH_KHARIG); break;                    
                        case "الجماعة":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.GAMAAA); break;      
                        case "القبض الداخل":
                            mothers[i] =  rM1.getShapeArray(RMethods.ShaklName.QABTH_DAKHEL); break;
                        
                            
                    }
                }

             
                // calculate the tackht by passing the mothers array
                NewTackht  = Tackht2.calculateTakht(mothers);
                 //int[][] NewTackht  = Tackht.calculateTakht(mothers);
                
                // If the tackht is already calculated then turn the switch on to be used when answring questions
                tackhtOnOff = true;
 
                RMethods.ShaklName sName;
                String imagePath="";
                
                Image image;// = new Image("");

                String[] pathsArr = new String[16];

                for(int i=0; i<16; i++){
                    sName= rM1.getShaklName(NewTackht,i);

                    switch(sName){
                        case JOOD_LAHO:
                            imagePath="resources/JOOD_LAHO.png"; break;
                        case AHYAN:
                            imagePath="resources/AHYAN.png";break;
                        case RAIT_FARAH:
                            imagePath="resources/RAIT_FARAH.png";break;
                        case BAIATH:
                            imagePath="resources/BAIATH.png";break;
                        case NAKI_ALKHAD:
                            imagePath="resources/NAKI_ALKHAD.png";break;
                        case ATABA_KHARIGA:
                            imagePath="resources/ATABA_KHARIGA.png";break;
                        case HAMARA:
                            imagePath="resources/HAMARA.png";break;
                        case INKEES:
                            imagePath="resources/INKEES.png"; break;     
                        case NASRA_KHARIGA:
                            imagePath="resources/NASRA_KHARIGA.png"; break;
                        case OOKLA:
                            imagePath="resources/OOKLA.png"; break;
                        case IGTEMAA:
                            imagePath="resources/IGTEMAA.png";break;     
                        case NASRA_DAKHLA:
                            imagePath="resources/NASRA_DAKHLA.png"; break;          
                        case TARIQ:
                            imagePath="resources/TARIQ.png";  break;  
                        case QABTH_KHARIG:
                            imagePath="resources/QABTH_KHARIG.png"; break;
                        case GAMAAA:
                            imagePath="resources/GAMAAA.png"; break;  
                        case QABTH_DAKHEL:
                            imagePath="resources/QABTH_DAKHEL.png"; break;
                    }
                    
                    pathsArr[i] =  imagePath;
                }
               
                imageAppearance(pathsArr);
                
            }
        });
            
        questBtn.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
                // set the text empty when the Pane launches to clear previously written error text
                answerText.setText("");
                // get the questions & answers Pane and show it
              //  treePane.getStylesheets().add("resources/css.css");
                treeStage.setScene(treeScene);
                treeStage.show();
                treeStage.getIcons().add(new Image("resources/icon.png"));
                treeStage.setResizable(false);
                
            }
            
        });
        
        boardBtn.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
                int prefHeight = 50;
                int yAxis = 40; 
                // set the text empty when the Pane launches to clear previously written error text
                boardText1.setText("");
                boardText2.setText("");
                boardText3.setText("");
                boardText4.setText("");
                boardText1.setOpacity(0.5);
                boardText2.setOpacity(0.5);
                boardText3.setOpacity(0.5);
                boardText4.setOpacity(0.5);
                
               // boardText1.setPrefHeight(prefHeight);
                boardText1.setPrefWidth(409);
                boardText1.setMaxHeight(5);
                boardText1.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText1.setPromptText("للأم الأولى");
                boardText1.setLayoutY(0);
                
                boardText2.setPrefHeight(prefHeight);
                boardText2.setPrefWidth(409);
                boardText2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText2.setLayoutY(yAxis);
                boardText2.setPromptText("للأم الثانية");
                
                
                boardText3.setPrefHeight(prefHeight);
                boardText3.setPrefWidth(409);
                //boardText3.setMaxWidth(409);
                boardText3.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText3.setLayoutY(yAxis*2);
                boardText3.setPromptText("للأم الثالثة");
                
                boardText4.setPrefHeight(prefHeight);
                boardText4.setPrefWidth(409);
                boardText4.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText4.setLayoutY(yAxis*3);
                boardText4.setPromptText("للأم الرابعة");
                
                boardText5.setPrefHeight(prefHeight);
                boardText5.setPrefWidth(409);
                boardText5.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText5.setLayoutY(yAxis*4);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText6.setPrefHeight(prefHeight);
                boardText6.setPrefWidth(409);
                boardText6.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText6.setLayoutY(yAxis*5);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText7.setPrefHeight(prefHeight);
                boardText7.setPrefWidth(409);
                boardText7.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText7.setLayoutY(yAxis*6);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText8.setPrefHeight(prefHeight);
                boardText8.setPrefWidth(409);
                boardText8.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText8.setLayoutY(yAxis*7);
               // boardText5.setPromptText("للأم الرابعة");
               
                boardText9.setPrefHeight(prefHeight);
                boardText9.setPrefWidth(409);
                boardText9.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText9.setLayoutY(yAxis*8);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText10.setPrefHeight(prefHeight);
                boardText10.setPrefWidth(409);
                boardText10.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText10.setLayoutY(yAxis*9);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText11.setPrefHeight(prefHeight);
                boardText11.setPrefWidth(409);
                boardText11.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText11.setLayoutY(yAxis*10);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText12.setPrefHeight(prefHeight);
                boardText12.setPrefWidth(409);
                boardText12.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText12.setLayoutY(yAxis*11);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText13.setPrefHeight(prefHeight);
                boardText13.setPrefWidth(409);
                boardText13.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText13.setLayoutY(yAxis*12);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText14.setPrefHeight(prefHeight);
                boardText14.setPrefWidth(409);
                boardText14.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText14.setLayoutY(yAxis*13);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText15.setPrefHeight(prefHeight);
                boardText15.setPrefWidth(409);
                boardText15.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText15.setLayoutY(yAxis*14);
               // boardText5.setPromptText("للأم الرابعة");
                
                boardText16.setPrefHeight(prefHeight);
                boardText16.setPrefWidth(409);
                boardText16.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
                boardText16.setLayoutY(yAxis*15);
               // boardText5.setPromptText("للأم الرابعة");
               
             //   boardPane.getStylesheets().add("resources/css.css");
                boardStage.setScene(boardScene);
                boardStage.show();
                boardStage.getIcons().add(new Image("resources/icon.png"));
                boardStage.setResizable(true);
                getPShapesBtn.setLayoutX(165);
                getPShapesBtn.setLayoutY(440);
            }            
        });
          
        getPShapesBtn.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {

               
                int[][] manualShakl = new int[4][4];
              
                //====shakl 1
                if (boardText1.getText().length() % 2 == 0) 
                   manualShakl[0][0] = 1;
                else
                   manualShakl[0][0] = 0;
               
                if (boardText2.getText().length() % 2 == 0) 
                   manualShakl[0][1] = 1;
                else 
                   manualShakl[0][1] = 0;
                
                if (boardText3.getText().length() % 2 == 0) 
                   manualShakl[0][2] = 1;
                else
                   manualShakl[0][2] = 0;
                
                if (boardText4.getText().length() % 2 == 0) 
                   manualShakl[0][3] = 1;
                else
                   manualShakl[0][3] = 0;
                
                //====shakl 2
                if (boardText5.getText().length() % 2 == 0) 
                   manualShakl[1][0] = 1;
                else
                   manualShakl[1][0] = 0;
                
                if (boardText6.getText().length() % 2 == 0) 
                   manualShakl[1][1] = 1;
                else
                   manualShakl[1][1] = 0;
                
                if (boardText7.getText().length() % 2 == 0) 
                   manualShakl[1][2] = 1;
                else
                   manualShakl[1][2] = 0;
                
                if (boardText8.getText().length() % 2 == 0) 
                   manualShakl[1][3] = 1;
                else
                   manualShakl[1][3] = 0;
                
                //====shakl 3
                if (boardText9.getText().length() % 2 == 0) 
                   manualShakl[2][0] = 1;
                else
                   manualShakl[2][0] = 0;
                
                if (boardText10.getText().length() % 2 == 0) 
                   manualShakl[2][1] = 1;
                else
                   manualShakl[2][1] = 0;
                
                if (boardText11.getText().length() % 2 == 0) 
                  manualShakl[2][2] = 1;
                else
                  manualShakl[2][2] = 0;
                
                if (boardText12.getText().length() % 2 == 0) 
                  manualShakl[2][3] = 1;
                else
                  manualShakl[2][3] = 0;
                
                //====shakl 4
                if (boardText13.getText().length() % 2 == 0) 
                  manualShakl[3][0] = 1;
                else
                  manualShakl[3][0] = 0;
                
                if (boardText14.getText().length() % 2 == 0) 
                  manualShakl[3][1] = 1;
                else
                  manualShakl[3][1] = 0;
                
                if (boardText15.getText().length() % 2 == 0) 
                  manualShakl[3][2] = 1;
                else
                  manualShakl[3][2] = 0;
                
                if (boardText16.getText().length() % 2 == 0) 
                  manualShakl[3][3] = 1;
                else
                  manualShakl[3][3] = 0;
                
                RMethods rM1 = new RMethods();
                
                NewTackht  = Tackht.calculateTakht(manualShakl);
                
                // If the tackht is already calculated then turn the switch on to be used when answring questions
                tackhtOnOff = true;
 
                RMethods.ShaklName sName;
                String imagePath="";

                String[] pathsArr = new String[16];

                for(int i=0; i<16; i++){
                    sName= rM1.getShaklName(NewTackht,i);

                    switch(sName){
                        case JOOD_LAHO:
                            imagePath="resources/JOOD_LAHO.png"; break;
                        case AHYAN:
                            imagePath="resources/AHYAN.png";break;
                        case RAIT_FARAH:
                            imagePath="resources/RAIT_FARAH.png";break;
                        case BAIATH:
                            imagePath="resources/BAIATH.png";break;
                        case NAKI_ALKHAD:
                            imagePath="resources/NAKI_ALKHAD.png";break;
                        case ATABA_KHARIGA:
                            imagePath="resources/ATABA_KHARIGA.png";break;
                        case HAMARA:
                            imagePath="resources/HAMARA.png";break;
                        case INKEES:
                            imagePath="resources/INKEES.png"; break;     
                        case NASRA_KHARIGA:
                            imagePath="resources/NASRA_KHARIGA.png"; break;
                        case OOKLA:
                            imagePath="resources/OOKLA.png"; break;
                        case IGTEMAA:
                            imagePath="resources/IGTEMAA.png";break;     
                        case NASRA_DAKHLA:
                            imagePath="resources/NASRA_DAKHLA.png"; break;          
                        case TARIQ:
                            imagePath="resources/TARIQ.png";  break;  
                        case QABTH_KHARIG:
                            imagePath="resources/QABTH_KHARIG.png"; break;
                        case GAMAAA:
                            imagePath="resources/GAMAAA.png"; break;  
                        case QABTH_DAKHEL:
                            imagePath="resources/QABTH_DAKHEL.png"; break;
                    }
                    
                    pathsArr[i] =  imagePath;
                }
               
                imageAppearance(pathsArr);
          
            }        
        });
        
        answerBtn.setOnAction(new EventHandler<ActionEvent>() {  
            @Override
            public void handle(ActionEvent event) {
                
                 // Check if there are any unselected mothers from comboboxes
                if (combo1.getSelectionModel().getSelectedIndex() == -1
                        || combo2.getSelectionModel().getSelectedIndex() == -1
                        || combo3.getSelectionModel().getSelectedIndex() == -1
                        || combo4.getSelectionModel().getSelectedIndex() == -1) {
                    answerText.setText("يحب إدخال الأمهات الأربعة لحساب التخت الخاص  بهذه المسألة");
                    return;

                }
                
                // if the Tackht is not yet calculated then fire the button automatically
                if(tackhtOnOff == false){
                     // btnTackht.fire();
                    answerText.setText("يجب إختيار التخت المراد الحساب عليه بالضغط على الزر سواء الطريقة القديمة أو طريقة الشيخ المحسن");
                    return ;
                }
                  
                Answers.GeneralQs replyG = new Answers().new GeneralQs();
                Answers.Zawag replyZ = new Answers().new Zawag();
                Answers.Friends replyF = new Answers().new Friends();
                Answers.Doyoon replyD = new Answers().new Doyoon();
                Answers.Trading replyT = new Answers().new Trading();
                Answers.Ages replyA = new Answers().new Ages();
                Answers.Muhakamat replyM = new Answers().new Muhakamat();

                Object sI = tree.getSelectionModel().getSelectedItem();
                
                // General Questions Below
                if(sI == isRamlTrue)
                     answerText.setText(replyG.isRamlTrue(NewTackht));
                else if(sI == Aqebat_Alraml)
                     answerText.setText(replyG.Aqebat_Alraml(NewTackht));
                else if(sI == isTheQForTheQuestionarOrNot)
                     answerText.setText(replyG.isTheQForTheQuestionarOrNot(NewTackht));
                else if(sI == isSecretStaysSo)
                     answerText.setText(replyG.isSecretStaysSo(NewTackht));
                else if(sI == isComerGood)
                     answerText.setText(replyG.isComerGood(NewTackht));
                else if(sI == isTodayGood)
                     answerText.setText(replyG.isTodayGood(NewTackht));
                else if(sI == WhatHappenToAskerToday)
                     answerText.setText(replyG.WhatHappenToAskerToday(NewTackht));
                else if(sI == lessanAlamr)
                     answerText.setText(replyG.lessanAlamr(NewTackht));
                else if(sI == isNewsTrue)
                     answerText.setText(replyG.isNewsTrue(NewTackht));
                else if(sI == isNewsTrue2)
                     answerText.setText(replyG.isNewsTrue2(NewTackht));
                else if(sI == isNewsTrue3)
                     answerText.setText(replyG.isNewsTrue3(NewTackht));
                else if(sI == isAccusedInnocent)
                     answerText.setText(replyG.isAccusedInnocent(NewTackht)); 
                 else if(sI == whoIsRight)
                     answerText.setText(replyG.whoIsRight(NewTackht));
                 else if(sI == isSadnessOut)
                     answerText.setText(replyG.isSadnessOut(NewTackht));
                
                // Zawag Questions Below
                else if(sI == DoesTheMarriageHappens_R1)
                    answerText.setText(replyZ.DoesTheMarriageHappens_R1(NewTackht));  
                else if(sI == DoesTheMarriageHappens_R2)
                    answerText.setText(replyZ.DoesTheMarriageHappens_R2(NewTackht)); 
                else if(sI == DoCouplesAgree_R1)
                     answerText.setText(replyZ.DoCouplesAgree_R1(NewTackht));
                else if(sI == DoCouplesAgree_R2)
                     answerText.setText(replyZ.DoCouplesAgree_R2(NewTackht));
                else if(sI == isHusbandCheater)
                     answerText.setText(replyZ.isHusbandCheater(NewTackht));
                else if(sI == isSheBitch)
                    answerText.setText(replyZ.isSheBitch(NewTackht));
                //else if(sI == isDivocredGetBack)
                   // answerText.setText(replyZ.isDivocredGetBack(NewTackht));
                else if(sI == isEmbryoTwoInPregnantOrAddi_Parts)
                    answerText.setText(replyZ.isEmbryoTwoInPregnantOrAddi_Parts(NewTackht));
                else if(sI == isEmbryoMaleOrFemale)
                    answerText.setText(replyZ.isEmbryoMaleOrFemale(NewTackht));
                else if(sI == isPregnancyHalal)
                    answerText.setText(replyZ.isPregnancyHalal(NewTackht));
                else if(sI == isHeGoingToHaveThuria)
                    answerText.setText(replyZ.isHeGoingToHaveThuria(NewTackht));
                
                // Friends Questions
                else if(sI == isFriendGivesGood)
                    answerText.setText(replyF.isFriendGivesGood(NewTackht));
                else if(sI == isFriendLoveYou)
                    answerText.setText(replyF.isFriendLoveYou(NewTackht));


                // Doyoon Questions
                else if(sI == isDebitorPay)
                    answerText.setText(replyD.isDebitorPay(NewTackht));
                else if(sI == isGoneThingComeBack)
                    answerText.setText(replyD.isGoneThingComeBack(NewTackht));
                else if(sI == isWadeaaComeBack)
                    answerText.setText(replyD.isWadeaaComeBack(NewTackht));  
                
                // Trading Questions
                else if(sI == isProfitable)
                    answerText.setText(replyT.isProfitable(NewTackht));
                else if(sI == isTradingBetterOrSanaa)
                    answerText.setText(replyT.isTradingBetterOrSanaa(NewTackht));
                else if(sI == isBuyingGood)
                    answerText.setText(replyT.isBuyingGood(NewTackht));
                else if(sI == isSellingGood)
                    answerText.setText(replyT.isSellingGood(NewTackht));
                
               // Ages Questions  
                else if(sI == askerAge)
                    answerText.setText(replyA.askerAge(NewTackht));
                else if(sI == whereIsDeath)
                    answerText.setText(replyA.whereIsDeath(NewTackht));
                else if(sI == deathCause)
                    answerText.setText(replyA.deathCause(NewTackht));
               
                // Muhakamat Questions
                else if(sI == isHeWinnerInCourt)
                    answerText.setText(replyM.isHeWinnerInCourt(NewTackht));
 
            }
            
        });
        
       
    }

  
    
    // Set the combo boxes setting and layout method
    public void comboBoxesSettings(){

        comboBoxSetItems(combo1);
        comboBoxSetItems(combo2);
        comboBoxSetItems(combo3);
        comboBoxSetItems(combo4);
        
        combo1.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        combo2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        combo3.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        combo4.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
    
        combo1.setLayoutX(550-(70*1.9));
       // combo1.setLayoutY(50);
        combo1.setLayoutY(60);
   
        combo2.setLayoutX(combo1.getLayoutX()-(70*1.9));
        combo2.setLayoutY(60);
        
        combo3.setLayoutX(combo2.getLayoutX()-(70*1.9));
        combo3.setLayoutY(60);
        
        combo4.setLayoutX(combo3.getLayoutX()-(70*1.9));
        combo4.setLayoutY(60); 
       
    }
    
   // Set the combo box items and images method
    public void comboBoxSetItems(ComboBox combo){
        
         combo.getItems().addAll(
           new Browser( "جودله", new Image("resources/JOOD_LAHO.png")),
           new Browser("أحيان", new Image("resources/AHYAN.png")),
           new Browser("راية فرح", new Image("resources/RAIT_FARAH.png")),
           new Browser("البياض", new Image("resources/BAIATH.png")),
           new Browser("نقي الخد", new Image("resources/NAKI_ALKHAD.png")),
           new Browser("العتبة الخارجة", new Image("resources/ATABA_KHARIGA.png")),
           new Browser("الحمرة", new Image("resources/HAMARA.png")),
           new Browser("الأنكيس", new Image("resources/INKEES.png")),
           new Browser("نصرة خارجة", new Image("resources/NASRA_KHARIGA.png")),
           new Browser("العقلة", new Image("resources/OOKLA.png")),
           new Browser("الإجتماع", new Image("resources/IGTEMAA.png")),
           new Browser("نصرة داخلة", new Image("resources/NASRA_DAKHLA.png")),
           new Browser("الطريق", new Image("resources/TARIQ.png")),
           new Browser("القبض الخارج", new Image("resources/QABTH_KHARIG.png")),
           new Browser("الجماعة", new Image("resources/GAMAAA.png")),
           new Browser("القبض الداخل", new Image("resources/QABTH_DAKHEL.png")));
        
         combo.setCellFactory(new Callback<ListView<Browser>,ListCell<Browser>>(){
            @Override
            public ListCell<Browser> call(ListView<Browser> p) {
             return new ListCell<Browser>(){
             private final ImageView view;
                { 
                           view = new ImageView();
                }
                @Override
                protected void updateItem(Browser item, boolean empty) {
                           super.updateItem(item, empty);

                           if (item == null || empty) {
                               setGraphic(null);
                               setText(null);
                           } else {
                               view.setImage(item.getIcon());
                               setGraphic(view);
                               //view.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
                               setText(item.getName());
                           }
                      }
               };

            }   
        });
         
         combo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Browser>(){
 
            @Override
            public void changed(ObservableValue<? extends Browser> ov, Browser t, Browser t1) {
                String browserName = t1.getName();
                Image browserIcon = t1.getIcon();
                // do whatever you need with the browserName and icon...
            }
        });
        
    }
    
    // Set the Tackht Images settings
    public void imagesViewsSettings(){
        int y1 = 190;
        int x1 = 390;
        int xoffset = 80;
        
        
        house1.setLayoutX(x1);
        house1.setLayoutY(y1);
        h1Label.setLayoutX(x1+25);
        h1Label.setLayoutY(y1+12);
        
        house2.setLayoutX(x1-xoffset);
        house2.setLayoutY(y1);
        h2Label.setLayoutX(x1-xoffset+25);
        h2Label.setLayoutY(y1+12);
        
        house3.setLayoutX(x1-(xoffset*2));
        house3.setLayoutY(y1);
        h3Label.setLayoutX(x1-(xoffset*2)+25);
        h3Label.setLayoutY(y1+12);
        
        
        house4.setLayoutX(x1-(xoffset*3));
        house4.setLayoutY(y1);
        h4Label.setLayoutX(x1-(xoffset*3)+25);
        h4Label.setLayoutY(y1+12);
        
        //----------------------------
        house5.setLayoutX(x1);
        house5.setLayoutY(y1+60);
        h5Label.setLayoutX(x1+25);
        h5Label.setLayoutY(y1+60+12);
        
        house6.setLayoutX(x1-xoffset);
        house6.setLayoutY(y1+60);
        h6Label.setLayoutX(x1-xoffset+25);
        h6Label.setLayoutY(y1+60+12);
        
        house7.setLayoutX(x1-(xoffset*2));
        house7.setLayoutY(y1+60);
        h7Label.setLayoutX(x1-(xoffset*2)+25);
        h7Label.setLayoutY(y1+60+12);
        
        house8.setLayoutX(x1-(xoffset*3));
        house8.setLayoutY(y1+60);
        h8Label.setLayoutX(x1-(xoffset*3)+25);
        h8Label.setLayoutY(y1+60+12);
        
        //------------------------------
        house9.setLayoutX(x1);
        house9.setLayoutY(y1+120);
        h9Label.setLayoutX(x1+25);
        h9Label.setLayoutY(y1+120+12);
        
        house10.setLayoutX(x1-xoffset);
        house10.setLayoutY(y1+120);
        h10Label.setLayoutX(x1-xoffset+25);
        h10Label.setLayoutY(y1+120+12);
        
        house11.setLayoutX(x1-(xoffset*2));
        house11.setLayoutY(y1+120);
        h11Label.setLayoutX(x1-(xoffset*2)+25);
        h11Label.setLayoutY(y1+120+12);
        
        house12.setLayoutX(x1-(xoffset*3));
        house12.setLayoutY(y1+120);
        h12Label.setLayoutX(x1-(xoffset*3)+25);
        h12Label.setLayoutY(y1+120+12);
        //---------------------------------  
        house13.setLayoutX(270);
        house13.setLayoutY(y1+180);
        h13Label.setLayoutX(270+25);
        h13Label.setLayoutY(y1+180+12);
        //----------------------------------   
        house14.setLayoutX(270);
        house14.setLayoutY(y1+240);
        h14Label.setLayoutX(270+25);
        h14Label.setLayoutY(y1+240+12);
        //----------------------------------
        house15.setLayoutX(270);
        house15.setLayoutY(y1+300);
        h15Label.setLayoutX(270+25);
        h15Label.setLayoutY(y1+300+12);
        
        //----------------------------------
        house16.setLayoutX(270);
        house16.setLayoutY(y1+360);
        h16Label.setLayoutX(270+25);
        h16Label.setLayoutY(y1+360+12);
        
    }
    
    // Set the Image appearnces
    public void imageAppearance(String[] pathsArr){
        
        Image image;
        image = new Image(pathsArr[0]);
        
        house1.setImage(image);
        h1Label.setText("1");

        image = new Image(pathsArr[1]);
        house2.setImage(image);
        h2Label.setText("2");

        image = new Image(pathsArr[2]);
        house3.setImage(image);
        h3Label.setText("3");

        image = new Image(pathsArr[3]);
        house4.setImage(image);
        h4Label.setText("4");

        image = new Image(pathsArr[4]);
        house5.setImage(image);
        h5Label.setText("5");

        image = new Image(pathsArr[5]);
        house6.setImage(image);
        h6Label.setText("6");

        image = new Image(pathsArr[6]);
        house7.setImage(image);
        h7Label.setText("7");

        image = new Image(pathsArr[7]);
        house8.setImage(image);
        h8Label.setText("8");

        image = new Image(pathsArr[8]);
        house9.setImage(image);
        h9Label.setText("9");

        image = new Image(pathsArr[9]);
        house10.setImage(image);
        h10Label.setText("10");

        image = new Image(pathsArr[10]);
        house11.setImage(image);
        h11Label.setText("11");

        image = new Image(pathsArr[11]);
        house12.setImage(image);
        h12Label.setText("12");

        image = new Image(pathsArr[12]);
        house13.setImage(image);
        h13Label.setText("13");

        image = new Image(pathsArr[13]);
        house14.setImage(image);
        h14Label.setText("14");

        image = new Image(pathsArr[14]);
        house15.setImage(image);
        h15Label.setText("15");

        image = new Image(pathsArr[15]);
        house16.setImage(image);
        h16Label.setText("16");
        
    }
    
    // Make the trees settings
    public void treesSettings(){
        
        tree.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        tree.setOpacity(0.8);
        tree.setPrefHeight(400);
        tree.setPrefWidth(250);
        rootItem.setExpanded(true);

        rootItem.getChildren().add(generalQuest);
        generalQuest.getChildren().add(isRamlTrue);
        generalQuest.getChildren().add(Aqebat_Alraml);
        generalQuest.getChildren().add(isTheQForTheQuestionarOrNot);
        generalQuest.getChildren().add(isSecretStaysSo);
        generalQuest.getChildren().add(isComerGood);
        generalQuest.getChildren().add(isTodayGood);
        generalQuest.getChildren().add(WhatHappenToAskerToday);
        generalQuest.getChildren().add(lessanAlamr);
        generalQuest.getChildren().add(isNewsTrue);
        generalQuest.getChildren().add(isNewsTrue2);
        generalQuest.getChildren().add(isNewsTrue3);
        generalQuest.getChildren().add(isAccusedInnocent);
        generalQuest.getChildren().add(whoIsRight);
        generalQuest.getChildren().add(isSadnessOut);

        rootItem.getChildren().add(zawagTree);
        zawagTree.getChildren().add(DoesTheMarriageHappens_R1);
        zawagTree.getChildren().add(DoesTheMarriageHappens_R2);
        zawagTree.getChildren().add(DoCouplesAgree_R1);
        zawagTree.getChildren().add(DoCouplesAgree_R2);
        zawagTree.getChildren().add(isHusbandCheater);
        zawagTree.getChildren().add(isSheBitch);
        zawagTree.getChildren().add(isEmbryoTwoInPregnantOrAddi_Parts);
        zawagTree.getChildren().add(isEmbryoMaleOrFemale);
        zawagTree.getChildren().add(isPregnancyHalal);
        zawagTree.getChildren().add(isHeGoingToHaveThuria);

        rootItem.getChildren().add(friendsTree);
        friendsTree.getChildren().add(isFriendGivesGood);
        friendsTree.getChildren().add(isFriendLoveYou);

        rootItem.getChildren().add(doyoonTree);
        doyoonTree.getChildren().add(isDebitorPay);
        doyoonTree.getChildren().add(isGoneThingComeBack);
        doyoonTree.getChildren().add(isWadeaaComeBack);
        rootItem.getChildren().add(Trading);
        Trading.getChildren().add(isProfitable);
        Trading.getChildren().add(isTradingBetterOrSanaa);
        Trading.getChildren().add(isBuyingGood);
        Trading.getChildren().add(isSellingGood);

        rootItem.getChildren().add(Ages);
        Ages.getChildren().add(askerAge);
        Ages.getChildren().add(whereIsDeath);
        Ages.getChildren().add(deathCause);
        rootItem.getChildren().add(Muhakamat);
        Muhakamat.getChildren().add(isHeWinnerInCourt);


    }
    
    public void tackhtModel(){
        
    }
   
        boolean tackhtOnOff = false;

        AnchorPane aPane = new AnchorPane();

        Scene scene = new Scene(aPane, 550, 610);

        int[][] NewTackht = new int[16][4];

        AnchorPane treePane = new AnchorPane();
        Scene treeScene = new Scene(treePane, 240, 500);
        Stage treeStage = new Stage();

        AnchorPane boardPane = new AnchorPane();
        Scene boardScene = new Scene(boardPane, 400, 470);
        Stage boardStage = new Stage();

        Button boardBtn = new Button();
        Button btnTackht = new Button();
        Button btnTackht2 = new Button();
        Button getPShapesBtn = new Button();
        Button questBtn = new Button();
        Button answerBtn = new Button();

        Label desc= new Label("أدخل الأمهات الأربعة يدويا أو بإستخدام لوح القذف");
        ImageView donate = new ImageView();

        ImageView house1 = new ImageView();
        Label h1Label = new Label();
        ImageView house2 = new ImageView();
        Label h2Label = new Label();
        ImageView house3 = new ImageView();
        Label h3Label = new Label();
        ImageView house4 = new ImageView();
        Label h4Label = new Label();
        ImageView house5 = new ImageView();
        Label h5Label = new Label();
        ImageView house6 = new ImageView();
        Label h6Label = new Label();
        ImageView house7 = new ImageView();
        Label h7Label = new Label();
        ImageView house8 = new ImageView();
        Label h8Label = new Label();
        ImageView house9 = new ImageView();
        Label h9Label = new Label();
        ImageView house10 = new ImageView();
        Label h10Label = new Label();
        ImageView house11 = new ImageView();
        Label h11Label = new Label();
        ImageView house12 = new ImageView();
        Label h12Label = new Label();
        ImageView house13 = new ImageView();
        Label h13Label = new Label();
        ImageView house14 = new ImageView();
        Label h14Label = new Label();
        ImageView house15 = new ImageView();
        Label h15Label = new Label();
        ImageView house16 = new ImageView();
        Label h16Label = new Label();

         //----comboBoxes -------------------------------------//
        ComboBox<Browser> combo1 = new ComboBox();
        ComboBox<Browser> combo2 = new ComboBox();
        ComboBox<Browser> combo3 = new ComboBox();
        ComboBox<Browser> combo4 = new ComboBox();

        TextArea boardText1 = new TextArea();
        TextArea boardText2 = new TextArea();
        TextArea boardText3 = new TextArea();
        TextArea boardText4 = new TextArea();
        TextArea boardText5 = new TextArea();
        TextArea boardText6 = new TextArea();
        TextArea boardText7 = new TextArea();
        TextArea boardText8 = new TextArea();
        TextArea boardText9 = new TextArea();
        TextArea boardText10 = new TextArea();
        TextArea boardText11 = new TextArea();
        TextArea boardText12 = new TextArea();
        TextArea boardText13 = new TextArea();
        TextArea boardText14 = new TextArea();
        TextArea boardText15 = new TextArea();
        TextArea boardText16 = new TextArea();
        

        TextArea answerText = new TextArea();

        TreeItem<String> rootItem = new TreeItem<>("الأسئلة");
        TreeView<String> tree = new TreeView<> (rootItem);

        TreeItem<String> generalQuest = new TreeItem<>("اسئلة عامة");
        TreeItem<String> isRamlTrue = new TreeItem<>("هل الرمل صحيح");
        TreeItem<String> Aqebat_Alraml = new TreeItem<>("ماهي عاقبة الرمل");
        TreeItem<String> isTheQForTheQuestionarOrNot = new TreeItem<>("هل السؤال للسائل");
        TreeItem<String> isSecretStaysSo = new TreeItem<>("هل السر يبقى سرا");
        TreeItem<String> isComerGood = new TreeItem<>("هل القادم خير");
        TreeItem<String> isTodayGood = new TreeItem<>("هل اليوم خير");
        TreeItem<String> WhatHappenToAskerToday = new TreeItem<>("ماذا يحصل للسائل اليوم");
        TreeItem<String> lessanAlamr = new TreeItem<>("لسان الأمر");
        TreeItem<String> isNewsTrue = new TreeItem<>("هل الخبر الشائع صحيح وجه أول");
        TreeItem<String> isNewsTrue2 = new TreeItem<>("هل الخبر الشائع صحيح وجه ثاني");
        TreeItem<String> isNewsTrue3 = new TreeItem<>("هل الخبر الشائع صحيح وجه ثالث");
        TreeItem<String> isAccusedInnocent = new TreeItem<>("هل المتهم برئ");
        TreeItem<String> whoIsRight = new TreeItem<>("من على حق السائل أم المسئول");
        TreeItem<String> isSadnessOut = new TreeItem<>("الكرب يزول أم لا");

        //-----------------------------------------------------------------------------------
        TreeItem<String> zawagTree = new TreeItem<>("أسئلة الزواج");
        TreeItem<String> DoesTheMarriageHappens_R1 = new TreeItem<>(" الزواج يحصل أم لا وجه أول");
        TreeItem<String> DoesTheMarriageHappens_R2 = new TreeItem<>("الزواج يحصل أم لا وجه ثاني");
        TreeItem<String> DoCouplesAgree_R1 = new TreeItem<>("هل يتفق الزوجان وجه أول ");
        TreeItem<String> DoCouplesAgree_R2 = new TreeItem<>("هل يتفق الزوجان وجه ثاني");
        TreeItem<String> isHusbandCheater = new TreeItem<>("هل الزوج ينكح غير زوجته أم لا");
        TreeItem<String> isSheBitch = new TreeItem<>("المرأة زانية أم لا");
                    //TreeItem<String> isDivocredGetBack = new TreeItem<String> ("المطلقة هل يردها زوجها وهل ترجع أم لا"); 
        //zawagTree.getChildren().add(isDivocredGetBack);
        TreeItem<String> isEmbryoTwoInPregnantOrAddi_Parts = new TreeItem<>("هل هي حامل بإثنين");
        TreeItem<String> isEmbryoMaleOrFemale = new TreeItem<>("هل الجنين ذكر أم أنثى");
        TreeItem<String> isPregnancyHalal = new TreeItem<>("هل الحمل من حلال أو حرام");
        TreeItem<String> isHeGoingToHaveThuria = new TreeItem<>("الذرية تكون أم لا");

        //--------------------------------------------------------------------------------
        TreeItem<String> friendsTree = new TreeItem<>("اسئلة الأصدقاء");
        TreeItem<String> isFriendGivesGood = new TreeItem<>("هل يأتي من الصديق خير");
        TreeItem<String> isFriendLoveYou = new TreeItem<>("هل صديقك يحبك");
                //---------------------------------------------------------------------------------
        TreeItem<String> doyoonTree = new TreeItem<>("اسئلة الديون");
        TreeItem<String> isDebitorPay = new TreeItem<>("هل يدفع المديون ماعلية");
        TreeItem<String> isGoneThingComeBack = new TreeItem<>("لإعادة ماخرج هل يرجع أم لا");
        TreeItem<String> isWadeaaComeBack = new TreeItem<>("هل ترجع الوديعة أم لا");

                //-----------------------------------------------------------------------------------
        TreeItem<String> Trading = new TreeItem<>("اسئلة التجارة");
        TreeItem<String> isProfitable = new TreeItem<>("هل يحصل الربح والرزق");
        TreeItem<String> isTradingBetterOrSanaa = new TreeItem<>(" هل التجارة خير أو الصنعة");
        TreeItem<String> isBuyingGood = new TreeItem<>("الشراء سعيد أم ل");
        TreeItem<String> isSellingGood = new TreeItem<>("المبيع خير أم لا");

                //-------------------------------------------------------------------------------------
        TreeItem<String> Ages = new TreeItem<>("اسئلة الأعمار");
        TreeItem<String> askerAge = new TreeItem<>("لمعرفة العمر لوح الأعمار");
        TreeItem<String> whereIsDeath = new TreeItem<>("في أي مكان يموت الإنسان");
        TreeItem<String> deathCause = new TreeItem<>("ماسبب الموت");
                //----------------------------------------------------------------------------------------
        TreeItem<String> Muhakamat = new TreeItem<>("اسئلة المحاكمات");
        TreeItem<String> isHeWinnerInCourt = new TreeItem<>("للمحاكمة عند القاضي هل يكون غالبا أو مغلوبا");

        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dndcharactersheethelper;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 *
 * @author software
 */
public class FXMLDocumentController implements Initializable {
    
    Player player = new Player();
    Random rand = new Random();
    int[] scores= new int[6]; 
    
    
    @FXML    
    private Label label;
    @FXML
    private Label instru;
    @FXML
    private Label scorLab1;
    @FXML
    private Label scorPoint1; 
    @FXML
    private Label scorLab2;
    @FXML
    private Label scorPoint2;
    @FXML
    private Label scorLab3;
    @FXML
    private Label scorPoint3;
    @FXML
    private Label scorLab4;
    @FXML
    private Label scorPoint4;
    @FXML
    private Label scorLab5;
    @FXML
    private Label scorPoint5;
    @FXML
    private Label scorLab6;
    @FXML
    private Label scorPoint6;
    @FXML
    private Button button;
    @FXML
    private Button reset;
    @FXML
    private Button confAtr;
    @FXML
    private AnchorPane abilityScore, test;
    @FXML
    private Button strBut;
    @FXML
    private Button dexBut;
    @FXML
    private Button conBut;
    @FXML
    private Button intBut;
    @FXML
    private Button wisBut;
    @FXML
    private Button chaBut;
    @FXML
    private Label str;
    @FXML
    private Label dex;
    @FXML
    private Label con;
    @FXML
    private Label intel;
    @FXML
    private Label wis;
    @FXML
    private Label cha;
    
    int index = 0;
    
    public void changeLabel(int i){
        switch(i){
            case 0:
                scorLab1.setVisible(false);
                scorPoint1.setVisible(false);
                scorPoint2.setVisible(true);
                break;
            case 1:
                scorLab2.setVisible(false);
                scorPoint2.setVisible(false);
                scorPoint3.setVisible(true);
                break;
            case 2:
                scorLab3.setVisible(false);
                scorPoint3.setVisible(false);
                scorPoint4.setVisible(true);
                break;
            case 3:
                scorLab4.setVisible(false);
                scorPoint4.setVisible(false);
                scorPoint5.setVisible(true);
                break;
            case 4:
                scorLab5.setVisible(false);
                scorPoint5.setVisible(false);
                scorPoint6.setVisible(true);
                break;
            case 5:
                scorLab6.setVisible(false);
                scorPoint6.setVisible(false);
                abilityScore.setVisible(false);
                break;
        } 
    }        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        label.setText("Your Ability Scores");
        for (int i =0;i<6;i++){
            scores[i]=(8+rand.nextInt(11));            
        }
        scorLab1.setText(String.valueOf(scores[0]));
        scorLab2.setText(String.valueOf(scores[1]));
        scorLab3.setText(String.valueOf(scores[2]));
        scorLab4.setText(String.valueOf(scores[3]));
        scorLab5.setText(String.valueOf(scores[4]));
        scorLab6.setText(String.valueOf(scores[5]));
        button.setVisible(false);
        reset.setVisible(true);
        confAtr.setVisible(true);
    }
    
    @FXML
    private void handleResetAction(ActionEvent event) {
        for (int i =0;i<6;i++){
            scores[i]=(8+rand.nextInt(11));
        }
        scorLab1.setText(String.valueOf(scores[0]));
        scorLab2.setText(String.valueOf(scores[1]));
        scorLab3.setText(String.valueOf(scores[2]));
        scorLab4.setText(String.valueOf(scores[3]));
        scorLab5.setText(String.valueOf(scores[4]));
        scorLab6.setText(String.valueOf(scores[5]));
    }
    
    @FXML
    private void handleConfirmAction(ActionEvent event) {
        reset.setVisible(false);
        confAtr.setVisible(false);
        strBut.setVisible(true);
        dexBut.setVisible(true);
        conBut.setVisible(true);
        intBut.setVisible(true);
        wisBut.setVisible(true);
        chaBut.setVisible(true);
        label.setVisible(false);
        instru.setVisible(true);
        scorPoint1.setVisible(true);
    }
    
    @FXML
    private void handleStrButAction(ActionEvent event) {
        player.setStr(scores[index]);
        this.changeLabel(index);
        strBut.setVisible(false);
        str.setText(String.valueOf(player.getStr()));
        str.setVisible(true);
        index++;
    }
    @FXML
    private void handleDexButAction(ActionEvent event) {
        player.setDex(scores[index]);
        this.changeLabel(index);
        dexBut.setVisible(false);
        dex.setText(String.valueOf(player.getDex()));
        dex.setVisible(true);
        index++;
    }
    @FXML
    private void handleConButAction(ActionEvent event) {
        player.setCon(scores[index]);
        this.changeLabel(index);
        conBut.setVisible(false);
        con.setText(String.valueOf(player.getCon()));
        con.setVisible(true);
        index++;
    }
    @FXML
    private void handleIntButAction(ActionEvent event) {
        player.setInt(scores[index]);
        this.changeLabel(index);
        intBut.setVisible(false);
        intel.setText(String.valueOf(player.getInt()));
        intel.setVisible(true);
        index++;
    }
    @FXML
    private void handleWisButAction(ActionEvent event) {
        player.setWis(scores[index]);
        this.changeLabel(index);
        wisBut.setVisible(false);
        wis.setText(String.valueOf(player.getWis()));
        wis.setVisible(true);
        index++;
    }
    @FXML
    private void handleChaButAction(ActionEvent event) {
        player.setCha(scores[index]);
        this.changeLabel(index);
        chaBut.setVisible(false);
        cha.setText(String.valueOf(player.getCha()));
        cha.setVisible(true);
        index++;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

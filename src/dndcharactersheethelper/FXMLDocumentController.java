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
    
    Creature bob = new Creature();
    Random rand = new Random();
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    
    @FXML    
    private Label label;
    public Label laba;
    public Label labb; 
    public Label labc;
    public Label labd;
    public Label labe;
    public Label labf;
    public Button button;
    public Button reset;
    public Button confAtr;
    public AnchorPane abilityScore, test;
            
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!"); 
        label.setText("Your Attributes");
       
        a=(8+rand.nextInt(11));
        b=(8+rand.nextInt(11));
        c=(8+rand.nextInt(11));
        d=(8+rand.nextInt(11));
        e=(8+rand.nextInt(11));
        f=(8+rand.nextInt(11));
        
        laba.setText(String.valueOf(a));
        labb.setText(String.valueOf(b));
        labc.setText(String.valueOf(c));
        labd.setText(String.valueOf(d));
        labe.setText(String.valueOf(e));
        labf.setText(String.valueOf(f));
        button.setVisible(false);
        reset.setVisible(true);
        confAtr.setVisible(true);
    }
    
    @FXML
    private void handleResetAction(ActionEvent event) {
        a=(8+rand.nextInt(11));
        b=(8+rand.nextInt(11));
        c=(8+rand.nextInt(11));
        d=(8+rand.nextInt(11));
        e=(8+rand.nextInt(11));
        f=(8+rand.nextInt(11));
        
        laba.setText(String.valueOf(a));
        labb.setText(String.valueOf(b));
        labc.setText(String.valueOf(c));
        labd.setText(String.valueOf(d));
        labe.setText(String.valueOf(e));
        labf.setText(String.valueOf(f));
        
    }
    
    @FXML
    private void handleConfirmAction(ActionEvent event) {
        abilityScore.setVisible(false);
        test.setVisible(true);
    }
    
    @FXML
    public void setStrAtr(ActionEvent e){
        System.out.println("Str Set");
       // bob.setStr();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

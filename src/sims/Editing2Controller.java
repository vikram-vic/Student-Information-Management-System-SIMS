/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sims;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


import javafx.scene.input.MouseEvent;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;





/**
 * FXML Controller class
 *
 * @author VIC's
 */
public class Editing2Controller implements Initializable 
{

  
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        SPass.requestFocus();
        chzPostSSDwn();
        //IdFld.setStyle("-fx-border-color: #ff2323; -fx-text-fill: white; -fx-prompt-text-fill: white;"); when error occurs or not filled
        SBrd.setTooltip(new Tooltip("eg. state"));
        HBrd.setTooltip(new Tooltip("eg. state"));
        
        int a = i;
        
    }  
    
    
    @FXML
    private Pane Edit2;
    
    
    @FXML
    public static Label BtnTo1;
    
    public void toEdit1(MouseEvent event)
     {  
        try 
        {
            Parent editPag1 = FXMLLoader.load(getClass().getResource("Editing1.fxml"));
            Scene editPg1Scene = new Scene(editPag1);
            Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            appStage.setScene(editPg1Scene);
            appStage.show();
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            
        }
    }

    
    
    
    @FXML
    private Label BtnTo3;  
    
    public void toEdit3(MouseEvent event)
    {
        try 
        {
            Parent editPag1 = FXMLLoader.load(getClass().getResource("Editing3.fxml"));
            Scene editPg1Scene = new Scene(editPag1);
            Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            appStage.setScene(editPg1Scene);
            appStage.show();
        } 
        catch (Exception ex) 
          {
            ex.printStackTrace();
          }
    }
    public static int i;
    public int a;
    
    public  void disableGrad()
    {
        if(a == 2)
        {
           PPane.setDisable(true);
           EPane.setDisable(false);
        }
        
        if(a == 1)
        {
           EPane.setDisable(true);
           PPane.setDisable(false);
        }
    }
    
    @FXML
    private Label bck;
    
    public void bck2HP(MouseEvent event)
    {
        try 
        {
            Parent editPag1 = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene editPg1Scene = new Scene(editPag1);
            Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            appStage.setScene(editPg1Scene);
            appStage.show();
        } 
        catch (Exception ex) 
          {
            ex.printStackTrace();
          }
    }
    
    

    /////////////////////////////////////////////Secondary School Fields
    @FXML
    private JFXTextField SPentg;
    public JFXTextField getSPentg() {
        return SPentg;
    }

    public void setSPentg(JFXTextField SPentg) {
        this.SPentg = SPentg;
    }

    @FXML
    private JFXTextField SRoll;
    public JFXTextField getSRoll() {
        return SRoll;
    }

    public void setSRoll(JFXTextField SRoll) {
        this.SRoll = SRoll;
    }

    @FXML
    private JFXTextField SMed;
    public JFXTextField getSMed() {
        return SMed;
    }

    public void setSMed(JFXTextField SMed) {
        this.SMed = SMed;
    }

    @FXML
    private JFXTextField SSch;
    public JFXTextField getSSch() {
        return SSch;
    }

    public void setSSch(JFXTextField SSch) {
        this.SSch = SSch;
    }

    @FXML
    private JFXTextField SBrd;
    public JFXTextField getSBrd() {
        return SBrd;
    }

    public void setSBrd(JFXTextField SBrd) {
        this.SBrd = SBrd;
    }

    @FXML
    private JFXTextField SCity;
    public JFXTextField getSCity() {
        return SCity;
    }

    public void setSCity(JFXTextField SCity) {
        this.SCity = SCity;
    }

    @FXML
    private JFXTextField SPass;
    public JFXTextField getSPass() {
        return SPass;
    }

    public void setSPass(JFXTextField SPass) {
        this.SPass = SPass;
    }
    
    
    ///////////////////////////////////High School Fields/////////////////////////
    
    @FXML
    private MenuButton PostSS;
    
    public MenuButton getPostSS() {
        return PostSS;
    }

    public void setPostSS(MenuButton PostSS) {
        this.PostSS = PostSS;
    }
    
    @FXML
    private Pane HPane;
    
    
    @FXML
    private JFXTextField HPass;
    public JFXTextField getHPass() {
        return HPass;
    }

    public void setHPass(JFXTextField HPass) {
        this.HPass = HPass;
    }
    
    @FXML
    private JFXTextField HBrd;
    public JFXTextField getHBrd() {
        return HBrd;
    }

    public void setHBrd(JFXTextField HBrd) {
        this.HBrd = HBrd;
    }
    
    @FXML
    private JFXTextField HMed;
    public JFXTextField getHMed() {
        return HMed;
    }

    public void setHMed(JFXTextField HMed) {
        this.HMed = HMed;
    }

    @FXML
    private JFXTextField HCity;
    public JFXTextField getHCity() {
        return HCity;
    }

    public void setHCity(JFXTextField HCity) {
        this.HCity = HCity;
    }
    

    @FXML
    private JFXTextField HSch;
    public JFXTextField getHSch() {
        return HSch;
    }

    public void setHSch(JFXTextField HSch) {
        this.HSch = HSch;
    }
    
    @FXML
    private JFXTextField HPentg;
    public JFXTextField getHPentg() {
        return HPentg;
    }

    public void setHPentg(JFXTextField HPentg) {
        this.HPentg = HPentg;
    }
    
    @FXML
    private JFXTextField HRoll;
    public JFXTextField getHRoll() {
        return HRoll;
    }

    public void setHRoll(JFXTextField HRoll) {
        this.HRoll = HRoll;
    }
    
    
    
    @FXML
    private MenuItem HSSC;
    
    
    public MenuItem getHSSC() {
        return HSSC;
    }

    public void setHSSC(MenuItem HSSC) {
        this.HSSC = HSSC;
    }
    
    
    public void chzPostSSDwn()
    {
                
       HSSC.setOnAction(new EventHandler<ActionEvent>() 
       {
            public void handle(ActionEvent t) 
            {
                PostSS.setText("  HSSC");
                DPane.setVisible(false);
                HPane.setVisible(true);
            }
       }
       );
       
       
       DIPLOMA.setOnAction(new EventHandler<ActionEvent>() 
       {
            public void handle(ActionEvent t) 
            {
                PostSS.setText("  DIPLOMA");
                HPane.setVisible(false);
                DPane.setVisible(true);
            }
       }
       );
    }
    
    ////////////////////////// Diploma Fields //////////////////////
    
    @FXML
    private Pane DPane;
    
    @FXML
    private MenuItem DIPLOMA;
    
    @FXML
    private MenuButton DSem;
    
    @FXML
    private JFXTextField DPentg;
        
    
    @FXML
    private JFXTextField DCrs;
    
    public MenuItem getDIPLOMA() {
        return DIPLOMA;
    }

    public void setDIPLOMA(MenuItem DIPLOMA) {
        this.DIPLOMA = DIPLOMA;
    }

    public MenuButton getDSem() {
        return DSem;
    }

    public void setDSem(MenuButton DSem) {
        this.DSem = DSem;
    }

    public JFXTextField getDPentg() {
        return DPentg;
    }

    public void setDPentg(JFXTextField DPentg) {
        this.DPentg = DPentg;
    }

    public JFXTextField getDCrs() {
        return DCrs;
    }

    public void setDCrs(JFXTextField DCrs) {
        this.DCrs = DCrs;
    }
    
    ////////////////////////////Engineering Fields/////////////////////
        
    @FXML
    private static Pane EPane;
    public Pane getEPane() {
        return EPane;
    }

    public void setEPane(Pane EPane) {
        this.EPane = EPane;
    }
    
    @FXML
    private JFXTextField EPentg;
    
    @FXML
    private MenuButton ESem;
    
     public JFXTextField getEPentg() {
        return EPentg;
    }

    public void setEPentg(JFXTextField EPentg) {
        this.EPentg = EPentg;
    }

    public MenuButton getESem() {
        return ESem;
    }

    public void setESem(MenuButton ESem) {
        this.ESem = ESem;
    }
    
    /*public void createESem()
    {
        
        
        
    }*/
       

    //////////////////////////////////////Postgraduation Fields///////////////////////////
      
    @FXML
    private static Pane PPane;

    public Pane getPPane() {
        return PPane;
    }

    public void setPPane(Pane PPane) {
        this.PPane = PPane;
    }
    
    @FXML
    private JFXTextField PPentg; 
    
    @FXML
    private MenuButton PSem;
     
    public JFXTextField getPPentg() {
        return PPentg;
    }

    public void setPPentg(JFXTextField PPentg) {
        this.PPentg = PPentg;
    }

    public MenuButton getPSem() {
        return PSem;
    }

    public void setPSem(MenuButton PSem) {
        this.PSem = PSem;
    }

    
    
}

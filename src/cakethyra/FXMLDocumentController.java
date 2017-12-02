/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakethyra;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {
  @FXML
    private JFXCheckBox kue1;

    @FXML
    private JFXCheckBox kue2;

    @FXML
    private JFXCheckBox kue3;

    @FXML
    private Label hargakue13;

    @FXML
    private JFXCheckBox kue4;

    @FXML
    private Label hargakue12;

    @FXML
    private JFXCheckBox kue5;

    @FXML
    private JFXCheckBox kue6;

    @FXML
    private Label hargakue12111;

    @FXML
    private JFXCheckBox kue7;

    @FXML
    private JFXCheckBox kue8;

    @FXML
    private JFXTextField jumlah1;

    @FXML
    private JFXTextField jumlah2;

    @FXML
    private JFXTextField jumlah3;

    @FXML
    private JFXTextField jumlah4;

    @FXML
    private JFXTextField jumlah8;

    @FXML
    private JFXTextField jumlah7;

    @FXML
    private JFXTextField jumlah6;

    @FXML
    private JFXTextField jumlah5;

    @FXML
    private Button btnCetak1;

    @FXML
    private JFXTextField inAn;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private Label total;

    @FXML
    private JFXTextField jumlahUang;

    @FXML
    private Button btnCetak;

    @FXML
    private Label hargakue;

    @FXML
    private Label hargakue1;

    @FXML
    private Label hargakue11;

    @FXML
    private Label hargakue121;

    @FXML
    private Label hargakue1211;
    
    @FXML
    private Button hapus;

            
    int jumlahbrownies, jumlahsusdonat;
    int hagatotal1,hagatotal2,hagatotal3,hagatotal4,hagatotal5,hagatotal6,hagatotal7,hagatotal8;
    String menu1, menu2, menu3, menu4,menu5,menu6,menu7,menu8;
    String menu="";
    String atasnama, tampilTotalBayar, ket;
    int harga, kembalian;
    int totalbayar, jmlUangBayar;



    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Hitung(ActionEvent event)  {
        if(kue1.isSelected()){     
            harga = 10000;
            menu += kue1.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah1.getText());
            hagatotal1=harga*jumlahbrownies;
            System.out.println(hagatotal1);
        }
        if(kue2.isSelected()){     
            harga = 25000;
            menu += kue2.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah2.getText());
            hagatotal2=harga*jumlahbrownies;
            System.out.println(hagatotal2);
        }
        if(kue3.isSelected()){     
            harga = 15000;
            menu += kue3.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah3.getText());
            hagatotal3=harga*jumlahbrownies;
            System.out.println(hagatotal3);
        }
        if(kue4.isSelected()){     
            harga = 15000;
            menu += kue4.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah4.getText());
            hagatotal4=harga*jumlahbrownies;
            System.out.println(hagatotal4);
        }
        if(kue5.isSelected()){     
            harga = 30000;
            menu += kue5.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah5.getText());
            hagatotal5=harga*jumlahbrownies;
            System.out.println(hagatotal5);
        }
        if(kue6.isSelected()){     
            harga = 5000;
            menu += kue6.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah6.getText());
            hagatotal6=harga*jumlahbrownies;
            System.out.println(hagatotal6);
        }
        if(kue7.isSelected()){     
            harga = 5000;
            menu += kue7.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah7.getText());
            hagatotal7=harga*jumlahbrownies;
            System.out.println(hagatotal7);
        }
        if(kue8.isSelected()){     
            harga = 5000;
            menu += kue8.getText()+", ";
            jumlahbrownies=Integer.parseInt(jumlah8.getText());
            hagatotal8=harga*jumlahbrownies;
            System.out.println(hagatotal8);
        }
        totalbayar = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5+hagatotal6+hagatotal7+hagatotal8;
        tampilTotalBayar=String.valueOf(totalbayar);
        total.setText(tampilTotalBayar);
    }

    @FXML
    private void CetakPemesan(ActionEvent event) throws IOException {
        try {
           if (radio1.isSelected()) {
            ket = "Packing";
        } else if (radio2.isSelected()) {
            ket = "On Plate";
        } else {
            ket = "";
        }
        atasnama = inAn.getText();
        jmlUangBayar = Integer.parseInt(jumlahUang.getText());
        kembalian = jmlUangBayar - totalbayar;
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Nota.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            FXMLNotaController kirim = new FXMLNotaController();
            kirim = fxmlLoader.getController();
            kirim.dataterima(atasnama,menu,ket,totalbayar,jmlUangBayar,kembalian);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("ThyraBakery");
            stage.show();
             
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    }

    }
    
         

    

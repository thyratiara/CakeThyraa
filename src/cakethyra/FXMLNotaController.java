/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakethyra;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLNotaController implements Initializable {

    @FXML
    private TextArea hasilPesanan;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void dataterima(String atasnama,String menu,String ket,int totalbayar,int jmlUangBayar,int kembalian){
        hasilPesanan.setText(""+"Nama Pemesanan: " + atasnama + "\n" + "Menu yang Dipesan : "  + menu +"\n" + "Keterangan : " + ket + "\n" + 
                "Total Pembayaran : Rp. " + totalbayar + "\n" + "Jumlah Uang yang Dibayar : Rp. "
                + jmlUangBayar + "\n" + "Uang Kembali : Rp. " + kembalian);
    }

    
}

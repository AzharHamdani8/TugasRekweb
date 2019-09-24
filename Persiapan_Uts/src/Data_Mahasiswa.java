
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.chart.PieChart.Data;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Data_Mahasiswa extends JFrame  {
   private JLabel lblNama, lblAlamat, lblGender;
    private JTextField textNama;
    private JRadioButton L, P;
    private JPanel jp;
    private JTextArea textAlm;
    
    
    public Data_Mahasiswa(){
        lblNama = new JLabel();
        lblNama.setText("Nama: ");
        textNama = new JTextField();
        textNama.setColumns (10);
        lblAlamat = new JLabel();
        lblAlamat.setText("Alamat: ");
        textAlm = new JTextArea();
        textAlm.setColumns (14);
        textAlm.setRows(3);
        lblGender = new JLabel();
        lblGender.setText("Gender: ");
        L = new JRadioButton("L");
        P = new JRadioButton("P");
        jp = new JPanel();
        
        this.getContentPane().add(jp, BorderLayout.NORTH);
        jp.add(lblNama);
        jp.add(textNama);
        jp.add(lblAlamat);
        jp.add(textAlm);
        jp.add(lblGender);
        jp.add(L);
        jp.add(P);

        
        
    }
}

   
    
    
    


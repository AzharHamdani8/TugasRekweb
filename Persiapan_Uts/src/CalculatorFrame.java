/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class CalculatorFrame extends JFrame {
    private JComboBox jcb;
    private JLabel num1,num2,num3,num4;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JTextField txt1;
    private JTextField txt2;
    private JCheckBox ckc;
    private JPanel jp;
    private ButtonGroup bg;
   
    
    public CalculatorFrame(){
        num1 = new JLabel();
        num1.setText("Num 1: ");
        num2 = new JLabel();
        num2.setText("Num 2: ");
        jcb = new JComboBox();
        rb1 = new JRadioButton("1");
        rb2 = new JRadioButton("2");
        rb3 = new JRadioButton("3");
        num3 = new JLabel();
        num3.setText("+");
        txt1 = new JTextField("");
        txt1.setColumns(6);
        num4 = new JLabel();
        num4.setText("-");
        txt2 = new JTextField();
        txt2.setColumns(6);
        ckc = new JCheckBox();
        jp = new JPanel();
        for (int i = 0; i < 6; i++) {
            jcb.addItem(i);
        }
        //button grouping agar dapat memilih salah satu buttongroup
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        
        //kelas yg sedaang aktif
        this.getContentPane().add(jp, BorderLayout.NORTH);
        //susunan UI
        jp.add(num1);
        jp.add(jcb);
         jp.add(num2);
        jp.add(rb1);
        jp.add(rb2);
         jp.add(rb3);
         jp.add(num3);
        jp.add(txt1);
        jp.add(ckc);
        jp.add(num4);
        jp.add(txt2);
        
        //memberi perilaku
    }
}
    


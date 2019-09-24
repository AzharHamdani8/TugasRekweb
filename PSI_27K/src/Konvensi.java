
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
public class Konvensi extends JFrame{
    private JButton btn1;
    private JTextField txt1;
    private JTextField txt2;
    private JPanel p1;


public Konvensi () {
    btn1 = new JButton ("Konversi");
    txt1 = new JTextField();
    txt2 = new JTextField(); 
    txt1.setColumns(5);
    txt2.setColumns(5);
    p1 =  new JPanel  ();
    btn1.setBackground(Color.red);
    
    this.setTitle("Konvensi Test");
    
    this.getContentPane() .add(p1, BorderLayout.NORTH);
    
    p1.add(txt1);
    p1.add(txt2);
    p1.add(btn1);
    
    
    
    
    
    
    btn1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        clikButton(e);
    }

        private void clikButton(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
            });
}
}




package ConvertKapasitas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class FrmKapasitas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblGb;
	private JTextField txtGB;
	private JTextField txtMB;
	double g, m;
	private JLabel lblIcon;

	/**
	 * Create the frame.
	 */
	public FrmKapasitas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblGb = new JLabel("GB :");
		lblGb.setForeground(Color.WHITE);
		lblGb.setFont(new Font("Serif", Font.BOLD, 12));
		lblGb.setBounds(139, 51, 46, 14);
		contentPane.add(lblGb);

		JLabel lblMb = new JLabel("MB :");
		lblMb.setForeground(Color.WHITE);
		lblMb.setFont(new Font("Serif", Font.BOLD, 12));
		lblMb.setBounds(139, 99, 46, 14);
		contentPane.add(lblMb);

		txtGB = new JTextField();
		txtGB.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		txtGB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double hasil = Double.parseDouble(txtGB.getText()) * 1024;
				txtMB.setText("" + hasil);
			}
		});
		txtGB.setBounds(175, 48, 145, 20);
		contentPane.add(txtGB);
		txtGB.setColumns(10);

		txtMB = new JTextField();
		txtMB.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		txtMB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double hasil = Double.parseDouble(txtMB.getText()) / 1024;
				txtGB.setText("" + hasil);
			}
		});
		txtMB.setBounds(175, 96, 145, 20);
		contentPane.add(txtMB);
		txtMB.setColumns(10);
		
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(FrmKapasitas.class.getResource("/ConvertKapasitas/com.png")));
		lblIcon.setBounds(88, 11, 362, 291);
		contentPane.add(lblIcon);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmKapasitas frame = new FrmKapasitas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

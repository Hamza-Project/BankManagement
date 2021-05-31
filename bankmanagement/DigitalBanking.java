package bankmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalBanking {

	private JFrame frmBankManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalBanking window = new DigitalBanking();
					window.frmBankManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DigitalBanking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankManagement = new JFrame();
		frmBankManagement.setTitle("BANK MANAGEMENT");
		frmBankManagement.setSize( 724, 400);
		frmBankManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DIGITAL BANKING");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(235, 25, 273, 58);
		frmBankManagement.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.Bank.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(0, 0, 89, 23);
		frmBankManagement.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MOBILE BANKING");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(44, 249, 206, 46);
		frmBankManagement.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("INTERNET BANKING");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(465, 249, 206, 46);
		frmBankManagement.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/HBL.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setSize( 724, 400);
		frmBankManagement.getContentPane().add(lblNewLabel_1);
	}

}

package bankmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ATMlogin {

	private JFrame frmBankManagemnet;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMlogin window = new ATMlogin();
					window.frmBankManagemnet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATMlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankManagemnet = new JFrame();
		frmBankManagemnet.setTitle("BANK MANAGEMNET");
		frmBankManagemnet.setBounds(100, 100, 450, 300);
		frmBankManagemnet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankManagemnet.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER PIN ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(155, 54, 114, 39);
		frmBankManagemnet.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 89, 171, 32);
		frmBankManagemnet.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equalsIgnoreCase("12345")) {
					bankmanagement.ATM.main(null);
					frmBankManagemnet.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Wrong Pin");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(63, 157, 111, 32);
		frmBankManagemnet.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.Bank.main(null);
				frmBankManagemnet.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(241, 157, 114, 32);
		frmBankManagemnet.getContentPane().add(btnNewButton_1);
	}

}

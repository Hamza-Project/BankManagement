package bankmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TDeposit extends Thread{

	private JFrame frmBankManagement;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TDeposit window = new TDeposit();
					window.frmBankManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Amount amt = new Amount(10000000);
	
	
	/**
	 * Create the application.
	 */
	public TDeposit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankManagement = new JFrame();
		frmBankManagement.setTitle("BANK MANAGEMENT");
		frmBankManagement.setBounds(100, 100, 450, 301);
		frmBankManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER MONEY TO DEPOSIT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(87, 63, 243, 35);
		frmBankManagement.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(87, 109, 243, 26);
		frmBankManagement.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deposit obj1 = new Deposit(amt, Integer.parseInt(textField.getText()));
				obj1.run();
				bankmanagement.Transaction.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(50, 181, 128, 35);
		frmBankManagement.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bankmanagement.Transaction.main(null);
				frmBankManagement.dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(239, 181, 128, 35);
		frmBankManagement.getContentPane().add(btnBack);
		
		
	}
}

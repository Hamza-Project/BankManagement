package bankmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TWithdraw extends Thread{

	private JFrame frmBankManagement;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TWithdraw window = new TWithdraw();
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
	public TWithdraw() {
		initialize();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankManagement = new JFrame();
		frmBankManagement.setTitle("BANK MANAGEMENT");
		frmBankManagement.setBounds(100, 100, 450, 300);
		frmBankManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER MONEY TO WITHDRAW");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(67, 50, 309, 38);
		frmBankManagement.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(67, 99, 309, 33);
		frmBankManagement.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Withdraw obj1 = new Withdraw(amt, Integer.parseInt(textField.getText()));
				obj1.run();
				bankmanagement.Transaction.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(53, 185, 144, 33);
		frmBankManagement.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bankmanagement.Transaction.main(null);
				frmBankManagement.dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(242, 185, 144, 33);
		frmBankManagement.getContentPane().add(btnBack);
	}

}

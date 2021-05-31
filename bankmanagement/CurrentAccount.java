package bankmanagement;

import java.awt.Choice;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CurrentAccount 
{
	private JFrame frmBankManagement;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrentAccount window = new CurrentAccount();
					window.frmBankManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CurrentAccount() {
		initialize();
	}

	private void initialize() {
		frmBankManagement = new JFrame();
		frmBankManagement.setTitle("BANK MANAGEMENT");
		frmBankManagement.setSize(535,276);
		frmBankManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankManagement.getContentPane().setLayout(null);
		
		Choice userNameChoice = new Choice();
		userNameChoice.setSize(261, 20);
		userNameChoice.setLocation(185, 83);
		try {
			Connection con = new Connection();
			ResultSet rs = con.stmt.executeQuery("select * from account");
			while(rs.next()) {
				userNameChoice.add(rs.getString("userName"));
			}
		}catch(Exception e) {
			
		}
		frmBankManagement.getContentPane().add(userNameChoice);
		
		Choice accountChoice = new Choice();
		accountChoice.setSize(261, 20);
		accountChoice.setLocation(185, 121);
		accountChoice.add("Current");
		accountChoice.add("Saving");
		frmBankManagement.getContentPane().add(accountChoice);
		
		JLabel lblNewLabel = new JLabel("ENTER YOUR DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(159, 11, 225, 27);
		frmBankManagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 83, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_2_6 = new JLabel("ACCOUNT TYPE");
		lblNewLabel_1_1_2_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2_6.setBounds(10, 121, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2_6);
		
		String dateArray[] = new String[31];
		for(int i=0;i<dateArray.length;i++)
		{
			dateArray[i]=Integer.toString(i+1);
		}
		
		String monthArray[] = new String[12];
		for(int i=0;i<monthArray.length;i++) {
			monthArray[i]=Integer.toString(i+1);
		}
		
		String yearArray[] = new String[41];
		for(int i=0;i<yearArray.length;i++) {
			yearArray[i]=Integer.toString(i+1980);
		}
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					JOptionPane.showMessageDialog(null, "Created Successfully");
				
				frmBankManagement.dispose();
				bankmanagement.Bank.main(null);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(154, 169, 89, 23);
		frmBankManagement.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBankManagement.dispose();
				bankmanagement.Bank.main(null);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancel.setBounds(275, 169, 89, 23);
		frmBankManagement.getContentPane().add(btnCancel);
	}

}

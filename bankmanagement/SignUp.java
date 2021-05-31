package bankmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp {

	private JFrame frmBankManagement;
	private JTextField userNameField;
	private JTextField passwordField;
	private JTextField ageField;
	private JTextField nicField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField accountField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankManagement = new JFrame();
		frmBankManagement.setTitle("BANK MANAGEMENT");
		frmBankManagement.setSize(600, 650);
		frmBankManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER YOUR DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(159, 11, 225, 27);
		frmBankManagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 83, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 121, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("AGE");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 161, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("EMAIL ADDRESS");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(10, 279, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("NIC");
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_3.setBounds(10, 236, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_3);
		
		userNameField = new JTextField();
		userNameField.setBounds(185, 87, 261, 20);
		frmBankManagement.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(185, 125, 261, 20);
		frmBankManagement.getContentPane().add(passwordField);
		
		ageField = new JTextField();
		ageField.setColumns(10);
		ageField.setBounds(185, 165, 261, 20);
		frmBankManagement.getContentPane().add(ageField);
		
		nicField = new JTextField();
		nicField.setColumns(10);
		nicField.setBounds(185, 240, 261, 20);
		frmBankManagement.getContentPane().add(nicField);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("GENDER");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2_1.setBounds(10, 198, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2_1);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(185, 283, 261, 20);
		frmBankManagement.getContentPane().add(emailField);
		
		JRadioButton male = new JRadioButton("MALE");
		male.setFont(new Font("Times New Roman", Font.BOLD, 15));
		male.setBounds(185, 201, 109, 23);
		frmBankManagement.getContentPane().add(male);
		
		JRadioButton female = new JRadioButton("FEMALE");
		female.setFont(new Font("Times New Roman", Font.BOLD, 15));
		female.setBounds(337, 201, 109, 23);
		frmBankManagement.getContentPane().add(female);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("PHONE NUMBER");
		lblNewLabel_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2_2.setBounds(10, 317, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("CITY");
		lblNewLabel_1_1_2_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2_3.setBounds(10, 355, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2_3);
		
		JLabel lblNewLabel_1_1_2_4 = new JLabel("STATE");
		lblNewLabel_1_1_2_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2_4.setBounds(10, 393, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2_4);
		
		JLabel lblNewLabel_1_1_2_5 = new JLabel("DOB");
		lblNewLabel_1_1_2_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2_5.setBounds(10, 431, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2_5);
		
		JLabel lblNewLabel_1_1_2_6 = new JLabel("ACCOUNT TYPE");
		lblNewLabel_1_1_2_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_2_6.setBounds(10, 469, 136, 27);
		frmBankManagement.getContentPane().add(lblNewLabel_1_1_2_6);
		
		phoneField = new JTextField();
		phoneField.setColumns(10);
		phoneField.setBounds(185, 321, 261, 20);
		frmBankManagement.getContentPane().add(phoneField);
		
		cityField = new JTextField();
		cityField.setColumns(10);
		cityField.setBounds(185, 359, 261, 20);
		frmBankManagement.getContentPane().add(cityField);
		
		stateField = new JTextField();
		stateField.setColumns(10);
		stateField.setBounds(185, 397, 261, 20);
		frmBankManagement.getContentPane().add(stateField);
		
		accountField = new JTextField();
		accountField.setEditable(false);
		accountField.setColumns(10);
		accountField.setBounds(185, 473, 261, 20);
		frmBankManagement.getContentPane().add(accountField);
		
		String dateArray[] = new String[31];
		for(int i=0;i<dateArray.length;i++)
		{
			dateArray[i]=Integer.toString(i+1);
		}
		JComboBox dateBox = new JComboBox(dateArray);
		dateBox.setBounds(185, 434, 52, 22);
		frmBankManagement.getContentPane().add(dateBox);
		
		JLabel lblNewLabel_2 = new JLabel("DATE");
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(149, 437, 46, 14);
		frmBankManagement.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MONTH");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(263, 438, 52, 14);
		frmBankManagement.getContentPane().add(lblNewLabel_3);
		
		String monthArray[] = new String[12];
		for(int i=0;i<monthArray.length;i++) {
			monthArray[i]=Integer.toString(i+1);
		}
		JComboBox monthBox = new JComboBox(monthArray);
		monthBox.setBounds(310, 434, 52, 22);
		frmBankManagement.getContentPane().add(monthBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("YEAR");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2_1.setBackground(SystemColor.menu);
		lblNewLabel_2_1.setBounds(378, 438, 46, 14);
		frmBankManagement.getContentPane().add(lblNewLabel_2_1);
		
		String yearArray[] = new String[41];
		for(int i=0;i<yearArray.length;i++) {
			yearArray[i]=Integer.toString(i+1980);
		}
		JComboBox yearBox = new JComboBox(yearArray);
		yearBox.setBounds(415, 434, 66, 22);
		frmBankManagement.getContentPane().add(yearBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				StringBuilder name = new StringBuilder(userNameField.getText());
				StringBuilder password = new StringBuilder(passwordField.getText());
				StringBuilder age = new StringBuilder(ageField.getText());
				StringBuilder gender;
				if(male.isSelected()) {
					gender = new StringBuilder("male");
				}else {
					gender = new StringBuilder("female");
				}
				StringBuilder nic = new StringBuilder(nicField.getText());
				StringBuilder email = new StringBuilder(emailField.getText());
				StringBuilder phoneNumber = new StringBuilder(phoneField.getText());
				StringBuilder city = new StringBuilder(cityField.getText());
				StringBuilder state = new StringBuilder(stateField.getText());
				StringBuilder dob = new StringBuilder((String)dateBox.getSelectedItem()+" "+(String)monthBox.getSelectedItem()+" "+(String)yearBox.getSelectedItem());
				StringBuilder accountType = new StringBuilder(accountField.getText());
				
				
				
				try {
					
					Connection con = new Connection();
					String query = "insert into account values('"+name+"','"+password+"','"+age+"','"+gender+"','"+nic+"','"+email+"','"+phoneNumber+"','"+city+"','"+state+"','"+dob+"','"+accountType+"');";
					System.out.println(query);
					con.stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Created Successfully");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
				frmBankManagement.dispose();
				bankmanagement.Login.main(null);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(148, 550, 89, 23);
		frmBankManagement.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancel.setBounds(247, 551, 89, 23);
		frmBankManagement.getContentPane().add(btnCancel);
	}
}

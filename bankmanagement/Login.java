package bankmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login {

	private JFrame frmBankLogin;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JButton btnExit;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmBankLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Users user = new Users();
		try {
			Connection con = new Connection();
			String query = "select * from account;";
			ResultSet rs = con.stmt.executeQuery(query);
			while(rs.next()) {
				user.userNamePush(rs.getString("userName"));
				user.passwordPush(rs.getString("password"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		frmBankLogin = new JFrame();
		frmBankLogin.setTitle("BANK MANAGEMENT");
		frmBankLogin.getContentPane().setBackground(Color.WHITE);
		frmBankLogin.setSize(600, 300);
		frmBankLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(184, 72, 114, 28);
		frmBankLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(184, 111, 114, 28);
		frmBankLogin.getContentPane().add(lblPassword);
		
		userNameField = new JTextField();
		userNameField.setBounds(308, 78, 263, 20);
		frmBankLogin.getContentPane().add(userNameField);
		userNameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(308, 117, 263, 20);
		frmBankLogin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(user.userNamePeek(userNameField.getText())) {
					bankmanagement.Bank.main(null);
					frmBankLogin.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "WRONG PASSWORD OR USERNAME");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(253, 182, 116, 23);
		frmBankLogin.getContentPane().add(btnNewButton);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmBankLogin.dispose();
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnExit.setBounds(379, 182, 89, 23);
		frmBankLogin.getContentPane().add(btnExit);
		
		lblNewLabel_1 = new JLabel("Habib Bank Limited");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_1.setBounds(195, 11, 263, 33);
		frmBankLogin.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo2.jfif")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(10, 11, 172, 191);
		frmBankLogin.getContentPane().add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBankLogin.dispose();
				bankmanagement.SignUp.main(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(298, 216, 121, 34);
		frmBankLogin.getContentPane().add(btnNewButton_1);
		
	}
}

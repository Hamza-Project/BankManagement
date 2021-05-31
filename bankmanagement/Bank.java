package bankmanagement;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class Bank {

	private JFrame frmBankManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank window = new Bank();
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
	public Bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankManagement = new JFrame();
		frmBankManagement.setForeground(Color.BLACK);
		frmBankManagement.setTitle("BANK MANAGEMENT");
		frmBankManagement.setSize(1024, 500);
		frmBankManagement.setBackground(Color.BLACK);
		//frmBankManagement.setBounds(100, 100, 450, 300);
		frmBankManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO HBL");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(353, 11, 278, 38);
		frmBankManagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel1_1 = new JLabel("SELECT OPTIONS YOU WANT TO CHOOSE");
		lblNewLabel1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel1_1.setBounds(258, 38, 480, 43);
		frmBankManagement.getContentPane().add(lblNewLabel1_1);
		
		JButton btnNewButton = new JButton("TRANSACTION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.Transaction.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(103, 161, 204, 38);
		frmBankManagement.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ACCOUNTS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.CurrentAccount.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(103, 251, 204, 38);
		frmBankManagement.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CARDS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.Cards.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(103, 341, 204, 38);
		frmBankManagement.getContentPane().add(btnNewButton_2);
	
		
		JButton btnNewButton_3 = new JButton("ATM");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.ATMlogin.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_3.setBounds(718, 161, 204, 38);
		frmBankManagement.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LOAN");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.Loan.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_4.setBounds(718, 251, 204, 38);
		frmBankManagement.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("DIGITAL BANKING");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankmanagement.DigitalBanking.main(null);
				frmBankManagement.dispose();
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_5.setBounds(718, 341, 204, 38);
		frmBankManagement.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("EXIT");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmBankManagement.dispose();
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_6.setBounds(420, 401, 179, 38);
		frmBankManagement.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_2 = new JLabel("DESIGN BY :");
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(793, 20, 75, 22);
		frmBankManagement.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("HAMZA SALEEM");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(794, 38, 105, 14);
		frmBankManagement.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("MIR ZOHAIB ALI");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(794, 56, 105, 14);
		frmBankManagement.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("HASAN JAMAL");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(794, 67, 105, 14);
		frmBankManagement.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RIDA SOHAIL");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(794, 81, 105, 14);
		frmBankManagement.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBackground(Color.GRAY);
		lblNewLabel_11.setLocation(10, 11);
		Image img = new ImageIcon(this.getClass().getResource("/unnamed.png")).getImage();
		lblNewLabel_11.setIcon(new ImageIcon(img));
		lblNewLabel_11.setSize( 1024, 500);
		frmBankManagement.getContentPane().add(lblNewLabel_11);
		
		
		
	}
}

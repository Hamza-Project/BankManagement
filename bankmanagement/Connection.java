package bankmanagement;

import java.sql.*;

import javax.swing.JOptionPane;

public class Connection 
{
	java.sql.Connection con;
	Statement stmt;
	public Connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?characterEncoding=latin1","root","12345");  
			stmt = con.createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
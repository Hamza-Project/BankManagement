package bankmanagement;

import javax.swing.JOptionPane;

public class Amount {
 int amount;
 Amount(int amount){
	 this.amount=amount;
 }
 
 synchronized void withdraw(int amount) {
	 JOptionPane.showMessageDialog(null, "Going to withdraw!");
	 
	 if(this.amount<amount) {
		 JOptionPane.showMessageDialog(null, "Less Balance");
		 try {wait();} catch (Exception e) {}
	 }
	 this.amount-=amount;
	 JOptionPane.showMessageDialog(null, "Withdraw Complete!");
 }
 
 synchronized void deposit(int amount) {
	 JOptionPane.showMessageDialog(null, "Going to deposit");
	 this.amount+=amount;
	 JOptionPane.showMessageDialog(null, "Deposit complete");
	 notify();
 }
}
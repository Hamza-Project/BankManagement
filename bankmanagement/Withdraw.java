package bankmanagement;

public class Withdraw extends Thread
{
	Amount ammt;
	int ammount;
	Withdraw(Amount amt, int ammount)
	{
		this.ammt=amt;
		this.ammount=ammount;
	}
	
	public void run()
	{
		ammt.withdraw(ammount);
	}
	
}
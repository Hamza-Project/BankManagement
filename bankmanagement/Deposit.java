package bankmanagement;

public class Deposit {
	Amount ammt;
	int ammount;
	Deposit(Amount amt, int ammount)
	{
		this.ammt=amt;
		this.ammount=ammount;
	}
	
	public void run()
	{
		ammt.deposit(ammount);
	}
	
}

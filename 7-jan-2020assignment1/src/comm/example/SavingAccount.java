package comm.example;

public class SavingAccount extends Account
{
	public SavingAccount(int accountId, String name, String address) {
		super(accountId, name, address);
		
	}
	private float rateOfInterest;
	private float amount;
	@Override
	public String toString() {
		return "SavingAccount [rateOfInterest=" + rateOfInterest + ", amount=" + amount + "]";
	}
	
	
	 
}

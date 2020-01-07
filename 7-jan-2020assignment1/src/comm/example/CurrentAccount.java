package comm.example;

public class CurrentAccount extends SavingAccount {
	public CurrentAccount(int accountId, String name, String address) {
		super(accountId, name, address);
		// TODO Auto-generated constructor stub
	}
	private boolean isEligible;
	private Float amount;
	 public boolean equals(Object obj) {
		 if(amount<50000)
			 System.out.println("account cant be open..!!XX ");
		 return isEligible;
	 }
	

}

package comm.example;

public class Account {
	private int accountId;
	private String name;
	private String address;
	
	public void Account(int accountId, String name, String address) {
		
	}

	public Account(int accountId, String name, String address) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", address=" + address + "]";
	}
	
	public void display()
	{
		int account=accountId;
		System.out.println(this);
		
	}
	public int hashcode()
	{
		return super.hashCode();
	}
	public int getaccountId()
	{
		return accountId;
	}
	public void setaccountId(int accountId) 
	{
		this.accountId = accountId;
		}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getaddress()
	{
		return address;
	}
	public void setaddress()
	{
		this.address=address;
	}
}
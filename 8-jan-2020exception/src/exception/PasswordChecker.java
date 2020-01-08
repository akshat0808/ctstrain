package exception;

public class PasswordChecker {
	
	private String password;
	private String userName;
	private PasswordChecker passwordChecker=null;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public PasswordChecker getPasswordChecker() {
		return passwordChecker;
	}
	public void setPasswordChecker(PasswordChecker passwordChecker) {
		this.passwordChecker = passwordChecker;
	}
	public PasswordChecker(String password, String userName) {
		super();
		this.password = password;
		this.userName = userName;
		//this.passwordChecker = passwordChecker;
	}
	public PasswordChecker createPasswordChecker(String password, String  userName) throws InvalidPassException
	{
		passwordChecker= new PasswordChecker(password,userName);
		char[] ch=new char[getPassword().length()];
		for(int i=0;i<getPassword().length();i++)
		{
			ch[i]=getPassword().charAt(i);
		}
		for(int i=0;i)
		if(ch.length()>15||ch.length()<8 && 
				getPassword()=="(.*[A-Z].*)" && getPassword()=="(.*[a-z].*)" && getPassword()== "(.*[0-9].*)")
		{
			System.out.println("valid password");
		}
		else
		{
			throw new InvalidPassException("invalid password");
		}
		return passwordChecker;
		
	}
	public PasswordChecker() {
		super();
	}
	@Override
	public String toString() {
		return "PasswordChecker [password=" + password + ", userName=" + userName + ", passwordChecker="
				+ passwordChecker + "]";
	}
	

}

package exception;

import java.util.UUID;

public class Test1 {

	//public static void main(String[] args) throws EmployeeNotCreatedException {
		//Employee employee=new Employee();
		//employee.createEmployee(110011,"akshat", "mbd", 5);
		//System.out.println(employee);
	public static void main(String[] args) throws InvalidPassException
	{
		PasswordChecker passwordChecker=new PasswordChecker();
		passwordChecker.createPasswordChecker("ws34512345", "akshat");
		System.out.println(passwordChecker);

	}

}

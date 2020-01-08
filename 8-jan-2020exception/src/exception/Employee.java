package exception;

import java.util.UUID;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private double employeeExperience;
	private Employee employee=null;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(double employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee(int employeeId, String employeeName, String employeeAddress, double employeeExperience) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeExperience = employeeExperience;
		
	}
public Employee createEmployee(int employeeId,String employeeName, String employeeAddress, double employeeExperience)throws EmployeeNotCreatedException {
		
		
		employee=new Employee(employeeId,employeeName,employeeAddress,employeeExperience);
		if(employee.getEmployeeExperience()<2)
		{
			throw new EmployeeNotCreatedException("Employee Can't be created having less than 2 years experience");
		}
		return employee;
		
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeeExperience=" + employeeExperience + ", employee=" + employee + "]";
	}

}

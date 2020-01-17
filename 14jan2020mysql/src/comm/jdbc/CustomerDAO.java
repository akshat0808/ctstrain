package comm.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
	
	public Customer createCuastomer(String firstName,String lastName,String email) throws SQLException;
	public List<Customer> displayAllCustomer() throws SQLException;
	public List<Customer> findById() throws SQLException;
	public Customer updateCustomer(String firstName,String lastName,String email) throws SQLException;
	

}
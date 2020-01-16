package com.mycompany.jdbcmaven.demo;

import java.sql.SQLException;
import java.util.List;



public interface CustomerService {
	public Customer createCuastomer(Customer customer) throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
	public Customer updateCustomer(Customer customer,String uId) throws SQLException;
	public List<Customer> displayAllCustomers() throws SQLException;
	public String deleteCustomer( String uId) throws SQLException;
}
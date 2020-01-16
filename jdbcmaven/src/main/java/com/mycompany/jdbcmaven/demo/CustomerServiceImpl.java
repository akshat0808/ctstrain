package com.mycompany.jdbcmaven.demo;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;



public class CustomerServiceImpl implements CustomerService {
	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.demo.CustomerServiceImpl");
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
		logger.info("got dao");
	}

	@Override
	public Customer createCuastomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCuastomer(customer);
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findById(uId);
	}

	@Override
	public List<Customer> displayAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.displayAllCustomers();
	}

	@Override
	public Customer updateCustomer(Customer customer, String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer,uId);
	}

	@Override
	public String deleteCustomer(String uId) throws SQLException {
		return dao.deleteCustomer(uId);
		//  TODO Auto-generated method stub
		
	}



	

}
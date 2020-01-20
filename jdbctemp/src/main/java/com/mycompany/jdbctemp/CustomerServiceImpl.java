package com.mycompany.jdbctemp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao2")

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao2 dao2;

	@Autowired
		public CustomerServiceImpl(CustomerDao2 dao2) {
		super();
		this.dao2 = dao2;
	}


		@Override
		public Customer createCustomer(Customer customer) throws SQLException {
			// TODO Auto-generated method stub
			return dao2.createCustomer(customer);
		}


		

		@Override
		public java.util.List<Customer> getAllCustomers() throws SQLException {
			// TODO Auto-generated method stub
			return dao2.getAllCustomers();
		}


		@Override
		public java.util.List<Customer> getCustomerById(String uId) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public int updateCustomerById(Customer customer) throws SQLException {
			// TODO Auto-generated method stub
			return dao2.updateCustomerById(customer);
		}


		@Override
		public int deleteCustomer(String uId) throws SQLException {
			// TODO Auto-generated method stub
			return 0;
		}


	

}

package com.mycompany.jdbctemp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao2")

public class CustomerDaoImplVersion2 implements CustomerDao2 {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into customer(uid,first_name,last_name,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		String query="select uid,first_name,last_name,email from customer";
		
		
		return jdbcTemplate.query(query, new CustomerRowMapper());
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		String query="select uid,first_name,last_name,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowMapper());
	}

	@Autowired
	@Override
	public int updateCustomerById(Customer customer) throws SQLException {
		String query="update uid,first_name,last_name,email from customer where uid=?";
		jdbcTemplate.update(query, 
				new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		
	
		return  0;
	}

	@Override
	public int deleteCustomer(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

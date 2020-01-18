package com.mycompany.customer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Service 

{
CustomerDAO customer1dao;
public Customer createCustomer(String firstname, String lastname, String email, String id)


{
	return customer1dao.createCustomer(firstname, lastname, email, id);
}
public List<Customer> displayCustomer()



{
		return customer1dao.displayCustomer();
}
public Customer findById(String id)


{
	
	return customer1dao.findById(id);	
} 


}
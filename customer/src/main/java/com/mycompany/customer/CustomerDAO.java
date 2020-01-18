package com.mycompany.customer;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDAO 


{
List<Customer> list = null;
Customer customer1;


public Customer createCustomer(String firstname, String lastname, String email, String id)


{
	customer1.setFirstname(firstname);
	customer1.setLastname(lastname);
	customer1.setEmail(email);
	customer1.setId(id);
	list.add(customer1);
	return customer1;	
}


public List<Customer> displayCustomer()

{
	return list;	
}
public Customer findById(String id)

{
	for(Customer c : list)
	{
		if(c.getId().equals(id))
		{
			customer1.setFirstname(c.getFirstname());
			customer1.setLastname(c.getLastname());
			customer1.setEmail(c.getEmail());
			customer1.setId(c.getId());
		}
	}
	return customer1;	
}

}
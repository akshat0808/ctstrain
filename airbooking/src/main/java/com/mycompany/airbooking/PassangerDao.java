package com.mycompany.airbooking;

import java.sql.SQLException;

public interface PassangerDao {
	
	public Passanger createPassanger(String uId, String password) throws SQLException;

}

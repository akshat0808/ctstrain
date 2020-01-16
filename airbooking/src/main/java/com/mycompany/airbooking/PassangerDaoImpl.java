package com.mycompany.airbooking;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class PassangerDaoImpl implements PassangerDao {

	private MyConnectionFactory factory=null;
	private Connection connection=null;
	PreparedStatement pStatement=null;
	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.PassangerDAOImpl");
	private Passanger passanger=null;
	{
		factory=MyConnectionFactory.getFactoryObject();
		try {
			logger.info("connection started");
			connection=factory.getMyConnection();
			logger.info("got connection");

		} catch (IOException | SQLException e) {
			
			e.printStackTrace();
			logger.info("connection unsucessfull");
		}
	}
	
	@Override
	public Passanger createPassanger(String uId, String password) throws SQLException {
		
	
		passanger=new Passanger(uId, password);
		pStatement=connection.prepareStatement("insert into "
				+ "passanger(uId,password) "
				+ "values(?,?)");
		pStatement.setString(1,passanger.getUId() );
		pStatement.setString(4, passanger.getPassword());
		pStatement.executeUpdate();
	
		return passanger;
	}
	
	

	
	

}

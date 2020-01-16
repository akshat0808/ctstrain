package com.mycompany.airbooking;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class FlightBookingDaoImpl implements FlightBookingDao {
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	PreparedStatement pStatement=null;
	static Logger logger=Logger.getLogger("com.mycompany.jdbcmaven.FlightBookingDAOImpl");
	private FlightBooking flightBooking=null;
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
	public FlightBooking createFlightBooking( int nosa, String flightNumber) throws SQLException {
		
		
		FlightBooking flightBooking = new FlightBooking(nosa, flightNumber);
		pStatement=connection.prepareStatement("insert into "
				+ "flightbooking(nosa, flightNumber) "
				+ "values(?,?)");
		pStatement.setLong(1, flightBooking.getNosa() );
		pStatement.setString(2, flightBooking.getFlightNumber());
		pStatement.executeUpdate();
		
		
		return flightBooking;
	}
	
	

}

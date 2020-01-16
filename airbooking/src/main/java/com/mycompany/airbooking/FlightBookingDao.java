package com.mycompany.airbooking;

import java.sql.SQLException;

public interface FlightBookingDao {
	
	public FlightBooking createFlightBooking(int nosa , String flightBooking) throws SQLException;

}

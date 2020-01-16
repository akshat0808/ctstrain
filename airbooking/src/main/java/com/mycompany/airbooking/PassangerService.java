package com.mycompany.airbooking;

import java.sql.SQLException;

public interface PassangerService {
	
	public Passanger createpassanger(Passanger passanger) throws SQLException;
	public FlightBooking createFlightBooking(FlightBooking flightBooking) throws SQLException;

}

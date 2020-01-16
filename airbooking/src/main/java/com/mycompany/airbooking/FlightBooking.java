package com.mycompany.airbooking;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter


public class FlightBooking implements Serializable {

	private static final long serialVersionUID = 5994875826048978526L;
	
	private int nosa;
	private String flightNumber;
	public FlightBooking(int nosa, String flightNumber) {
		super();
		this.nosa = nosa;
		this.flightNumber = flightNumber;
	}
	@Override
	public String toString() {
		return "FlightBooking [nosa=" + nosa + ", flightNumber=" + flightNumber + "]";
	}
	
	
	

}

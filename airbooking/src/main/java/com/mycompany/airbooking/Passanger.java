package com.mycompany.airbooking;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Passanger implements Serializable {
	
	
	
	
	private static final long serialVersionUID = -5850316801751582448L;
	private String uId;
	private String password;
	public Passanger(String uId, String password) {
		super();
		this.uId = uId;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Passanger [uId=" + uId + ", password=" + password + "]";
	}
	

}

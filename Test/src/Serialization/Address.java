package Serialization;

import java.io.Serializable;

public class Address implements Serializable{
	
	private String street;
	private String city;
	private int zipcode;
	
	
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public int getZipcode() {
		return zipcode;
	}
	
	
	

}

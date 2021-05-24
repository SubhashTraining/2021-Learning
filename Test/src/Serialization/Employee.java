package Serialization;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Employee implements Serializable{
	

	private int empID;
	private String name;
	private boolean permanent;
	private Address address;
	private int[] phoneNumbers;
	private String role;
	private String[] cities;
	private Map<String,String> properties = new HashMap<>();
	public int getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public Address getAddress() {
		return address;
	}
	public int[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public String getRole() {
		return role;
	}
	public String[] getCities() {
		return cities;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setPhoneNumbers(int[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setCities(String[] cities) {
		this.cities = cities;
	}
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	
	
	@Override
	public final String toString()
	{
		
		StringBuffer buffer = new StringBuffer("{\n empID:"+this.empID);
		buffer.append("\n name:"+this.name);
		buffer.append("\n permanent:"+this.permanent);
		buffer.append("\n address:{\n street:"+address.getStreet());
		buffer.append("\n city:"+address.getCity());
		buffer.append("\n zipcode:"+address.getZipcode()+"\n}");
		buffer.append("\n PhoneNumbers:[\n");
		buffer.append(Arrays.toString(phoneNumbers));
		buffer.append("\n ]");
		buffer.append("\n role:"+role);
		buffer.append("\n cities[");
		buffer.append(Arrays.toString(this.getCities()));
		buffer.append("\n ]\nPropeties:{");
		buffer.append(this.getProperties()+"\n }\n}");
		
		return buffer.toString();
	}
	
	

}

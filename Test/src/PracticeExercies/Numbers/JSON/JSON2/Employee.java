package PracticeExercies.Numbers.JSON.JSON2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;



public class Employee {
	
	@SerializedName("empID") //import com.google.gson.annotations.SerializedName;
	private int empID;
	private String name;
	private boolean permanent;
	private Address address;
	private Long[] phoneNumbers;;
	private String role;
	private List<String> cities;
	private Map<String, String> properties= new HashMap<>();
	
	
	
	
	public Employee(int employeeId, String name, boolean permenant, String role) {
		this.empID = employeeId;
		this.name = name;
		this.permanent = permenant;
		this.role = role;
	}
	
	
	
	public Employee() {
		
		empID = 0;
		name = null;
		this.permanent = false;
		this.address = null;
		this.phoneNumbers = null;
		this.role = null;
		this.cities = null;
		this.properties = null;
	}



	public int getEmployeeId() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public boolean isPermenant() {
		return permanent;
	}
	
	
	public Address getAddress() {
		try {
			return address.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return address;
	}
	public Long[] getPhoneNumbers() {
		return phoneNumbers;
	}
	public String getRole() {
		return role;
	}
	public List<String> getCities() {
		return new ArrayList<>(cities);
	}
	public Map<String, String> getProperties() {
		return new HashMap<>(properties);
	}
	public void setEmployeeId(int employeeId) {
		empID = employeeId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPermenant(boolean permenant) {
		this.permanent = permenant;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setPhoneNumbers(Long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setCities(List<String> cities) {
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
		buffer.append("\n zipcode:"+address.getZipCode()+"\n}");
		buffer.append("\n PhoneNumbers:[\n");
		buffer.append(Arrays.toString(phoneNumbers));
		buffer.append("\n ]");
		buffer.append("\n role:"+role);
		buffer.append("\n cities[");
		buffer.append(Arrays.toString(this.getCities().toArray()));
		buffer.append("\n ]\nPropeties:{");
		buffer.append(this.getProperties()+"\n }\n}");
		
		return buffer.toString();
	}
	
	
	
}
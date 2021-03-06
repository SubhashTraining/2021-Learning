package PracticeExercies.Numbers.JSON.JSON1;

import com.google.gson.annotations.SerializedName;

public class Company {

	@SerializedName("Employee")
	//in your json the Object name is Employee when the gson parses the JSON it looks for Employee variable name whereas here we have
	//given only employee so using SerializedName as Employee will solve this issu
	
	/*
	 The @SerializedName annotation can be used to serialize a field with a different name instead of an actual field name. 
	 We can provide the expected serialized name as an annotation attribute, 
	 Gson can make sure to read or write a field with the provided name.
	 
	 When Serializing or DeSerializing use this name
	 */
	
	private Employee[] employee;

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public Employee[] getEmployee() {
		return employee;
	}
	
	
	
	
	 
	
	

}

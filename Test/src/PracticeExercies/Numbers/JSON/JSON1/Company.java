package PracticeExercies.Numbers.JSON.JSON1;

import com.google.gson.annotations.SerializedName;

public class Company {

	@SerializedName("Employee")
	
	private Employee[] employee;

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public Employee[] getEmployee() {
		return employee;
	}
	
	
	
	
	 
	
	

}

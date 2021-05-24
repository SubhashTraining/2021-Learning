package Serialization;
import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Company implements Serializable{
	//@SerializedName("Employee")
	//where you use Serial
	private Employee[] employee;
	
	

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
	

}

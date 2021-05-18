package PracticeExercies.Numbers.Serialization;

import java.io.IOException;

public class Main {
	
	
	public static void main(String[] args)
	{
		
		String fileName="employee.ser";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(5000);
		
		//serialize to file
		
		SerializationUtil.serialize(emp, fileName);
		
		
		Employee empNew = null;
		
			empNew = (Employee) SerializationUtil.deSerialize(fileName);
		
		
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
	}
}
		
		
		
	
	


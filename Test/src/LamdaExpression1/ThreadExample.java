package LamdaExpression1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class ThreadExample{
	
public static void main(String[] args)
{
	
	Employee emp1= new Employee("Subhash Perumalsamy",34);
	Employee emp2= new Employee("Sanjay Subhash",4);
	Employee emp3= new Employee("Suganya Nagaraj",30);
	Employee emp4= new Employee("Amar RaviGovindhan",26);
	Employee emp5= new Employee("Dhanushka Sathish",5);
	
	List<Employee> employees = new ArrayList<>();
	employees.add(emp1);
	employees.add(emp2);
	employees.add(emp3);
	employees.add(emp4);
	employees.add(emp5);
	
	
	printNames(employees,"AgeCondtion >30", employee ->employee.getAge()>30);
	System.out.println("**********************");
	printNames(employees, "Age Condition <30", employee->employee.getAge()<30);
	System.out.println("***************************");
	
	printNames(employees,"Age Condition =30", new Predicate<Employee>(){

		@Override
		public boolean test(Employee t) {
			
			
			if(t.getAge()==30) return true;
			else return false;
		}
		
	});
	
	Function<Employee,String> getName = (Employee employee)->{
		
		return employee.getName().substring(employee.getName().indexOf(' ')+1);
	};
	
	Function<Employee,String> function = new Function<Employee,String>(){

		@Override
		public String apply(Employee employee) {
			// TODO Auto-generated method stub
			return employee.getName().substring(employee.getName().indexOf(' ')+1);
		}
		
		
		
	};
	
	
	System.out.println("_____________________________________");
	for(Employee employee: employees)
	{
	
		System.out.println(getName.apply(employee));
	}
	
	
	
	System.out.println("_____________________________________");
	for(Employee employee: employees)
	{
	
		System.out.println(function.apply(employee));
	}
	
	
}


public static void  printNames(List<Employee> employees, String text , Predicate<Employee> ageCondition)
{
	for(Employee employee:employees)
	{
		if(ageCondition.test(employee))
		{
			System.out.println(employee.getName());
		}
		
	}
	
	
}
	
	
}

 class Employee {
	
	private String Name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	}
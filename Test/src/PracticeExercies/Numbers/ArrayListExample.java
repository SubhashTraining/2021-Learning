package PracticeExercies.Numbers;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class ArrayListExample {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		
		
		//ArrayList constructors
		java.util.ArrayList arrayList1 = new java.util.ArrayList(); //constructs an empty array list with inital capacity of ten
		//Raw Typer. Ref to generic type must be paramaterized
		//the-import-java-util-scanner-conflicts-with-a-file-defined-in-the-same-file (have given the class name as ArrayList which should not be the case if you are importing ArrayList
		
		List<Integer> arrayList2= new ArrayList<>();
		
		List<Integer> arrayList3 = new ArrayList<>(arrayList2); //ArrayList(Collection<? extends E> c)
		
		List<Integer> arrayList4 = new ArrayList<>(new ArrayList<>(arrayList3)); 
		
		List<String> StringArrayList = Arrays.asList("Subhash", "is", "the","father","of","Sanjay");
		
		Collections.copy(arrayList2,arrayList3);
		
		arrayList2.addAll(arrayList3);//appends to the end
		//arrayList2.addAll(2,arrayList3);//appends into the index position
		
		arrayList2.contains(5);
		arrayList2.containsAll(arrayList3);
				
		//(Consumer<? super E> action)
		arrayList2.forEach(number ->{
			System.out.println(number);
		});
		
		
		for(int no:arrayList2)
		{
			
		}
		
		
		Iterator itr = arrayList2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ListIterator itr1 = arrayList3.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		for(int i=0; i<arrayList2.size();i++)
		{
			System.out.println(arrayList2.get(i));
		}
		
		
		//ListIterator and Iterator (List iterator only for list implemented classes ArrayList and Linked List. 
		//List Iterator provides BiDirectional Iteration
		
		List<Integer> integerArrayList = Arrays.asList(1,5,6,7,8,3,4);
		ListIterator<Integer> lItr = integerArrayList.listIterator();
		
		
		//lItr.set(15);//throws  java.lang.IllegalStateException  as set can be only used after next or previous
		
		//initally cursor=0 lastReturn =-1	
		int next = lItr.next();//returns the element in the cursor and move to next cursor. Cursor =0
		//next retruns 0 and moves cursor to 1. last return would be 0
		System.out.println(next);
		if(next==1)
		{
			lItr.set(10);//(10,5,6,7,8,3,4) - replaces last returned by new element. Here o idex by 10
		}
		
		int previois = lItr.previous();//previous element now is 10 as cursor is 1 the previus last returned is 0
		lItr.set(15);//[15, 5, 6, 7, 8, 3, 4]
		
		
		
		//Stream
		int[] intarray = integerArrayList.stream().mapToInt((Integer i)->i.intValue()).toArray();
		System.out.println(integerArrayList.toArray());
		
		integerArrayList.indexOf(10);
		integerArrayList.isEmpty();
		// integerArrayList.remove(index);
		// integerArrayList.remove(Object obj);
		integerArrayList.get(5);
		integerArrayList.equals(arrayList2);
		
		
		Collections.sort(arrayList2); //All elements in the list must implement comparable interface . Intger implements comparabe
		Collections.sort(StringArrayList);
		
		class Employee{
			
			private String Name;
			public Employee(String Name)
			{
				this.Name=Name;
			}
			
			public String getName()
			{
				return Name;
			}
		}
		
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("Subhash"));
		employee.add(new Employee("Suganya"));
		
		
		//to use Collections.sort either the class should implement comparable interface or implement comparator as anonymous class
		
		Collections.sort(employee, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Employee Obj1= (Employee)o1;
				Employee Obj2= (Employee)o2;
				
				return Obj1.getName().compareToIgnoreCase(Obj2.getName());
			}
			
		}); 
		
		class Employee1 implements Comparable<Employee1>{
			
			private String Name;
			public Employee1(String Name)
			{
				this.Name=Name;
			}
			
			public String getName()
			{
				return Name;
			}

			@Override
			public int compareTo(Employee1 o) {
				// TODO Auto-generated method stub
				
				
				return this.getName().compareTo(o.getName());
			}
		}
		
		
		List<Employee1> employee1 = new ArrayList<>();
		employee1.add(new Employee1("Subhash"));
		employee1.add(new Employee1("Suganya"));
		//Employee 1 implements Comparable interface. In the above case we are implementing. When implementing the comparable interface specify the type <Employee>
		Collections.sort(employee1);
		//Elements should implement comparable interface or use comparator
		employee1.sort(null);
		employee1.sort(new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Employee1 Obj1= (Employee1)o1;
				Employee1 Obj2= (Employee1)o2;
				return Obj1.getName().compareTo(Obj2.getName());
			}
			
			
		});
		
		
		
		List<String> string = Arrays.asList("A12","A14","A13","b12","B14","B17","B18","C12","C15");
		
		List<String> bnos = new ArrayList<>();
		string.forEach((bingos)-> {
			
		if(bingos.toUpperCase().startsWith("B")){
			bnos.add(bingos);
		}});
		

		Collections.sort(bnos);
		bnos.sort((c1,c2)->c1.compareTo(c2));
		
		
		/*
		 	Collections.swap(list,i,j)
		 	collections.shuffle()
		 	Collections.reverse
		 	Collections.copy
		 	Collections.sort
		 	list.sort(Comparator)
		 	
		 	
		 	
		 	
		 */
		
		
				
	}

}

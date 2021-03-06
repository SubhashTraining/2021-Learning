package PracticeExercies.Numbers;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

public class Reflections {
	
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		
		
		String string = "Subhahs";
		System.out.println(string.getClass().getSimpleName());//String
		System.out.println(string.getClass().getName());//java.lang.String
		
		String className= "Reflect";
		Class stringClass = Class.forName("java.lang.String");
		
		Class c1= int.class; // int is not a class, but int.class is an object of type class
		Class c=boolean.class;
		Class c3= void.class;
		Class c4= Double[].class;
		
		//Vm manages a unique class object for each type, so we can us == to compare class objects 
				
		if(c1.getClass()==c3.getClass())
		{
			System.out.println("The class objects are of same type");
		}

		
		//Creates an instance
		
		Object newString = Class.forName("java.lang.String").newInstance();
		String castString = (String) newString;
		System.out.println(castString);
		
		//*******************************************************************
		
		String className1="java.util.Date";
		Class cl= Class.forName(className1);
		Class supercl = cl.getSuperclass();
		String modifiers = Modifier.toString(cl.getModifiers());
		System.out.println("ClassModifier:"+modifiers);//public
		
		
		//Constructors check
		
		Constructor[] constructors = cl.getDeclaredConstructors(); //import java.lang.reflect;
		int i=1;
		for(Constructor constructor : constructors)
		{
			
			StringBuilder sb = new StringBuilder();
			String mods= Modifier.toString(cl.getModifiers());
			sb.append(mods);
			
			sb.append(constructor.getName()+"["+constructor.getParameterCount()+"](");
			
			Class[] parameters = constructor.getParameterTypes();
			int size =0;
			for(Class parameter: parameters)
			{
				
				sb.append(parameter.getSimpleName());
				if(size==parameters.length-1)
				{
					sb.append(")");
					
				}
				else
				{
					sb.append(",");
				}
			
				size++;
				
			}
			System.out.println(sb.toString());
			
			
		}
		
		
		
		System.out.println("Reflections Methods");
		//Methods checks
		Method[] methods = cl.getDeclaredMethods();
		i=1;
		for(Method method:methods)
		{
			System.out.print("Medthod"+i+":"+ Modifier.toString(method .getModifiers())+" "+ method.getReturnType().toString()+ " "+method.getName().toString());
			Class[] parameters = method.getParameterTypes();
			System.out.print("(");
			for(Class param:parameters)
			{
				System.out.print(param.getTypeName()+",");
				
			}
			System.out.print(")");
			System.out.println();
		i++;
		}
		
		System.out.println("*************************************************************");
		//Fileds
		Field[] fields = cl.getDeclaredFields();
		for(Field f:fields)
		{
			System.out.println("Field1: "+Modifier.toString(f.getModifiers())+" "+f.getType().toString()+" "+f.getName());
			
		}
		
		
		
		
		//invoking arbitrary methods
		System.out.println("**************************************************************");
		Class classs = Class.forName("java.util.Date");
		Date date = new Date();
		
		
		Method m1= classs.getDeclaredMethod("getTime");
		Method m2 = classs.getDeclaredMethod("getYear");
		System.out.println(m2.invoke(date).toString());
		
		
		Method setYear = Date.class.getDeclaredMethod("setYear",int.class);
		Date date1 = new Date();
		
		System.out.println("********Method Invoke******************");
		setYear.invoke(date1, 1998);
		System.out.println(date1.toString());
		
		
		
		//Invoke Constuctor
		Class[] classtypes = new Class[]{int.class,int.class,int.class};
		Class DateClass = Date.class;
		Constructor constructor = DateClass.getDeclaredConstructor(classtypes);
		Object[] args1 = new Object[]{1995,11,12};
		
		Date dateObject = (Date) constructor.newInstance(args1);
		System.out.println(dateObject.toString());
		
		
		
	}
	
	
	

}

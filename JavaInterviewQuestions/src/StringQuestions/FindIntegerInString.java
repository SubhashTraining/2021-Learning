package StringQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIntegerInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.parseInt("-1234555"));
		System.out.println(Integer.valueOf("-83873881"));
		int i=-8398393;
		System.out.println(""+i);
		//the above line is converted to 
		String s= new StringBuilder().append("").append(i).toString();
		
		String s1 = 399390.99+"";//double to string
		String s3= String.valueOf(93939.99);
		
		//String to Double
		Double d = Double.valueOf(s1);
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string with intgers:\n");
		String input = in.nextLine();
		
		Pattern pattern  = Pattern.compile("([^\\d]*)([\\d]+)([^\\d]*)");
		Matcher matcher= pattern.matcher(input);
		List<Integer> integer = new ArrayList<>();
		
		while(matcher.find())
		{
			
			String integerString = matcher.group(2);
			integer.add(Integer.parseInt(integerString));
			
			
		}
		
		
		integer.forEach(value -> System.out.println(value));
		
		
		
		
		
		
		
		
	
		
	}
	
	

}

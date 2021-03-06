package RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular1 {
	/*
 		
 		Java provides the java.util.regex package for pattern matching with regular expressions.
 
 		The java.util.regex package provides following classes and interfaces for regular expressions.
		MatchResult interface
		Matcher class
		Pattern class
		PatternSyntaxException class
 
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //1.Write a regex to split String by new line?
		 String regex=" ";
		 String regex1="\\n+"; //Split by new line
		 
		 String regex2="\\r?"; //Split by new line also called carraiage return
		 String regex3="\\r?\\n";//Answer
		 String s ="subhash is \n good \n\n boy";
		 String s1 ="subhash is \r good boy";
		 System.out.println(s1);
		 String[] string = s.split("\\n");
		 String[] string1 = s.split("\\n?");
		 String[] string2 = s.split("\\n*");
		 String[] string3 = s.split("\\n+");
		 
		 String[] string4 = s.split("\\n??");
		 String[] string5 = s.split("\\n*?");
		 String[] string6 = s.split("\\n+?");
		 
		 String[] string7 = s.split("\\n?+");
		 String[] string8 = s.split("\\n*+");
		 String[] string9 = s.split("\\n++");
		 
		 
		 for(String ss: string)
			 System.out.print(ss);
		 
		 //2.What is use of Dot(.) symbol in Java Regex? . represents any number of any characters
		 
		 //3. How to extract a substring using regex ? Example - String test = "This is a test String and 'This is data we want'"
		 
		 String input ="This is a test String and 'This is data we want'";
		 Pattern pattern = Pattern.compile("(')(.*?)(')");//reluctant quantifier
		 Matcher matcher = pattern.matcher(input);
		 
		 while(matcher.find())
		 {
			 System.out.println(matcher.group(1)+matcher.group(2)+matcher.group(3));
			 //'This is data we want'
		 }
		 
		 /*
		  	
		  	*			Zero or more occurrences					. * - Any sequence
			?			Zero or one occurrences(Optional)			[0-9]? - Any optional digit
			+			One or more occurrences						[0-9]+ - One or more digit
			{x}			x instance of occurrences					m{5} - Five instances of the letter m
			{x,y}		between x and y instances of occurrences	[0-9]{13,19} - Between 13 and 19 occurrences
			{x,}		at least x instances of occurrences			.{8,} - At least 8 characters
		  
		  
		  */
		 
		 //4. What is difference between matches() and find() in Java Regex?
		 //matches() returns true only if the whole string matches the specified pattern while find() returns trues even if a substring matches the pattern.
		 
		 
		 //5.How to replace all non-alphanumeric characters with empty strings?
		 
		 
		  System.out.println("a1A*()".replaceAll("(?i)[a-z0-9]",""));//*()
		  System.out.println("a1A*()".replaceAll("[a-z0-9A-Z]",""));//*()
		 
		 
		 
		 //How to replace 2 or more spaces with single space in string and delete leading and trailing spaces?
		  System.out.println("a   b     c ".replaceAll("\\s{1,}"," ").trim());
		  
		 //Create a regular expression that accepts alphanumeric characters only. Its length must be five characters long only
		  System.out.println(Pattern.matches("(?i)[a-z0-9]{5}","java1"));//true- Matches check for the whole of input with the regex
		  System.out.println(Pattern.matches("(?i)[a-z0-9]{5}","subhad"));//false
		  
		  //Create a regular expression that accepts 10 digit numeric characters starting with 1, 2 or 3 only.
		  System.out.println(Pattern.matches("[123][0-9]{9}", ""));
		  System.out.println(Pattern.matches("[123]{1}[0-9]{9}",""));
		  System.out.println(Pattern.matches("[123]{1}[\\d]{9}",""));
		  
		  
		  //How to extract nos from a string
		  List<Integer> list = new ArrayList<>();
		  Pattern pattern1 = Pattern.compile("\\d+");
		  Matcher matcher1 = pattern1.matcher("1234dfdf4573dfdf5555d2fdf5555df55dfdfd513");
		  while(matcher1.find())
		  {
			  list.add(Integer.parseInt(matcher1.group()));
		  }
		  System.out.println();
		  list.forEach(e->System.out.print(e+":"));// 1234:4573:5555:2:5555:55:513:  one or more occurrence are grouped together 
		  System.out.println();
		  
		  //Pattern pattern1 = Pattern.compile("\\d"); will print 1:2:3:4:4:5:7:3:5:5:5:5:2:5:5:5:5:5:5:5:1:3:
		 
		  
		  System.out.println("***********");
		  //	How to split Java String by newlines?
		  //	\r and \n CR and LF used in windows
		  
		  
		  String lines[]= "lk\r\rdfdf\nsd\rfsdf\nzsff".split("[\\r?\\n]");
		  // lk::dfdf:sd:fsdf:zsff: this will check for each match of \r or \n and insert empty lines if there are consecutive line separators
		  
		   lines= "lk\r\rdfdf\nsd\rfsdf\nzsff".split("[\\r\\n]+");
		   //lk:dfdf:sd:fsdf:zsff: - if you do not want empty lines
		  
		 //Importance of Pattern.compile()
		 /*
		  A regular expression, specified as a string, must first be compiled into an instance of Pattern class. 
		  Pattern.compile() method is the only way to create a instance of object. A typical invocation sequence is thus
		  */

		   
		   
		   System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		   System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		   System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		   System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		   System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
		   
		   
		   
		   
		   
		   
	}
	

}

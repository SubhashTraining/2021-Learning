package PracticeExercies.Numbers.RegularExpression;

public class regularExpression {
	
	public static void main(String args[])
	{
		
		
		String s = "ssuubbhhaasshh 11223344556677";
		System.out.println(s.replaceAll(".","X"));//replace all characters with x including white space
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		
		
		System.out.println(s.replaceAll("^ssu", "X"));//Replace string ssu if its at the beginning
		//Xubbhhaasshh 11223344556677
		
		System.out.println(s.replaceAll("[abh]", "X"));//replace characters a,b,h by X
		//ssuuXXXXXXssXX 11223344556677
		
		System.out.println(s.replaceAll("[abh][sh]", "OO"));//replace characters a,b,h followed by s or h , both charactes as or ah or bs or bh or hs or hh should be replcaed
		//ssuubOOhaOOsOO 11223344556677
		//ssuubbhhaasshh 11223344556677
		
		System.out.println(s.replaceAll("sshh$","OOOO"));//replace sshh if its the end of the string. This example no replcasement as sshh is not the end of the string
		//ssuubbhhaasshh 11223344556677
		
		System.out.println(s.replaceAll("6677$", "YYYY"));// replace 6677 if its the end of the string
		//ssuubbhhaasshh 1122334455YYYY
		//ssuubbhhaasshh 11223344556677
		
		System.out.println("harry".replaceAll("[hH]arry","Harry"));
		//Harry
		
		System.out.println(s.replaceAll("[^sh]","Z"));//replace all characters other than sh
		//ssZZZZhhZZsshhZZZZZZZZZZZZZZZ
		
		System.out.println(s.replaceAll("[a-e A-E 38]", "Q"));//replcae all aphabest of range a-e and A-e and digits 3 and 8
		//ssuuQQhhQQsshhQ1122QQ44556677
		//ssuubbhhaasshh 11223344556677 - we have also added space there in the regex so white space is also replaced
		
		System.out.println(s.replaceAll("(?i)[a-e38]", "W"));//replace all characters range a-e (ignore case) and digits 3,8 with 
		//ssuuWWhhWWsshh 1122WW44556677
		
		/*
			[0-0]  	-all digits 
		 	"\\d" 	- all digits
		 	"\\D"	- all non digits
		 	"\\s"	- all white space including tabs, new line and character space
		 	"\\t"	- all tabs
		 	"\\S"	- all non white space
		 	"\\w"	- a-z A-Z 0-9 _    \\W - other than the prior cases
		 	("\\b","XXX")  	- surrounds each word with the "XXX". Example "I am good" - "XXXIXXX XXXamXXX XXXgoodXXX"
		 	
		 	
		 	
		 
		 */
		
		
	}
		
	

}

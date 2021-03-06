package PracticeExercies.Numbers.RegularExpression;

public class Exercise1 {
	
	
	public static void main(String args[])
	{
	
		//Replace characters only if it is in the start index of the string
		System.out.println("AJhsdj1333kkk3k".replaceAll("^AJh", "*"));//  		*sdj1333kkk3k
		
		
		//Replace all characters of a String
		System.out.println("AJhsdj1333kkk3k".replaceAll(".", "*"));//       	****************
		
		
		//Replace the characters that ends with kkk3k$
		System.out.println("AJhsdj1333kkk3k".replaceAll("kkk3k$", "*"));//   	AJhsdj1333**
		
		
		//Replace non sequential characters A,j and 3
		System.out.println("AJhsdj1333kkk3k".replaceAll("[Aj3]", "*"));//   	*Jhsd*1***kkk*k
		
		
		//replace characters [] followed by []. both characters will be replaces
		//replace A J or 3 followed by either h or k
		System.out.println("AJhsdj1333kkk3k".replaceAll("[AJ3][hk]", "*")); //	A*sdj133*kk*
		
		
		System.out.println("Harry".replaceAll("[hH]arry", "Harry")); //Harry
		
		
		
		//Replace characters that are not
		System.out.println("AJhsdj1333kkk3k".replaceAll("[^3A][Y]", "*")); //AJhsdj1333kkk3k
		
		System.out.println("AJhsdj1333kkk3k".replaceAll("[^3A]", "*")); //A******333***3*
		
		
		//Replace characters that are not 3 or A and those characters should be followed by k. onky kkka kibe gets replaces. then bext k has 3 followed
		System.out.println("AJhsdj1333kkk3k".replaceAll("[^3A][k]", "*"));
		
		//Range [] 
		
		System.out.println("#AJhs$dj1333k^kk3_k".replaceAll("[A-Z a-z 1-9]", "*"));//#****$*******^***_*
		
		
		//Case Sensivitve Relace lower and Upper Case (?i) replaces lower and upper case of A-Z
		System.out.println("#AJhs$dj1333k^kk3_k".replaceAll("(?i)[A-Z 1-9]", "*"));
	 	
		
		//Replace all decimals
		System.out.println("#AJhs$dj1333k^kk3_k".replaceAll("\\d", "*"));//#AJhs$dj****k^kk*_k
		
		//Replace all non Decimals
		System.out.println("#AJhs$dj1333k^kk3_k".replaceAll("\\D", "*"));//********1333****3**
		
		
		
		String s = "I have Space  and tabs\t , abnd newLine \n\n within me";
		//Remove white space (space, tabs and new Line)
		System.out.println(s.replaceAll("\\s", ""));
		//IhaveSpaceandtabs,abndnewLinewithinme

		
		
		s = "I have Space  and tabs\t , abnd newLine \n\n within me";
		//Remove non white space
		System.out.println(s.replaceAll("\\S","X"));
		/*
			X XXXX XXXXX  XXX XXXX	 X XXXX XXXXXXX 

		 	XXXXXX XX	  
		 */
		
				
		s = "I have Space  and tabs\t , abnd newLine \n\n within me";
		System.out.println(s.replaceAll("\\t","X"));
		/*
		 	I have Space  and tabsX , abnd newLine 

 			within me	 
		 */
		
	
		//Replace a-z A-Z 1-9 _
		System.out.println("#AJhs$dj1333k^kk3_k".replaceAll("\\w", "*"));//#****$*******^*****
		
		//inverse \\W
		
		
		/*
			The word boundary \b matches on a change from a \w (a word character) to a \W a 
			non word character, or from \W to \w
			
			s = "I am good";
			System.out.println(s.replaceAll("\\b", "X"));
			
			it checks each character say starting with I , I is a (w (characters included in word- depending on our language))
			and sees to the left and right if its transition from word to non word and vice versa
			
			here I character is transition from non word (space) to word(I). the next character is transition from
			word character I to non word space so it adds X along its boundary
			
			where as take am and good. only the first and last characters and transition from word to non word or vice versa
			
			
		 */
		s = "I am good";
		System.out.println(s.replaceAll("\\b", "X")); //XIX XamX XgoodX
		
		
		//in this case the \b would be applied to the word good transition from non word 
		System.out.println(s.replaceAll("\\bgood", "X")); //I am X
		
		//in this case the \b would be applied to the word " good" transition from non word 
		System.out.println(s.replaceAll("\\b good", "X")); //I amX
		
		
		s = "I am good ";//followed by space
		System.out.println(s.replaceAll("\\b good", "X")); //I amX :there is a space before :
		
		
		s = "I am goodeee";//followed by space
		System.out.println(s.replaceAll("\\bgood", "X")); //I am Xeee
		
		
		s = "I am goodeee";
		System.out.println(s.replaceAll("\\bgood\\b", "X")); //I am goodeee
		//when you add \\b at the end sees if the word good transitions from non word to good and from good to non word
		
		s = "I am good&&&";
		System.out.println(s.replaceAll("\\bgood\\b", "X")); //I am X&&&
		
		
		
		//Quantifiers
		
		
		
		s = "I am goodee goodeee";
		System.out.println(s.replaceAll("goode{3}", "X"));// I am goodee X
		
		// ? 0 or 1 times . Replaces even if good is  not followed bye. 0 or 1 time
		s = "I am good goodee goodeee ";
		System.out.println(s.replaceAll("goode?", "X"));//I am X Xe Xee  
		
		
		// * 0 or many times
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("goode*", "X"));//I am X X X 
		
		
		// + 1 or many times
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("goode+", "X"));//I am good X X 

		
		
		
		
		
		
		// ? 0 or 1 times . Replaces even if good is  not followed bye. 0 or 1 time
		s = "I am good goodee goodeee ";
		System.out.println(s.replaceAll("e?", "X"));// XIX XaXmX XgXoXoXdX XgXoXoXdXXX XgXoXoXdXXXX X
				
				
		// * 0 or many times
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("e*", "X"));// XIX XaXmX XgXoXoXdX XgXoXoXdXX XgXoXoXdXX X
				
				
		// + 1 or many times
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("e+", "X"));//I am good goodX goodX 
		
		
		
		
		
		// ? 0 or 1 times . Replaces even if good is  not followed bye. 0 or 1 time
		s = "I am good goodee goodeee ";
		System.out.println(s.replaceAll("[e?]", "X"));// I am good goodXX goodXXX :
						
						
		// * 0 or many times
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("[e*]", "X"));// I am good goodXX goodXXX :
						
						
		// + 1 or many times
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("[e+]", "X"));// I am good goodXX goodXXX :
		
		
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("goode{3}", "X"));// I am good goodee X :
		
		
		s = "I am good goodee goodeee "; 
		System.out.println(s.replaceAll("goode{2,3}", "X"));// I am good X X :
		
		
		//Union
		
		s="foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0";
		System.out.println(s.replaceAll("foolish[1-4[8-9]]", "X"));// XXXXfoolish5foolish6foolish7XXfoolish0
		
		
		
		s="foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0";
		System.out.println(s.replaceAll("foolish[^1-4[8-9]]", "X"));// foolish1foolish2foolish3foolish4XXXXXX
		
		s="foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0";
		System.out.println(s.replaceAll("foolish[1-4[^8-9]]", "X"));// XXXXXXXfoolish8foolish9X

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		s="foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0";
		System.out.println(s.replaceAll("foolish[^1-4[^8-9]]", "X"));// XXXXXXXXXX :this nullifies everthing. think deep
		
		System.out.println("0123456789".replaceAll("[^1-4[^8-9]]", "X"));//XXXXXXXXXX
		
		
		//Intersection
		s="foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0";
		System.out.println(s.replaceAll("foolish[1-4&&[8-9]]", "X"));// foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0
		
		
		s="foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0";
		System.out.println(s.replaceAll("foolish[1-4&&[3-9]]", "X"));// foolish1foolish2XXfoolish5foolish6foolish7foolish8foolish9foolish0
		
		
		//Subtracton
		s="foolish1foolish2foolish3foolish4foolish5foolish6foolish7foolish8foolish9foolish0";
		System.out.println(s.replaceAll("foolish[1-9&&[^3-5]]", "X"));//XXfoolish3foolish4foolish5XXXXfoolish0
		
		
		
		//Qunaifiers
		s=" f aaaaa a faal fa f";
		System.out.println(s.replaceAll("a?", "X"));
		//X XfX XXXXXX XX XfXXXlX XfXX XfX
		
		s=" f aaaaa a faal fa f";
		System.out.println(s.replaceAll("a*", "X"));
		//X XfX XX XX XfXXlX XfXX XfX
		
		
		s=" f aaaaa a faal fa f";
		System.out.println(s.replaceAll("a+", "X"));
		// f X X fXl fX f

		
		
		//groups
		s="dogdogdogdogdogdog";
		System.out.println(s.replaceAll("(dog){3}", "X"));//XX
		
		s="dog dog dog dog dog dog";
		System.out.println(s.replaceAll("(dog){3}", "X"));//dog dog dog dog dog dog
		
		
		s="a";
		System.out.println(s.replaceAll("[amn]?", "X"));//XX
		
		s="am";
		System.out.println(s.replaceAll("[amn]?", "X"));//XXX
	}
	

}

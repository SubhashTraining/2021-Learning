package PracticeExercies.Numbers;

import java.text.DecimalFormat;
import java.util.Arrays;

public class PrimitiveTypes {
	
	
	public static void main(String args[])
	{
		
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		System.out.println(Integer.MAX_VALUE+1); //-2147483648  Stack overflow
		System.out.println(Integer.MIN_VALUE-1);//2147483647  stack underflow
		
		
		double value = 728768.524233;
		DecimalFormat  dFormat = new DecimalFormat(".##");
		double floatvalue =Double.valueOf(dFormat.format(value));//dformat.format returns a string. 
		System.out.println(floatvalue);//728768.52
		System.out.printf("%.3f",value);//728768.524
		System.out.println();
		int i=1;		
		System.out.println(String.format("%04d",i));//0001	need to specify 0 to replace blank with0
		System.out.println(String.format("%.2f", value));//728768.52
		System.out.printf("%,.4f",value);//728,768.5242
		System.out.println();
		System.out.printf("%d %s", 32,"Subhash");//32 Subhash   d- decimal , f- float, c - character, b-boolean, s-string)
		System.out.println();
		
		
	
		
		
		int secondPart = 300;
		String conatc = "Concat"+secondPart;
		System.out.println(conatc);//Concat300
		
		
		
		//SubString
		String name = "Subhash Suganya Sanjay";
		System.out.println("Fathers Name: "+name.substring(0,7));//The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
		System.out.println("Mothers Name: "+name.substring(8,15));
		System.out.println("Kids Name: "+name.substring(16));
		System.out.println(name.substring(name.indexOf("Sa")));// Sub string with start index
		
		//characters to integer
		//ASCII of A - 65  Z-90 a-97 z-122
		
		int number = 'I'+32;
		System.out.println(number);//105
		
		//Convert lower case to upper case 
		//A-Z 65 to 90 a-z 97-122
		
		
		String string= "Subhash";
		char[] stringArray = string.toCharArray();
		for(char c:stringArray)
		{
			int character =(char)c;
			if(character >=65 && character <=90)
			{
				character +=32;
			}
			else if(character >=97 && character <=122 )
			{
				character -=32;
			}
			
			System.out.print((char)character);
		}
		System.out.println();
		
		System.out.println(stringArray);//will return string of the char Array
			
		//String Builder
		
		StringBuilder builder = new StringBuilder("Subhash Sanjay Suganya");
		builder.append(" family");
		System.out.println(builder);//Subhash Sanjay Suganya family
		builder.delete(0, 7);//deletes inde [7-1]
		System.out.println(builder);//Subhash Sanjay Suganya family
		builder.trimToSize();
		builder.substring(0);
		builder.substring(0, 1); //end-1
		builder.indexOf("str");
		builder.indexOf("s", 0);
		builder.lastIndexOf("s",0);// last index if multiple entries of string
		builder.delete(0, 5);
		builder.deleteCharAt(5);
		builder.reverse();
		builder.replace(0, 1, "str");
		builder.length();
		builder.charAt(5);
		builder.insert(3,"Subhash"); 
		
		
		StringBuilder sb1 = new StringBuilder("Subhash");
		System.out.println(sb1.replace(1, 2, "new String"));//Snew Stringbhash   -end would be adjusted accordingly
		System.out.println(sb1.replace(0, 5, "BB"));//BBStringbhash    - the char from 2 to 4 or truncated

		
		//String builder is not thread safe , string buffer is thread Safe (synchronized). String builder has better performance
		
		StringBuffer sbuffer = new StringBuffer("Subhash is a good boy");
		sbuffer.append(" isnt it?");
		sbuffer.charAt(6);
		sbuffer.insert(4, "Subhash");
		sbuffer.trimToSize();
		//same as builder
		
		
		String s= "SUBHASH";
		
		char[] charArray = s.toCharArray();
		System.out.println(Arrays.toString(charArray));//[s, u, b, h, a, s, h]
		System.out.println(charArray);//subhash
		
		
		int[] ikdf={1,2,3,4,4,44,3};
		System.out.println(Arrays.toString(ikdf).replaceAll("[, \\[\\]]",""));//12344443
		
		
	}

}

package StringQuestions;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/*
 * public String reverse(String string)
{
	
 char[] charArray = string.toCharArray();
	
	int i=0;
	int j=charArray.length-1;
	if(string.isEmpty() || string==null)
	{
		return string;
	}
  
  Tried this code. Here when we convert string to charArray we should not pass null ; if the paramenter is null then null pointer exception is raised
  
  changed the code to 
  public String reverse(String string)
  {
  if(string.isEmpty() || string==null)
	{
		return string;
	}
  
  char[] charArray = string.toCharArray();
	
	int i=0;
	int j=charArray.length-1;
	
	
	
	Char[] charArray = string.charArray();
	charArray.toString() - [C@6e5e91e4
	always use arrayName only to return the elements of the array 
	return(CharArray) and not return(CharArray.toString)
	
  
 */


public class ReverseString {
	
	
	public String reverse(String string)
	{
		if(string==null || string.isEmpty())
		{
			return string;
		}
		char[] charArray = string.toCharArray();
		
		int i=0;
		int j=charArray.length-1;
		
		while(i<j)
		{
					
			swap(charArray,i,j);
			i++;
			j--;
		}		
		System.out.println(charArray.toString());//[C@6e5e91e4- return as return(charArray)
		System.out.println(charArray);//print the array as String
		return new String(charArray);
		
		
	}
	
	public static void swap(char[] charArray,int i, int j)
	{
		
		char temp = charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		
		
	}	
		
		
		
	
	@Test
	public void reverseEmptyString() {
		Assert.assertEquals("",reverse(""));
		//throwed Assert is depreciated as i was using import junit.framework.Assert; instead of import static org.junit.Assert.*;		
	}

	@Test
	public void reverseNullString()
	{
		Assert.assertEquals(null,reverse(null));
	}
	
	@Test
	public void PositiveTest1()
	{
		Assert.assertEquals("abc",reverse("cba"));
	}
	
	@Test
	public void PositiveTest2()
	{
		Assert.assertEquals("Nelson", reverse("nosleN"));
			
	}
	
	@Test
	public void NegativeTest()
	{
		Assert.assertEquals("abc", reverse("abc"));
	}
	
}

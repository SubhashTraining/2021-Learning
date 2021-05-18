package PracticeExercies.Numbers.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuilder htmlText =new StringBuilder().append("</Head>Regular Expression</Head>");
		htmlText.append("<h2>Introduction</h2> </P> Some Text</P><h2>Summary</h2><P> Conclude the summary</p>");
		String html = htmlText.toString();
		System.out.println(html);
		String regex = "<h2>";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(html);
		System.out.println(matcher.matches());//false
		/*
		 	We are expecting true here. the regular expression consumes the entire string and checks for the match
		 	matcher.matches - true if, and only if, the entire region sequence matches this matcher's pattern
		 */
		
		regex=".*<h2>.*";
		pattern = pattern.compile(regex);
		matcher = pattern.matcher(html);
		System.out.println(matcher.matches());//true
		
		matcher.reset();//matcher functions has some internal setup so we to need to reset it every time we use it
		int counter=0;
		while(matcher.find())
		{
			counter++;
			System.out.println("Occurrence:"+counter+", starting from index:"+matcher.start()+" ending at index:"+matcher.end());
			
		}
		
		//Occurance:1, starting from index:0 ending at index:117
		// Here the we are checking for the entire string .*<h2>.* not <h2> alone
		
		/*
		 Matcher.matches -  Attempts to match the entire region against the pattern. 
		 
		 Matcher.find 	 - Attempts to find the next subsequence of the input sequence that matchesthe pattern. 
		 This method starts at the beginning of this matcher's region, or, if a previous invocation of the method was successful 
		 and the matcher has not since been reset, at the first character not matched by the previous match. 

		 so use matcher.find to find the exact match
		 */
		
		
		
		regex = "<h2>";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(html);
		counter=0;
		while(matcher.find())
		{
			counter++;
			System.out.println("Occurrence:"+counter+", starting from index:"+matcher.start()+" ending at index:"+matcher.end());
			
		}
		
		/*
		Occurrence:1, starting from index:32 ending at index:36
		Occurrence:2, starting from index:72 ending at index:76
		*/
		
		//grouping
		regex ="(<h2>.*</h2>)";//greedy quantifier
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(html);
		counter=0;
		while(matcher.find())
		{
			counter++;
			System.out.println("Occurrence:"+counter+", starting from index:"+matcher.start()+" ending at index:"+matcher.end());
			
		}
		//Occurrence:1, starting from index:32 ending at index:89
		//starting from first <h2> and the end of second </h2>
		
		
		regex = "(<h2>.*?</h2>)";//reluctant quantifier
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(html);
		counter=0;
		while(matcher.find())
		{
			counter++;
			System.out.println("Occurrence:"+counter+", starting from index:"+matcher.start()+" ending at index:"+matcher.end());
			
		}
		
		/*
		 	Occurrence:1, starting from index:32 ending at index:53
			Occurrence:2, starting from index:72 ending at index:89
		 */
		
		
		//grouping
		regex = "(<h2>)(.*?)(</h2>)";//reluctant
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(html);
		counter=0;
		while(matcher.find())
		{
			counter++;
			System.out.println("Occurrence:"+counter +":"+matcher.group(2));
			
		}
		
		/*
		 	Occurrence:1:Introduction
			Occurrence:2: Summary

		 */
		
	}

}

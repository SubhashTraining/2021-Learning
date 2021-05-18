package LamdaExpression1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		List<String> bingoNumbers = Arrays.asList(
		
				"A12", "A15", "A17",
				"B12", "B08", "B45","b09",
				"C01", "C15", "C16",
				"H12", "H15", "H17");

		
		
		List<String> bNumbers = new ArrayList<>();
		
		bingoNumbers.forEach(numbers -> {
			if(numbers.toUpperCase().startsWith("B"))
			{
				bNumbers.add(numbers.toUpperCase());
			}
		});
		
		
		bNumbers.sort((s1,s2)-> s1.compareTo(s2));
		bNumbers.forEach(no -> System.out.println(no));
		
	}

}

package PracticeExercies.Numbers;



public class class1 {

	public static void main(String[] args) {
		
		// instantiate inner class
		classes outerclass = new classes();
		classes.innerClass InnerClass = outerclass.new innerClass();
		InnerClass.PrintMessage();
		
		//instantiate static inner class
		classes.innerStaticClass staticInnerClass = new classes.innerStaticClass();
		staticInnerClass.display();
	

	}

}

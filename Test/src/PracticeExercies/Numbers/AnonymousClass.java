package PracticeExercies.Numbers;

public class AnonymousClass {
	
	
	interface Hello{
		
		public void SayHello();
		public void GreetSomeone();
				
	}
	
	 public void Greet()
	 {
		 
		 class greetEnglish implements Hello{

			@Override
			public void SayHello() {
				System.out.println("Hello");
			}
			
			@Override
			public void GreetSomeone() {
				System.out.println("Hello Welcome");
			}			 
		 }
		 
		 
		 Hello greetFrench = new Hello(){

				@Override
				public void SayHello() {
					System.out.println("Oolaaa");
					
				}
				@Override
				public void GreetSomeone() {
					System.out.println("Oooolaa Welcomeee");
					
				}		 			 
			 };
		 
		 Hello greetSpanish = new Hello(){

			@Override
			public void SayHello() {
				System.out.println("Heloeeheyye");
				
			}

			@Override
			public void GreetSomeone() {
				System.out.println("Heloeee Welcomeede");				
			}		 
		 };
		 
		 
		 greetEnglish englishGreet = new greetEnglish();
		 englishGreet.SayHello();
		 englishGreet.GreetSomeone();
		 
		 
		 greetSpanish.SayHello();
		 greetSpanish.GreetSomeone();
		 
		 greetFrench.SayHello();
		 greetFrench.GreetSomeone();
		 
		 
		 
	 }

}



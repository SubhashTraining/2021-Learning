package PracticeExercies.Numbers;

public class SingletonClass2 {
	
	public static void main(String[] args) {
		
		SingletonClass singletonClass = SingletonClass.getInstance();
		singletonClass.setName("Subhash");
		singletonClass.setSeason(SingletonClass.seasons.SPRING);
		System.out.println(singletonClass.getSeason().getOrder());
	}
	

}

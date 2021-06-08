import org.testng.annotations.Test;

public class testNg {
	
	@Test(priority=1)
	public void start()
	{
		System.out.println("Start");

	
	}
	
	@Test(priority=2)
	public void run()
	{
		System.out.println("run");
	}
	
	@Test(priority=3)
	public void stop()
	{
		System.out.println("Stop");
	}

}

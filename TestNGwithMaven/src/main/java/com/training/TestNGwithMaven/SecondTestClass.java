package com.training.TestNGwithMaven;

import org.testng.annotations.Test;

public class SecondTestClass {

	

	
	@Test(priority=1)
	public void start()
	{
		System.out.println("2-Start");

	
	}
	
	@Test(priority=2)
	public void run()
	{
		System.out.println("2-run");
	}
	
	@Test(priority=3)
	public void stop()
	{
		System.out.println("3-Stop");
	}
}

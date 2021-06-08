package com.training.TestNGwithMaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {

		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Every Method");
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After Every Method");
		}
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before Every Class");
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("After Every Class");
		}
		
		
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

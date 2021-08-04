package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL"})
	@Test
	public void Day2_1(String uname) {
		
		System.out.println("Demo2");
		System.out.println("Day2: "+ uname);
		
	}
	
	@Test(groups= {"Smoke"})
	public void Day2() {
		
		System.out.println("Demo2");
		
	}
	
	@BeforeTest
	public void FirstExecution() {
		
		System.out.println("I will be executed first.");
		
	}
	

}

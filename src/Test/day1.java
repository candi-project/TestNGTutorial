package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	
	@AfterTest
	public void LastExecution() {
		
		System.out.println("I will be executed last.");
		
	}
	
	
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		
		System.out.println("Demo");
		
	}

}

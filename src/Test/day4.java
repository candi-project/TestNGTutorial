package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void WebHomeLogin() {
		
		System.out.println("WebHomeLogin");
		
	}
	
	@Test
	public void MobileHomeLogin() {
		
		System.out.println("MobileHomeLogin1");
		
	}
	
		
	
	
	@Test(groups= {"Smoke"})
	public void APIHomeLogin() {
		
		System.out.println("APIHomeLogin");
		
	}
	
	@BeforeSuite
	public void BfSuite() {
		
		System.out.println("I am No 1.");
		
	}
	
	
	
	
	
}

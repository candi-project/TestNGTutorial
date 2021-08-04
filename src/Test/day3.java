package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before executing all methods in the class.");
	}
	
	@BeforeMethod
	public void BeforeEveryMethod()
	{
		System.out.println("I will execute before every method in class day3.");
	}
	
	@AfterMethod
	public void AfterEveryMethod()
	{
		System.out.println("I will execute after every method in class day3.");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebCarLogin(String urlname,String username) 
	{
		
		System.out.println("WebCarLogin");
		System.out.println("WebCarLogin: "+urlname);
		System.out.println("WebCarLogin: "+username);
		
	}
	
	@Test(groups= {"Smoke"})
	public void MobileCarLogin() 
	{
		
		System.out.println("MobileCarLogin1");
		Assert.assertTrue(false);
		
	}
	
	@Test(groups= {"Smoke"})
	public void MobileCarLogin2() 
	{
		
		System.out.println("MobileCarLogin2");
		
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After executing all methods in the class.");
	}
	
	//@Test(timeOut=4000)
	@Test(dataProvider="getData")
	public void MobileCarLogin3(String username, String password) 
	{
		
		System.out.println("MobileCarLogin3");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@Test(dependsOnMethods= {"WebCarLogin"})
	public void APICarLogin() 
	{
		
		System.out.println("APICarLogin");
		
	}
	
	@AfterSuite(enabled=false)
	public void AfSuite()
	{
		System.out.println("I am No 1 from the last.");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username, password-good credit history
		//2nd username, password-no credit history
		//3rd username, password-fraudulent history
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0]= "firstUserName";
		data[0][1]= "firstPassword";
		
		//2nd set
		data[1][0]= "secondUserName";
		data[1][1]= "secondPassword";
		
		//3nd set
		data[2][0]= "thirdUserName";
		data[2][1]= "thirdPassword";
		
		return data;
		
	}
	
	
	
	
}

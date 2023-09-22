package Day2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSearch {
	
	ReadConfg rc=new ReadConfg();
	
	
	String URL=rc.getapplicationURL();
	String username=rc.getUsername();
	String password=rc.getPassword();
	
	String checkindate=rc.getCheckinDate();
    String checkoutdate=rc.getCheckoutDaate();
 
	
	public RemoteWebDriver driver;
	
	@BeforeClass
	
	public void OpenApplication() 
	{
		//launch the web driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek Acharya\\anusha\\Testng1\\src\\automation\\automationTest\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		
	}
	
	@AfterClass
	public void CloseApplication()
	{
		
		driver.close();
	}

}

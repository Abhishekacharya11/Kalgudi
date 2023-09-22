package Day2;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Day2.LoginPage1;
import Day2.SearchHotel;

public class TC_searchHotel extends BaseSearch{
	
	@Test
	public void searchhoteltest(){
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		LoginPage1 lp=new LoginPage1(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		SearchHotel sh=new SearchHotel(driver);
		
		sh.setLocation();
		
		sh.setSelectHotel();
		
		sh.setRoomType();
		
		sh.setNoofRooms();
		
		sh.setCheckinDate(checkindate);
		
		sh.setCheckoutDate(checkoutdate);
		
		sh.setAdultsperroom();
		sh.setChildrensperroom();
		
		sh.clickSearchbtn();
	}




}

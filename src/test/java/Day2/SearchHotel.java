package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
public static WebDriver driverr;
	
	public SearchHotel(WebDriver driverl){
		
		driverr=driverl;
		PageFactory.initElements(driverl, this);
		
	}
	
	@FindBy(id="location")
	WebElement drpdwn;
	
	@FindBy(id="hotels")
	WebElement drpdownshotels;
	
	@FindBy(id="room_type")
	WebElement dropdownrtype;
	
	@FindBy(id="room_nos")
	WebElement dropdownsrnos;
	
	@FindBy(id="datepick_in")
	WebElement checkindate;
	
	@FindBy(id="datepick_out")
	WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	WebElement adultroom;
	
	@FindBy(id="child_room")
	WebElement childroomdrop;
	
	@FindBy(id="Submit")
	WebElement btnSearch;
	
	
	public void setLocation(){
		
		Select sc=new Select(drpdwn);
		sc.selectByVisibleText("Sydney");
	}
	
	public void setSelectHotel(){
		Select sc=new Select(drpdownshotels);
		sc.selectByVisibleText("Hotel Creek");
	}
	
	public void setRoomType(){
		
		Select sc=new Select(dropdownrtype);
		sc.selectByIndex(2);
				
	}
	
	public void setNoofRooms(){
		
		Select sc=new Select(dropdownsrnos);
		sc.selectByIndex(1);
	}
	
	public void setCheckinDate(String cdate){
		
		checkindate.sendKeys(cdate);
		
	}
	
	public void setCheckoutDate(String checkdate){
		checkoutdate.sendKeys(checkdate);
	}
	
	public void setAdultsperroom(){
		
		Select sc=new Select(adultroom);
		sc.selectByIndex(1);
	}
	
	public void setChildrensperroom(){
		Select sc=new Select(childroomdrop);
		sc.selectByIndex(2);
	}
	
	public void clickSearchbtn(){
		btnSearch.click();
	}




}

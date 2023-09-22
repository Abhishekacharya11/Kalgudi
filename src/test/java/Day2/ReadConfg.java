package Day2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfg {
	

	Properties pro;
	
	public ReadConfg()
	{
		
		File src=new File("./Configuration/config.properties");
		
		try{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getapplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String uname=pro.getProperty("username");
		return uname;
	}
	
	public String getPassword()
	{
		String pword=pro.getProperty("password");
		return pword;
	}
	
	/*public String getChromePath()
	{
		String cpath=pro.getProperty("chromepath");
		return cpath;
	}*/
	
	public String getCheckinDate()
	{
		String cdate=pro.getProperty("checkindate");
		return cdate;
	}
	
	public String getCheckoutDaate()
	{
		String coDate=pro.getProperty("checkoutdate");
		return coDate;
	}

}

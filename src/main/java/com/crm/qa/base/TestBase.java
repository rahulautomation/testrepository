package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestBase {

	 public static WebDriver driver;
     public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fin = new FileInputStream("D:\\new workspace\\FreeCRMTest\\src\\main\\java\\com\\"
					+ "crm\\qa\\configu\\config.properties");
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		 
		
		 
		
		}
	
	public static void initilazitatilon() {
		
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(browsername.equals("safari")) {
			System.setProperty("webdriver.safari.driver","D:\\library\\safaridriver.exe");
			driver = new SafariDriver();
		}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			driver.get(prop.getProperty("url"));
			
			
			
			
			
		
			
		}
		
		
		
	}
	

	
	


package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Properties loc;
	
	public static void loadConfig() {
		//DOMConfigurator.configure("log4j.xml");

		try {
			prop = new Properties();
			loc =new Properties();
			File f= new File("C:\\Users\\nsah\\APIDemo\\MonitorUICucumber\\Configuration\\Config.properties");
			FileInputStream ip = new FileInputStream(f);
			//FileInputStream ip = new FileInputStream(
				//System.getProperty("C://Users/nsah/APIDemo/MonitorUICucumber/Configuration/Config.properties"));
			FileInputStream ipLocator = new FileInputStream(
					System.getProperty("user.dir") + "/Configuration/locator.properties");
			
			prop.load(ip);
			loc.load(ipLocator);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void launchApp()  {
		loadConfig();
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
		Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 30);
		System.out.println("*************");
		System.out.println(prop.getProperty("url"));
		System.out.println("*************");
		driver.get(prop.getProperty("url"));
	}
	
	public static void quitBrowser()   {	
   	 	driver.quit();	
	}
}

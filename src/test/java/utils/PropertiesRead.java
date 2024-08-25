package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	
	
	public static void main(String[] args) throws IOException {
		getProperty();
	}
	
	
	public static void getProperty() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\nsah\\APIDemo\\MonitorUICucumber\\src\\test\\resources\\Config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		
	}

}

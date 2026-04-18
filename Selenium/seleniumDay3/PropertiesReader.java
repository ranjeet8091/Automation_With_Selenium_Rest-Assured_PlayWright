package seleniumDay3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	public static Properties loadProperties(String filePath) throws IOException {
		Properties prop = new Properties();
		
		try(FileInputStream fis = new FileInputStream(filePath)){
			prop.load(fis);
		}
		
		return prop;
	}
	
	public static void main(String[] args) throws IOException {
		String propertiesFilePath = "config.properties";
		Properties config= loadProperties(propertiesFilePath);
		
		String baseUrl = config.getProperty("baseUrl");
		String username = config.getProperty("username");
		String password = config.getProperty("password");
		
		System.out.println("Base Url: " + baseUrl);
		System.out.println("Base Url: " + username);
		System.out.println("Base Url: " + password);
	}

	

}

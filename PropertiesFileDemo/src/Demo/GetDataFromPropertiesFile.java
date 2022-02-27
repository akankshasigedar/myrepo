package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesFile {

	public static void main(String[] args) {

		String path = "F:\\velocity-software testing\\PropertiesFileDemo\\config.properties";

		// Code to get the data from Properties file
		File file = new File(path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {

		}
		Properties prop = new Properties();
		// Load properties file
		try {
			prop.load(fis);
		} catch (IOException e) {

		}
		System.out.println("The URL from properties file is " + prop.getProperty("url"));
		System.out.println("The Username from properties file is " + prop.getProperty("username"));
		System.out.println("The Environment from properties file is " + prop.getProperty("environment"));
	}
}
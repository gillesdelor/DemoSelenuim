package AdvancedDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		Properties p1 = new Properties();
		
		FileInputStream file = new FileInputStream
				
	    ("C:\\Users\\Gilles Z\\Desktop\\Selenium\\SeleniumScripts\\DemoSelenuim\\Files\\Studproperties.txt");
		
		p1.load(file);
		
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("course"));
		System.out.println(p1.getProperty("sub-course"));
		System.out.println(p1.getProperty("time"));

		
	}
}

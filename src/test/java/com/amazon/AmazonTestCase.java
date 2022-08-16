package com.amazon;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestCase {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	@Before
	public void setUp() throws IOException {
		
		//System.out.println(System.getProperty("user.dir"));
		fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\testdata.properties");
		prop.load(fr);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		
	}
	

}

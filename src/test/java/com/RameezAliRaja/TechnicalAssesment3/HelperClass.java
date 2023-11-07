package com.RameezAliRaja.TechnicalAssesment3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {

	private static HelperClass helperclass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int Time = 8;
	
	HelperClass(){
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(Time));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));
		driver.manage().window().maximize();
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperclass==null) {
			helperclass= new HelperClass();
		}
	}
		
	public static void tearDown() {
			if(driver!=null) {
				driver.close();
				driver.quit();
			}
			helperclass = null;
}
}

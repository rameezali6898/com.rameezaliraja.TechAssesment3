package com.RameezAliRaja.TechnicalAssesment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {

	String Url,FName,LName,EMail,Pass,Conf;
	
	public UtilityClass() {
		datas();
	}
	
	public void datas() {
		File file = new File("C:\\Users\\rmohamedibrahim\\eclipse-workspace\\com.RameezAliRaja.TechnicalAssesment3\\src\\test\\resources\\Features\\login.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Url = prop.getProperty("url");
		FName = prop.getProperty("FirstName");
		LName = prop.getProperty("LastName");
		EMail = prop.getProperty("email");
		Pass = prop.getProperty("Password");
		Conf = prop.getProperty("Confirm");
		
		
}
}

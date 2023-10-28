package com.wipro.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() {
		
		File src = new  File("./config/config.properties");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to read config file");
		}
		
		
		
	}
	
	public String getDataFromConfig(String KeyToSearch) {
		
		return pro.getProperty(KeyToSearch);
		
		
	}
	
	public String getBrowser() {
		
		return pro.getProperty("browser");
		
	}
	
public String getStagingURL() {
		
		return pro.getProperty("qaURL");
		
	}

}

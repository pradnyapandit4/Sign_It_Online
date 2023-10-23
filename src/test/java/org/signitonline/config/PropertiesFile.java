package org.signitonline.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static Properties prop = new  Properties();
	
	public static void readproperties() {
		
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "");
			prop.load(input);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeproperties() {
		
		try {
			OutputStream output = new FileOutputStream(System.getProperty("user.dir") + "");
			prop.setProperty("dev", "");
			prop.setProperty("stage", "");
			prop.setProperty("Result", "Pass");
			prop.store(output, null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String devurl() {
		String developmenturl = "";
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "");
			prop.load(input);
			prop.getProperty("dev");
			developmenturl = prop.getProperty("dev");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return developmenturl;
	}
	
	public static String produrl() {
		String productionurl = "";
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "");
			prop.load(input);
			prop.getProperty("stage");
			productionurl = prop.getProperty("stage");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return productionurl;
	}
}

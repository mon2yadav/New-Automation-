package propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

import baseliberary.Baseliberary;

public class Property_Utility extends Baseliberary {
	
	public String propertyutlity(String key) {
		String path="";
		String value="";
		try {
			FileInputStream fis=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fis);
			value=prop.getProperty(key).trim();
		} catch (Exception e) {
			System.out.println("Issue in get read data from configure file "+e);
		}
		return value;
	}
	

}

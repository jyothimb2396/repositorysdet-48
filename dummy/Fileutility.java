package Generics;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Fileutility {

	public  String getPropertyKeyValue(String key) throws IOException 
	{
		FileInputStream fis = new	FileInputStream("./HybridFramePractice/data/actitime.properties");
		Properties p=new Properties();
		p.load(fis);
		String  value = p.getProperty(key);
		return value;
	}

}

package genericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	
	public String readPropData(String propPath,String key) throws Throwable {
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String propValue = prop.getProperty(key, "InCorrectKey");
		return propValue;
	}

}

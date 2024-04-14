package Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader f = new FileReader("/Users/vivekkumar/eclipse-workspace/TestProject/src/Test/config.properties");
		Properties prop = new Properties();
		prop.load(f);
		System.out.println(prop.getProperty("url"));

	}

}

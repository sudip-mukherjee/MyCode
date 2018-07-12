package Day3.propertiesFileExample;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	public static void main(String[] args) {
		try {
			
			Properties prop = new Properties();
			FileReader fr = new FileReader("conf/config.properties");
			prop.load(fr);
			
			String username = prop.getProperty("user");
			String password = prop.getProperty("password");
			String url = prop.getProperty("url", "url not found");
			String driver = prop.getProperty("Driver");
			
			System.out.println(password);
			System.out.println(username);
			System.out.println(url);
			System.out.println(driver);

		} catch (IOException  e) {
			e.printStackTrace();
		}
	}

}

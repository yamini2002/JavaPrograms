package java_programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public Properties checkTheBalance() throws IOException {
		Properties properties = new Properties();
		String filepath = System.getProperty("user.dir") + "\\Datas\\Balance.properties";
		FileInputStream file = new FileInputStream(filepath);
		properties.load(file);
		file.close();
		return properties;
	}
}

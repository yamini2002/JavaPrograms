package java_programs;

import java.io.*;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

//	public Properties checkTheBalance() throws IOException {
//		Properties properties = new Properties();
//		String filepath = System.getProperty("user.dir") + "\\Datas\\Bank.properties";
//		FileInputStream file = new FileInputStream(filepath);
//		properties.load(file);
//		file.close();
//		return properties;
//	}

	public int getValue(String key) {
		Properties properties = new Properties();
		String filepath = System.getProperty("user.dir") + "\\Datas\\Bank.properties";

		try (InputStream input = new FileInputStream(filepath)) {
			properties.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		int balance = Integer.parseInt(properties.getProperty(key));

		return balance;
	}

	public void setValue(String key, String value) {
		System.out.println(key + " " + value);
		Properties properties = new Properties();
		String filepath = System.getProperty("user.dir") + "\\Datas\\Bank.properties";

		try (InputStream input = new FileInputStream(filepath)) {
			properties.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		properties.setProperty(key, value);

		try (FileOutputStream output = new FileOutputStream(filepath)) {
			properties.store(output, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

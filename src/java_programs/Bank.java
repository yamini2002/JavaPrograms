package java_programs;

import java.io.IOException;
import java.util.Properties;

public class Bank {

	static Bank obj = new Bank();
	ReadProperty balance = new ReadProperty();

	public void checkBalance() throws IOException {
		Properties properties = balance.checkTheBalance();
		for (String key : properties.stringPropertyNames())
			System.out.println(key + " = " + properties.getProperty(key));
	}

	public static void main(String[] args) throws IOException {
		obj.checkBalance();
	}
}

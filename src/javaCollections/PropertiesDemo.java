package javaCollections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("\\Eclipse\\eclipse-workspace\\learnJava\\src\\javaCollections\\test.properties");
		p.load(fis);
//		System.out.println(p);
		String s = p.getProperty("idli");
		System.out.println(s);
		p.setProperty("idli", "30");
		FileOutputStream fos = new FileOutputStream("\\Eclipse\\eclipse-workspace\\learnJava\\src\\javaCollections\\test.properties");
		p.store(fos, "Updated Price");
		System.out.println(p);
//		System.out.println(p);

	}

}

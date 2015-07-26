package main.webapp.test.AutoWire;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LoggerSupport {

	public void write(){
		System.out.println("FileWriter called");
	}
}

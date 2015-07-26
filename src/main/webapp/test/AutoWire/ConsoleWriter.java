package main.webapp.test.AutoWire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("newsquirrel")
@Qualifier("consolewriter")
public class ConsoleWriter implements LoggerSupport{

	public void write(){
		System.out.println("consoleWriter called");
	}
	
}

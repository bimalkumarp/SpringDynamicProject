package main.webapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 
		ApplicationContext context=new FileSystemXmlApplicationContext("/src/beans.xml");
		/*Person person=(Person)context.getBean("person");
		//Person person2=(Person)context.getBean("person");
	 
		System.out.println(person);
		//System.out.println(person2);
		
		
		Address address=(Address)context.getBean("address2"); //Using Pnamespace in beans.xml
		System.out.println(address);
		*/
		
		FruitBasket basket=(FruitBasket) context.getBean("fruitbasket");//Initiaizing List or set
		System.out.println(basket);
		
		((FileSystemXmlApplicationContext)context).close();

	}

}

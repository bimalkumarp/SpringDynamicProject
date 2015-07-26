package main.webapp.test;

public class PersonFactory {

	private   Person getInstance(int id,String name){//factroy mnethod out of the bean must be non static and inside bean it must be static
		System.out.println("getInstance of PersonFactory is called !!");
		return new Person(id,name);
	}
	
}

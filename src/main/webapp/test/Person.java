package main.webapp.test;

public class Person {
private int id;
private String name;
private int taxId;
private Address address;

public Person(){
	
}


public Person(int id, String name) {
	 
	this.id = id;
	this.name = name;
}

////factroy mnethod out of the bean must be non static and inside bean it must be static
private static Person getInstance(int id,String name){
	System.out.println("Factory method called");
	return new Person(id,name);

}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTaxId() {
	return taxId;
}
public void setTaxId(int taxId) {
	this.taxId = taxId;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public void initMethod(){
	//System.out.println("Init method called"+this);
}
public void destMethod(){
	//System.out.println("Destroy method called"+this);
}


@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
			+ ", address=" + address + "]";
}



}

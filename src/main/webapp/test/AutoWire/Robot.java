package main.webapp.test.AutoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Robot {

	
	
	private int id=0;
	private String speech="hello";
	
	
	public int getId() {
		return id;
	}
	
	@Autowired
	public void setId(@Value("1123") int id) {
		this.id = id;
	}
	public String getSpeech() {
		return speech;
	}
	@Autowired
	public void setSpeech(@Value("I ll be back !")String speech) {
		this.speech = speech;
	}

	@Override
	public String toString() {
		return "Robot [id=" + id + ", speech=" + speech + "]";
	}
	
	
}

package guiceservlet;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Oneplus implements MobileInterface{
	String name="OnePlus 7Pro";
	String processor="Snapdragon o 860";
	public String getDetails() {
		return "I have a Oneplus phone nameing "+name+" and it has processor "+processor+" in it. :)";
	}
	@Inject(optional = true)
	public void setName(@Named("SetName")String name) {
		this.name = name;
	}
	@Inject(optional = true)
	public void setProcessor(@Named("SetProcessor")String processor) {
		this.processor = processor;
	}
	
}

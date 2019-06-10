package guiceservlet;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Redmi implements MobileInterface{
	String name="Redmi 7pro";
	String processor="SnapDragon r 820";
	public String getDetails() {
		return ("I have a Redmi phone nameing "+name+" and it has processor "+processor+" in it. :)");
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

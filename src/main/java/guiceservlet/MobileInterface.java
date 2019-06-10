package guiceservlet;

import com.google.inject.ImplementedBy;

@ImplementedBy(Redmi.class)
public interface MobileInterface {
	String getDetails();
}

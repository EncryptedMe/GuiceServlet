package guiceservlet;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceCheckMainClass {

	public static void main(String[] args) {
		Injector i = Guice.createInjector(new GuiceModule());
		MobileInterface ms = i.getInstance(MobileInterface.class);
		System.out.println(ms.getDetails());

	}

}

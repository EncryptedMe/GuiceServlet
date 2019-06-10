package guiceservlet;
import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class MainClass extends GuiceServletContextListener {

	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule() {

			protected void configureServlets() {
				serve("/add").with(Xyz.class);
				serve("/checkout").with(PrintSajal.class);
				bind(MobileInterface.class).to(Redmi.class).in(Singleton.class);
			}
		});
	}

	/*
	 * protected Injector getInjector() { return Guice.createInjector(new
	 * GuiceModule()); }
	 */
}


  class GuiceModule extends AbstractModule { protected void configure() {
  bind(MobileInterface.class).to(Oneplus.class); } }
 

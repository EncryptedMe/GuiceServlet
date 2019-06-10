package guiceservlet;

import com.google.inject.Inject;

public class MobileService {
	private MobileInterface m;

	@Inject
	public MobileService(MobileInterface m) {
		super();
		this.m = m;
	}
	
	public void myPhone() {
		System.out.println(m.getDetails());
	}
	
}

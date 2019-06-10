package guiceservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;

@Singleton
public class PrintSajal extends HttpServlet{
	private static final long serialVersionUID = 4198981740461486987L;
	
	@Inject
	private MobileInterface mi;
	



	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	       
		    PrintWriter  out=resp.getWriter();   
			out.println("<h1 align = "+"Center"+">Inside PrintSajal.java</h1>");
		    out.println("<pre align ="+"Center"+">"+mi.getDetails()+"</pre");
		    
	        
	 }

}

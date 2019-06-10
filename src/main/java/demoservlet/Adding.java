package demoservlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adding extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5355335034604515942L;

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		System.out.println("Output : "+k);
		res.getWriter().println("Outputzx: "+k);
	}

}

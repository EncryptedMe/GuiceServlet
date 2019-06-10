package guiceservlet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;

/**
 * Servlet implementation class Xyz
 */
@Singleton
public class Xyz extends HttpServlet {
	private static final long serialVersionUID = -5485860664336341602L;
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("s1");
        String processor = req.getParameter("s2");
        System.out.println(name + "  "+processor);
       
		response.getWriter().append("Served at: ").append(req.getContextPath());
		
		
		req.getRequestDispatcher("/checkout").forward(req, response);
	}


	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);*/
	//}

}

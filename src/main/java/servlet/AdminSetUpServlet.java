package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.AvailabilityController;

public class AdminSetUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String can = request.getParameter("can");
		int cans = Integer.parseInt(can);
	       PrintWriter out = response.getWriter();
              out.println(cans);
              
        AvailabilityController user = new AvailabilityController();
	        	   String json=user.setCan(cans);
	        	   out.print(json);
	        	   out.flush();
    }
}
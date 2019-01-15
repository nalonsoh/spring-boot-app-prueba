package es.noelalonso.sbappprueba.web;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prueba")
public class PruebaServlet extends HttpServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PruebaServlet.service");
		
		String hostname = null;
		String ip = null;
		try {
			hostname = InetAddress.getLocalHost().getHostName();
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			hostname = "'Oh Oh ... unknown hostname'";
		}
		
		response.getWriter().println(String.format("Este es un Servelt con Spring Boot.  (hostname: %s  -  IP: %s)", 
				hostname, ip));
		
		response.getWriter().flush();
	}

	
}

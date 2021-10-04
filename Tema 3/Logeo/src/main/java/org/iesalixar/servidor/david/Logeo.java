package org.iesalixar.servidor.david;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logeo
 */
@WebServlet("/Logeo")
public class Logeo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Logeo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>Ejemplo de gestión de peticiones POST desde el Servlet</title><head>");
		out.println("<body>");
		out.println("<h1>Formulario</h1>");
		out.println(
				"<p>El formulario se mostrará la primera vez cuando se haya realizado una petición GET al servlet</p>");

		out.println("<form method=\"post\">");
		out.println("<label for=\"nombre\">Nombre:</label><input id=\"name\" type=\"text\" name=\"name\"><br>");
		out.println(
				"<label for=\"apellidos\">contraseña:</label><input id=\"password\" type=\"password\" name=\"password\"><br>");
		out.println("<button type=\"submit\" name=\"submit\">Iniciar Sesion</button>");
		out.println("</form>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		Enumeration paramEnumeration = request.getParameterNames();

		if (!paramEnumeration.hasMoreElements()) {

			// No hay parámetros en la petición
			out.println("Estoy en una petición post y no he recibido parámetros");

		} else {
			
			// Comienzo de la lista de parámetros
			Boolean second=false;


		
				String param1 = request.getParameter("name");
				
				String param2 = request.getParameter("password");
				if (param1.equalsIgnoreCase("admin")&& param2.equalsIgnoreCase("admin")) {
					out.println("<h1>Los datos son correctos, bienvenido administrador</h1>");
				}else  {
						out.println("<html>");
						out.println("<head><title>Ejemplo de gestión de peticiones POST desde el Servlet</title><head>");
						out.println("<body>");
						out.println("<h1>Formulario</h1>");
						out.println(
								"<h4 style=\"color:red\">Has introducido mal los Datos vuelve a intentarlo</h4>");

						out.println("<form method=\"post\">");
						out.println("<label for=\"nombre\">Nombre:</label><input id=\"name\" type=\"text\" name=\"name\"><br>");
						out.println(
								"<label for=\"apellidos\">contraseña:</label><input id=\"password\" type=\"password\" name=\"password\"><br>");
						out.println("<button type=\"submit\" name=\"submit\">Iniciar Sesion</button>");
						out.println("</form>");
						out.println("</body></html>");
					
				}
				

			

		}

	}
}

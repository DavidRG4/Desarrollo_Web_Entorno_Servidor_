package org.iesalixar.servidor.david;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogIn
 */
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = (String) request.getParameter("usuario");
		String password = (String) request.getParameter("password");
		HttpSession sesion = null;

		if (usuario.equals("admin") && password.equals("admin")) {

			sesion = request.getSession();
			UsuarioModel user = new UsuarioModel();
			user.setNombre(usuario);
			sesion.setAttribute("usuar", user);
			response.sendRedirect("Admin");

		} else if (usuario.equals("normal") && password.equals("normal")) {

			sesion = request.getSession();
			UsuarioModel user = new UsuarioModel();
			user.setNombre(usuario);
			sesion.setAttribute("usuar", user);
			response.sendRedirect("Usuario");

		} else {
			response.sendRedirect("LogIn");

		}
	}

}

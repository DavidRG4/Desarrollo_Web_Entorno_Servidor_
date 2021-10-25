package org.iesalixar.servidor.david;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet("/InicioServlet")
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(ConfirmacionServlet.class);

	private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";

	private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

	/**
	 * Default constructor.
	 */
	public InicioServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Inicio.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("boton") != null && request.getParameter("boton").equals("Registrar")) {
			if (request.getParameter("usuario") != null && request.getParameter("password") != null
					&& request.getParameter("passwordConfirm") != null && request.getParameter("correo") != null
					&& PASSWORD_PATTERN.matcher(request.getParameter("password")).matches()
					&& request.getParameter("passwordConfirm").equals(request.getParameter("password"))) {
				
				HttpSession session = request.getSession();
				logger.info("Sesion iniciada");
				String usuario = request.getParameter("usuario");
				session.setAttribute("tiempo", session.getCreationTime());
				session.setAttribute("usuario", usuario);
				
				response.sendRedirect("ReservarServlet");
				return;
			}else {
				HttpSession session = request.getSession();
				session.invalidate();
				logger.error("Intento de entrar en Seleccionar sin tener sesión o un fallo en los datos");

				response.sendRedirect(request.getContextPath());
				return;
			}
		}
	}

}

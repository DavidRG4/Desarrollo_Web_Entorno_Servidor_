package org.iesalixar.servidor.david;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SeleccionarServlet
 */
@WebServlet("/SeleccionarServlet")
public class SeleccionarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SeleccionarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Seleccionar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String  e=request.getParameter("entrada");
		if (!session.isNew()&&e!=null) {
			UsuarioModel nombrebean = (UsuarioModel) session.getAttribute("nombre");
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String correo = request.getParameter("correo");
			String[]modulos = request.getParameterValues("modulos");
			String curso = request.getParameter("curso");
			
			if (nombre != null && apellido != null && correo != null && modulos != null) {
				Cookie cookie=new Cookie("curso", curso);
				response.addCookie(cookie);
				session.setAttribute("nombre", nombre);
				session.setAttribute("apellido", apellido);
				session.setAttribute("correo", correo);
				session.setAttribute("modulos", modulos);
				request.setAttribute("usuariobean", nombrebean);
				response.sendRedirect("ConfirmacionServlet");
				return;
			}
		}
		session.invalidate();
		response.sendRedirect(request.getContextPath());
	}

}

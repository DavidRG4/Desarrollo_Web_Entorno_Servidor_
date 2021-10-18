package org.iesalixar.servidor.david;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Usuario
 */
@WebServlet("/Usuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();

		if (sesion.isNew()) {
			UsuarioModel usuario = (UsuarioModel) sesion.getAttribute("usuario");
			if (usuario != null && usuario.getNombre().equals("normal")) {
				request.getRequestDispatcher("Usurio.jsp").forward(request, response);
			}
		}
		sesion.invalidate();
		response.sendRedirect(request.getContextPath());
	}

}

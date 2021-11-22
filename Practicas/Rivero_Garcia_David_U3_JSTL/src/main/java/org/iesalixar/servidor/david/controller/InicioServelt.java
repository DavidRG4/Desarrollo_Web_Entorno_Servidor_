package org.iesalixar.servidor.david.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.david.dao.UsuarioDaoImpl;
import org.iesalixar.servidor.david.model.Usuario;
import org.iesalixar.servidor.david.utils.PasswordHashGenerator;

/**
 * Servlet implementation class InicioServelt
 */
public class InicioServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InicioServelt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		if (usuario != null && password != null) {

			UsuarioDaoImpl dao = new UsuarioDaoImpl();

			Usuario user = dao.getUsuario(usuario);

			if (user != null) {
				if (PasswordHashGenerator.checkPassword(password, user.getPassword())) {

					HttpSession sesion = request.getSession();

					sesion.setAttribute("usuario", user.getUsuario());
					sesion.setAttribute("email", user.getEmail());
					sesion.setAttribute("role", user.getRole());
					sesion.setAttribute("firstName", user.getFirstName());
					sesion.setAttribute("lastName", user.getLastName());

					if ("admin".equals(user.getRole())) {
						response.sendRedirect("Admin/");
					} else {
						response.sendRedirect("Oficinas");
					}

				} else {

					request.setAttribute("error", "login inválido");
					doGet(request, response);
					return;
				}
			} else {

				request.setAttribute("error", "Usuario no existente");
				doGet(request, response);
				return;
			}
		}
	}
}

package org.iesalixar.servidor.david;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class ReservarServlet
 */
@WebServlet("/ReservarServlet")
public class ReservarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(ConfirmacionServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReservarServlet() {
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
		request.getRequestDispatcher("Reservar.jsp").forward(request, response);
		return;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		if (!session.isNew() && session.getAttribute("tiempo") != null && session.getAttribute("usuario") != null) {
			if (request.getParameter("fechainicio") != null && request.getParameter("fechafinal") != null
					&& request.getParameterValues("servicios") != null && request.getParameter("personas") != null) {
				String finicio = (String) request.getParameter("fechainicio");
				String ffinal = (String) request.getParameter("fechafinal");
				String personas = (String) request.getParameter("personas");
				String[] servicios = (String[]) request.getParameterValues("servicios");
				session.setAttribute("finicio", finicio);
				session.setAttribute("ffinal", ffinal);
				session.setAttribute("personas", personas);
				session.setAttribute("servicios", servicios);

				response.sendRedirect("ConfirmacionServlet");
				return;
			}else {
				session.invalidate();
				logger.error("Los valores son invalidos");
				response.sendRedirect(request.getContextPath());
			}
		}
		session.invalidate();
		logger.error("Trataste de entrar sin tener sesion");
		response.sendRedirect(request.getContextPath());
	}

}

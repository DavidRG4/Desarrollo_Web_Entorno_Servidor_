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
 * Servlet implementation class ConfirmacionServlet
 */
@WebServlet("/ConfirmacionServlet")
public class ConfirmacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(ConfirmacionServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConfirmacionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (!session.isNew() && session.getAttribute("tiempo") != null && session.getAttribute("usuario") != null) {
			if (session.getAttribute("ffinicio") != null && session.getAttribute("ffinal") != null
					&& session.getAttribute("personas") != null && session.getAttribute("servicios") != null) {
				ReservaModdel reserv = new ReservaModdel();
				reserv.setFinicio((String) session.getAttribute("finicio"));
				reserv.setFfinal((String) session.getAttribute("ffinal"));
				reserv.setPersonas((String) session.getAttribute("personas"));
				reserv.setServicios((String[]) session.getAttribute("servicios"));
				request.setAttribute("reserv", reserv);
				request.getRequestDispatcher("Confirmacion.jsp").forward(request, response);
				logger.info("Confirmacion realizada correctamente");
				return;
			} else {
				session.invalidate();
				logger.error("fallo en los datos");
				response.sendRedirect(request.getContextPath());
				return;

			}
		
		}else {
			session.invalidate();
			logger.error("Trataste de entrar en la pagina sin una sesion");
			response.sendRedirect(request.getContextPath());
			return;
		}

	}

}

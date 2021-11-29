package ejemploU4.iesalixar.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejemploU4.iesalixar.dao.DAOOficeImpl;

/**
 * Servlet implementation class showAllOfices
 */
public class showAllOfices extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public showAllOfices() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DAOOficeImpl daoOficeImpl = new DAOOficeImpl();
		request.setAttribute("oficinas", daoOficeImpl.getAllOficina());
		
		request.getRequestDispatcher("WEB-INF/view/oficinas.jsp").forward(request, response);
		
	}

}

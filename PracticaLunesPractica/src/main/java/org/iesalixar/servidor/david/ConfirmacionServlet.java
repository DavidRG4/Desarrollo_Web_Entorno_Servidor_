package org.iesalixar.servidor.david;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfirmacionServlet
 */
@WebServlet("/ConfirmacionServlet")
public class ConfirmacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		Cookie[]cookies=request.getCookies();
		for (Cookie i: cookies) {
			if (i.getName().equals("curso")) {
				request.setAttribute("curso",i.getValue());
			}
		}
		
		request.getRequestDispatcher("Confirmacion.jsp").forward(request, response);
	}

}

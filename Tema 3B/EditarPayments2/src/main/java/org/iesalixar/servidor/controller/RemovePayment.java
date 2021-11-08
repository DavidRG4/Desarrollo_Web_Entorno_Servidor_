package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.DAOPaymentImpl;

/**
 * Servlet implementation class RemovePayment
 */
@WebServlet("/RemovePayment")
public class RemovePayment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemovePayment() {
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
		int customerNumber = Integer.parseInt( request.getParameter("cn"));
		String checkNumber = request.getParameter("checkn");

		DAOPaymentImpl daoPaymentImpl = new DAOPaymentImpl();

		if (customerNumber != 0 && checkNumber != null) {
			daoPaymentImpl.removePayment(customerNumber, checkNumber);

		}
		response.sendRedirect(request.getContextPath());
	}

}

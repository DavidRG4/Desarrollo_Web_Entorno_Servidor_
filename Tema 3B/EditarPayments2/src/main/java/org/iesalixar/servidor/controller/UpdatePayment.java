package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.DAOPaymentImpl;
import org.iesalixar.servidor.model.Payment;

/**
 * Servlet implementation class UpdatePayment
 */
@WebServlet("/UpdatePayment")
public class UpdatePayment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdatePayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int customerNumber = Integer.parseInt(request.getParameter("cn"));
		String checkNumber = request.getParameter("checkn");

		DAOPaymentImpl daoPaymentImpl = new DAOPaymentImpl();
		Payment payment = daoPaymentImpl.getPayment(customerNumber, checkNumber);
		request.setAttribute("pago", payment);

		request.getRequestDispatcher("WEB-INF/view/update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int customerNumber = Integer.parseInt(request.getParameter("cn"));
		String checkNumber = request.getParameter("checkn");
		String date =request.getParameter("date");
		Double amount = Double.parseDouble(request.getParameter("amount"));
		if (customerNumber!=0&&checkNumber!=null&&date!=null&&amount!=0.0) {
			Payment payment = new Payment(customerNumber,checkNumber,date,amount);
			DAOPaymentImpl daoPaymentImpl = new DAOPaymentImpl();
			daoPaymentImpl.updatePayment(payment);
		}
		response.sendRedirect(request.getContextPath());
	}

}

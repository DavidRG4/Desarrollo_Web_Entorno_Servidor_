package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.DAOPaymentImpl;
import org.iesalixar.servidor.model.Payment;

/**
 * Servlet implementation class ListadoPagos
 */
@WebServlet("/ListadoPagos")
public class ListadoPagos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoPagos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAOPaymentImpl daoImpl = new DAOPaymentImpl();
		
		ArrayList<Payment> listaPagos = (ArrayList)daoImpl.getAllPayments();
		
		request.setAttribute("pagos", listaPagos);
		
		request.getRequestDispatcher("WEB-INF/view/index.jsp").forward(request, response);;
		
	}

}

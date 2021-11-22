package org.iesalixar.servidor.david.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.david.dao.OficinasDaoImpl;
import org.iesalixar.servidor.david.model.Oficinas;

/**
 * Servlet implementation class OficinaServelet
 */
public class OficinaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OficinaServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OficinasDaoImpl ofdao=new OficinasDaoImpl();
		List<Oficinas> litaOficinas = ofdao.getAllOfices();
		request.setAttribute("Oficinas",litaOficinas );
		request.getRequestDispatcher("WEB-INF/view/oficinas.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

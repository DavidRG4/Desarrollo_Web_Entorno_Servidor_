package org.iesalixar.servidor.david.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.david.dao.ProductosDaoImpl;
import org.iesalixar.servidor.david.model.Productos;

/**
 * Servlet implementation class EditarProductServlet
 */
public class EditarProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditarProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productCode = request.getParameter("cn");
		if (productCode != null) {

			ProductosDaoImpl productosDaoImpl = new ProductosDaoImpl();

			// Obtengo el Payment cuyos datos pasaré a la vista
			Productos productos = productosDaoImpl.getProduct(productCode);

			request.setAttribute("productos", productos);

			request.getRequestDispatcher("/WEB-INF/view/admin/updateProduct.jsp").forward(request, response);
		} else {
			response.sendRedirect("/Admin/");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

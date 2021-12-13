package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.iesalixar.servidor.dao.employeesDaoImpl;
import org.iesalixar.servidor.model.employees;

/**
 * Servlet implementation class AddEmpleadoServlet
 */
public class AddEmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(AddEmpleadoServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddEmpleadoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		employeesDaoImpl daoImpl = new employeesDaoImpl();
		ArrayList<employees> employees = daoImpl.getAllEmployees();

		// Lo añado a la petición que se le pasa a la vista
		request.setAttribute("employees", employees);

		request.getRequestDispatcher("/WEB-INF/view/addEmpleados.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String employeeNumber = request.getParameter("employeeNumber");
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String extension = request.getParameter("extension");
		String email = request.getParameter("email");
		String jobTitle = request.getParameter("jobTitle");
		String officeCode = request.getParameter("officeCode");
		String reportsTo = request.getParameter("reportsTo");
		if (employeeNumber != null && lastName != null && firstName != null && extension != null && jobTitle != null
				&& officeCode != null && reportsTo != null && email != null) {

			employees employee = new employees(employeeNumber, lastName, firstName, extension, email, officeCode,
					reportsTo, jobTitle);

			employeesDaoImpl dao = new employeesDaoImpl();

			dao.insertEmployees(employee);
			logger.info("Se ha añadido un nuevo empleado");

		}
		response.sendRedirect(request.getContextPath()+"/Admin/Empleados");
	}

}

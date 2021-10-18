package org.iesalixar.servidor.david;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formulario
 */
@WebServlet("/formulario")
public class formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String simple = request.getParameter("simple");
		String[] checkbox = request.getParameterValues("checkbox");
		String[] select = request.getParameterValues("select");

		request.setAttribute("simple", simple);
		request.setAttribute("checkbox",Arrays.toString(checkbox));
		request.setAttribute("select",Arrays.toString(select));

		request.getRequestDispatcher("datos.jsp").forward(request, response);
		
	}

}

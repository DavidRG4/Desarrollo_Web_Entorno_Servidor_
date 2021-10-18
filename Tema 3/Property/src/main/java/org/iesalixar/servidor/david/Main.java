package org.iesalixar.servidor.david;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		Properties prop = new Properties();
		InputStream is = null;
		ArrayList<String> lista = new ArrayList<String>();
		try {
			//is = new FileInputStream("/resources/bd.properties");
			//prop.load(is);
            prop.load(getClass().getClassLoader().getResourceAsStream("bd.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//String usuario = prop.getProperty("bd.properties");
		for (Enumeration e = prop.keys(); e.hasMoreElements();) {
			String key = (String) e.nextElement();
			
			lista.add(prop.getProperty(key));
		}

		request.setAttribute("propiedades", lista);
		request.getRequestDispatcher("datos.jsp").forward(request, response);
	}

}

package com.controlador.docencia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuOpcionesDocenteController
 */
@WebServlet("/MenuOpcionesDocenteController")
public class MenuOpcionesDocenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuOpcionesDocenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		procesar(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
		
	}
	//--------------------------------------------------------------------------------------------------------------------
	private void procesar (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		System.out.println("Estoy entrando docente para vista");
		getServletContext().getRequestDispatcher("/jsp/menuOpcionesD.jsp").forward(request, response);
	}
	

}

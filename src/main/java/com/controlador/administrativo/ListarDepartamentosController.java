package com.controlador.administrativo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modelo.dao.DAOFactory;
import com.Modelo.entidades.Departamento;

@WebServlet("/ListarDepartamentosController")
public class ListarDepartamentosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListarDepartamentosController() {
        //super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		procesar(request, response);
	}
	private void procesar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Departamento> listDepartamento = DAOFactory.getFactory().getDepartamentoDAO().get();
		for(Departamento d : listDepartamento) {
			System.out.println(d.toString());
		}
		request.setAttribute("listDepartamento", listDepartamento);
		getServletContext().getRequestDispatcher("/jsp/listarDepartamentos.jsp").forward(request, response);
	}

}

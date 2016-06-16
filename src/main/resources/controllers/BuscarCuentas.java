package controllers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuscarCuentas")
public class BuscarCuentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuscarCuentas() {
        super();
    }

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null; 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		double saldo = request.getParameter("saldo");
		Repositorio repo = Repositorio.getInstance();
		Persona persona = repo.getBanco().buscarPersona(dni);
		persona.cuentasQueSuperan(saldo).size();
	}

}

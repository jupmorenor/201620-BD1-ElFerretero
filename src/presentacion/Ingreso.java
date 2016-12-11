package presentacion;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Empleado;
import abstraccion.Conexion;

/**
 * Servlet implementation class Actualizador
 */
@WebServlet("/Ingreso")
public class Ingreso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ingreso() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp");
		Conexion con = Conexion.obtenerConexion();
		ResultSet resp;
		Empleado emp;
		String usuario = (String)request.getParameter("userName");
		String clave = (String)request.getParameter("userPassword");
		if (usuario.equals(clave)) {
			emp = new Empleado(usuario);
			String query = emp.consultarEmpleado();
			System.err.println(query);
			resp = con.ejecutarConsulta(query);
			try {
				if (resp.next()) {
					response.sendRedirect("menu.jsp");
				} else {
					request.setAttribute("result", "Usuario no encontrado");
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
			} catch (Exception e){
				request.setAttribute("result", "Error de la base de datos");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		} else {
			request.setAttribute("result", "Usuario y contraseña incorrectos");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}
}

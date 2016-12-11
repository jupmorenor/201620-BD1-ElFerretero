package presentacion;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		Conexion con = Conexion.obtenerConexion();
		String usuario = request.getParameter("");
		ResultSet resp = con.ejecutarConsulta("SELECT * FROM s_dept;");
		try {
			System.out.println(resp.next());
		} catch (SQLException e) {
			System.out.println("No funcionó");
		}
		request.setAttribute("datos", resp);
		request.getRequestDispatcher("/NewFile.jsp").forward(request, response);
		//response.sendRedirect("NewFile.jsp");
	}

}

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
@WebServlet("/Actualizador")
public class Actualizador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Actualizador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion con = Conexion.obtenerConexion();
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

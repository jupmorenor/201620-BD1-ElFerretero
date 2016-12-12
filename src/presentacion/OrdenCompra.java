package presentacion;

import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Contacto;
import clases.Persona;
import clases.Producto;
import abstraccion.Conexion;

/**
 * Servlet implementation class OrdenCompra
 */
@WebServlet("/OrdenCompra")
public class OrdenCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdenCompra() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Conexion con = Conexion.obtenerConexion();
		ResultSet prov, prod;
		Persona per;
		Producto pro;
		Contacto cont;
		switch (request.getParameter("orden")) {
		case "Buscar":
			String nit = request.getParameter("cedulaP");
			per = new Persona(nit);
			pro = new Producto();	
			prov = con.ejecutarConsulta(per.consultarProveedor());
			try {
				if(prov.next()) {
					cont = new Contacto(prov.getInt("id_prov"));
					per.setContacto(cont);
				}
			} catch (Exception e) {
				System.err.println("Consulta basica de proveedor vacia");
			}
			pro.setPersona(per);
			prov = con.ejecutarConsulta(per.consultarPersona());
			prod = con.ejecutarConsulta(pro.consultarProductosProveedor());
			try {
				if (prov.next()) {
					request.getSession().setAttribute("fecha", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
					request.getSession().setAttribute("nombre", prov.getString("nombre"));
					request.getSession().setAttribute("nit", prov.getString("nit"));
					request.getSession().setAttribute("direccion", prov.getString("direccion"));
					request.getSession().setAttribute("telefono", prov.getString("telefono"));
				}
			} catch (Exception e) {
				System.err.println("Consulta completa de proveedor vacia");
			}
			request.getSession().setAttribute("productos", prod);
			request.getRequestDispatcher("/OrdenCompra.jsp").forward(request, response);
			break;
		case "Enviar":
			
			break;
		default:
			
			break;
		}
	}

}

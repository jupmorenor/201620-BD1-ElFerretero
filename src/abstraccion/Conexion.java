package abstraccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	private static Conexion conexionUnica;
	private Connection conexionInterna;
	
	private Conexion(String url, String user, String passwd) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		} catch (Exception e) {
			System.err.println("No se encuentra la libreria de conexion con Oracle");
			e.printStackTrace();
		}
		try {
			conexionInterna = DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e2) {
			System.err.println("No se pudo conectar con la base de datos");
			e2.printStackTrace();
		}
	}
	
	public static Conexion obtenerConexion() {
		if (conexionUnica == null) {
			conexionUnica = new Conexion("jdbc:oracle:thin:@localhost:1521:XE", "system", "Yamile_01");
		}
		return conexionUnica;
	}
	
	public void ejecutarSQL(String query) {
		try {
			Statement stm = conexionInterna.createStatement();
			stm.executeUpdate(query);
		} catch (SQLException qE) {
			System.err.println("No se pudo ejecutar la accion");
			qE.printStackTrace();
		}
	}
	
	public ResultSet ejecutarConsulta(String query) {
		ResultSet resultado = null;
		try {
			Statement stm = conexionInterna.createStatement();
			resultado = stm.executeQuery(query);
		} catch (SQLException qE) {
			System.err.println("No se pudo realizar la consulta");
			qE.printStackTrace();
		}
		return resultado;
	}
	
	private void cerrarConexion() {
		try {
			conexionInterna.close();
			
		} catch (SQLException qE) {
			qE.printStackTrace();
		}
	}
	
	public static void eliminarConexion() {
		conexionUnica.cerrarConexion();
		conexionUnica = null;
	}
	
}

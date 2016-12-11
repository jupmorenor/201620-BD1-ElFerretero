package clases;

public class Empleado {

	private String id;

	private Transaccion transaccion;

	private Cargo cargo;

	public Empleado(String id) {
		this.id = id;
	}

	public void setTransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String consultarEmpleado() {
		return "select E.ID_EMPLEADO id_emp, E.NOMBRE_E nombre from EMPLEADO E "
				+ "where E.NIT=" + id;
	}

}

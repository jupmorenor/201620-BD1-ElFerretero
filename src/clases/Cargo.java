package clases;

public class Cargo {

	private String cargo;

	private int empleado;

	public Cargo(String c, int emp) {
		cargo = c;
		empleado = emp;
	}

	public String consultarCargoPorID() {
		return "SELECT c.desc_cargo FROM cargo c, cargoEmpleado ce WHERE c.id_cargo=ce.id_cargo "
				+ "AND ce.id_empleado=" + empleado;
	}
	
	public String consultarEmpleadoPorCargo() {
		return "SELECT ce.id_empleado FROM cargo c, cargoEmpleado ce WHERE c.id_cargo=ce.id_cargo "
				+ "AND c.desc_cargo LIKE '%" + cargo + "'";
	}

}

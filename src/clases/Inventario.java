package clases;

public class Inventario {

	private int transac;

	private int detalle;

	private Detalle detalles;

	private TipoMovimiento tipoMovimiento;

	public String registrarMovimiento() {
		return "insert into INVENTARIO (";
	}

}

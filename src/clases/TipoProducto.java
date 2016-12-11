package clases;

public class TipoProducto {

	private int id;

	public TipoProducto(int prod_tipo) {
		id = prod_tipo;
	}

	public String consultarTipoProd() {
		return "SELECT tp.desc_tipo_producto FROM TipoProducto tp WHERE pt.id_tipo_producto=" + id;
	}

}

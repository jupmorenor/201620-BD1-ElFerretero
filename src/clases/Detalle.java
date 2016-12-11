package clases;

public class Detalle {

	private int id;

	private int trans;

	private Producto producto;
	
	public Detalle(int id, int trans) {
		this.id = id;
		this.trans = trans;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String consultarProducto() {
		return null;
	}

	public String consultarDetalles() {
		return "select ";
	}

}

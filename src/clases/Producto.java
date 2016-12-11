package clases;

public class Producto {

	private String nombre;
	
	private int id;

	private Detalle detalle;

	private TipoProducto tipoProducto;

	private Marca marca;

	private Persona persona;

	public Producto(int id) {
		this.id = id;
	}

	public String consultarProductos() {
		return "select P.ID_PRODUCTO id_producto, P.REFERENCIA producto from CATALOGOPRODUCTOS P";
	}
	
	public String consultarProductosProveedor() {
		return consultarProductos() + ", DISTRIBUCION D, (" + persona.consultarProveedor() + ") PER "
				+ "where P.ID_PRODUCTO=D.ID_PRODUCTO and D.ID_PERSONA=PER.id_prov";
	}
	
	/*
	public String consultarProductoFull() {
		return "select P.ID_PRODUCTO id_producto, P.REFERENCIA producto, (" + marca.consultarMarca()
				+ " marca, etc";
	}*/
	

}

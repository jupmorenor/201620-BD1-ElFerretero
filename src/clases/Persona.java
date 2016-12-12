package clases;

public class Persona {

	private String nit;

	private String dir;

	private String tel;

	private Contacto contacto;

	private TipoPersona tipoPersona;

	private Producto producto;

	public Persona(String doc) {
		nit = doc;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String consultarPersona() {
		return "select P.NIT nit, P.NOMBRE_P nombre, P.DIRECCION direccion, (" + contacto.consultarContacto() 
				+ ") telefono from PERSONA P where P.NIT='" + nit + "'";
	}
	
	public String consultarProveedor() {
		return "select P.ID_PERSONA id_prov from PERSONA P where P.NIT='" + nit + "'";
	}

}

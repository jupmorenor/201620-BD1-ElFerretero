package clases;

public class Contacto {

	private int persona;
	
	public Contacto(int per) {
		persona = per;
	}

	public String consultarContacto() {
		return "SELECT cont.desc_contacto FROM Contacto cont "
				+ "WHERE cont.id_persona=" + persona;
	}

}

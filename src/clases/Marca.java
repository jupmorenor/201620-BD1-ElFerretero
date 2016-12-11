package clases;

public class Marca {

	private int marca;

	public Marca(int mar) {
		marca = mar;
	}

	public String consultarMarca() {
		return "SELECT m.nom_marca FROM Marca m WHERE m.id_marca=" + marca;
	}

}

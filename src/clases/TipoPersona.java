package clases;

public class TipoPersona {

	private int tipo;

	public TipoPersona(int p) {
		tipo = p;
	}

	public String consultarTipoPer() {
		return "select TP.DESC_TIPO_PERSONA from TIPOPERSONA TP, TIPOCLIENTE TC "
				+ "where TP.ID_TIPO_PERSONA=TC.ID_TIPO_PERSONA and TC.ID_PERSONA=" + tipo;
	}

}

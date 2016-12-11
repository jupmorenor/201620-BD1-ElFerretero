package clases;

public class TipoMovimiento {

	private String tipo;

	public TipoMovimiento(String t) {
		tipo = t;
	}

	public String consultarTipoMov() {
		return "select TM.ID_TIPO_MOV from TIPOMOVIMIENTO TM where TM.DESC_TIPO_MOV like '%" + tipo + "'";
	}

}

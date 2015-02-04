public class Partido {

	private String nombre, numeroMiembros, presidente;
	int añoFundacion;

	public void setNombre (String nombreIntroducido) {
		nombre = nombreIntroducido;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNumeroMiembros (String numeroMiembrosIntroducido) {
		numeroMiembros = numeroMiembrosIntroducido;
	}
		
	public String getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setAñoFundacion (int añoFundacionIntroducido) {
		añoFundacion = añoFundacionIntroducido;
	}
		
	public int getAñoFundacion() {
		return añoFundacion;
	}

	public void setPresidente (String presidenteIntroducido) {
		presidente = presidenteIntroducido;
	}
		
	public String getPresidente() {
		return presidente;
	}
}

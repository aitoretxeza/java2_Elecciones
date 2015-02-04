public class EspacioPublico {

	protected String direccion;
	protected int aforoMaximo;

	public void setDireccion (String direccionIntroducido) {
		direccion = direccionIntroducido;
	}
		
	public String getDireccion() {
		return direccion;
	}

	public void setAforoMaximo (int aforoMaximoIntroducido) {
		aforoMaximo = aforoMaximoIntroducido;
	}
		
	public int getAforoMaximo() {
		return aforoMaximo;
	}
}

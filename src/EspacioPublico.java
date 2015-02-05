import java.util.Hashtable;

public class EspacioPublico {

	protected String direccion;
	protected int aforoMaximo;

	public void setDireccion(String direccionIntroducido) {
		direccion = direccionIntroducido;
	}
		
	public String getDireccion() {
		return direccion;
	}

	public void setAforoMaximo(int aforoMaximoIntroducido) {
		aforoMaximo = aforoMaximoIntroducido;
	}
		
	public int getAforoMaximo() {
		return aforoMaximo;
	}
	
	public String espacioPublicoMain() {
		System.out.println("\n\n------ Información del espacio público -------\n");

		EspacioPublico espacioPublico = new EspacioPublico();

		espacioPublico.setDireccion("Otelarrea, 35");
		espacioPublico.setAforoMaximo(150);

		Hashtable espacioPublicoHastable  = new Hashtable();

		espacioPublicoHastable.put("direccion", espacioPublico.getDireccion());
		espacioPublicoHastable.put("aforoMaximo", espacioPublico.getAforoMaximo());

				String direccionHastable  = (String) espacioPublicoHastable.get("direccion");
				int aforoMaximoHastable  = (int) espacioPublicoHastable.get("aforoMaximo");

		System.out.println("Direccion: " + direccionHastable);
		System.out.println("Aforo Máximo: " + aforoMaximoHastable);
		
		return "3";
	}
}

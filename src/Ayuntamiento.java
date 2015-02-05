import java.util.Scanner;

public class Ayuntamiento {

	private String nombreAlcalde, pueblo, direccion;

	public void setNombreAlcalde(String nombreAlcaldeIntroducido) {
		this.nombreAlcalde = nombreAlcaldeIntroducido;
	}
	
	public String getNombreAlcalde() {
		return this.nombreAlcalde;
	}

	public void setPueblo(String puebloIntroducido) {
		this.pueblo = puebloIntroducido;
	}
		
	public String getPueblo() {
		return this.pueblo;
	}

	public void setDireccion(String direccionIntroducido) {
		this.direccion = direccionIntroducido;
	}
		
	public String getDireccion() {
		return this.direccion;
	}
	
	public void ayuntamientoMain() {
		
		Ayuntamiento ayuntamiento = new Ayuntamiento();		

		System.out.println("\n\n-------- Información del ayuntamiento --------\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el nombre del alcalde: ");
		ayuntamiento.setNombreAlcalde(sc.next());
		System.out.print("Ingrese el nombre del pueblo: ");
		ayuntamiento.setPueblo(sc.next());
		System.out.print("Ingrese la dirección: ");
		ayuntamiento.setDireccion(sc.next());

		System.out.println("\nAlcalde: " + ayuntamiento.getNombreAlcalde());
		System.out.println("Pueblo: " + ayuntamiento.getPueblo());
		System.out.println("Direccion: " + ayuntamiento.getDireccion() + "\n");
	}
}
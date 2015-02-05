import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Habitante {

	private String dni, nombre, apellido;	
	String pathArchivo = "/home/zubiri/ProyectosJava/java2_Elecciones/src";
	private int edad;

	public void setDni(String dniIntroducido) {
		dni = dniIntroducido;
	}
		
	public String getDni() {
		return dni;
	}

	public void setNombre(String nombreIntroducido) {
		nombre = nombreIntroducido;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setApellido(String apellidoIntroducido) {
		apellido = apellidoIntroducido;
	}
		
	public String getApellido() {
		return apellido;
	}

	public void setEdad(int edadIntroducido) {
		edad = edadIntroducido;
	 }
		
	public int getEdad() {
		return edad;
	}
	
	public void habitanteMain() throws IOException {

		ArrayList<Habitante> habitantes = new ArrayList<Habitante>();			
		String archivo = "censo.txt";
		File fichero = new File(pathArchivo, archivo);
		Scanner s = new Scanner(fichero);		

		System.out.println("\n\n-- Lista de los habitantes mayores de edad ---\n");	
		while (s.hasNextLine()) {
			String linea = s.nextLine();
			String [] palabra = linea.split(", ");
			Habitante habitante = new Habitante();

			habitante.setDni(palabra[0]);
			habitante.setNombre(palabra[1]);
			habitante.setApellido(palabra[2]);
			habitante.setEdad(Integer.parseInt(palabra[3]));

			habitantes.add(habitante);

			if (habitante.getEdad() >= 18) {	
				System.out.println("DNI: " + habitante.getDni());
				System.out.println("Nombre: " + habitante.getNombre());
				System.out.println("Apellido: " + habitante.getApellido());
				System.out.println("Edad: " + habitante.getEdad() + "\n");
			}
			habitantes.clear();
		}
	}
}

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Partido {

	private String nombre, numeroMiembros, presidente;	
	String pathArchivo = "/home/zubiri/ProyectosJava/java2_Elecciones/src";
	int añoFundacion;

	public void setNombre(String nombreIntroducido) {
		nombre = nombreIntroducido;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNumeroMiembros(String numeroMiembrosIntroducido) {
		numeroMiembros = numeroMiembrosIntroducido;
	}
		
	public String getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setAñoFundacion(int añoFundacionIntroducido) {
		añoFundacion = añoFundacionIntroducido;
	}
		
	public int getAñoFundacion() {
		return añoFundacion;
	}

	public void setPresidente(String presidenteIntroducido) {
		presidente = presidenteIntroducido;
	}
		
	public String getPresidente() {
		return presidente;
	}
	
	public void partidoMain() throws IOException {
		
		System.out.println("\n\n----------- Lista de los partidos ------------\n");

		ArrayList<Partido> partidos = new ArrayList<Partido>();			
		String archivo = "listadosPartidos.txt";
		File fichero = new File(pathArchivo, archivo);
		Scanner s = new Scanner(fichero);
		
		while (s.hasNextLine()) {
			String linea = s.nextLine();
			String[] palabra = linea.split(", ");
			Partido partido = new Partido();

			partido.setNombre(palabra[0]);
			partido.setNumeroMiembros(palabra[1]);
			partido.setAñoFundacion(Integer.parseInt(palabra[2]));
			partido.setPresidente(palabra[3]);

			partidos.add(partido);

			System.out.println("Nombre del partido: " + partido.getNombre());
			System.out.println("Número de Afiliados: " + partido.getNumeroMiembros());
			System.out.println("Año de Fundación: " + partido.getAñoFundacion());
			System.out.println("Presidente: " + partido.getPresidente() + "\n");

			partidos.clear();
		}
	}
}

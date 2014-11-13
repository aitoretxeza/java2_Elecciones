import java.io.*;
import java.util.*;

public class Main {
	
	@SuppressWarnings("unchecked")

	public static void main(String[] args) throws IOException {

		String dniHabitante, nombreHabitante, apellidoHabitante, direccionInmueble, nombreDueñoInmueble, apellidoDueñoInmueble, tipoEspacioPublico, direccionEspacioPublico, nombreAlcaldeAyuntamiento, puebloAyuntamiento, direccionAyuntamiento, nombrePartido;
		int edadHabitante;
		double areaInmueble;

/*---------------------------------------------------------------HABITANTES------------------------------------------------------------------*/

		System.out.println("\n\nInformacion de los habitantes\n");
		File archivo = new File("censo.txt");
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		ArrayList <String> habitantes = new ArrayList <String> ();
		String linea = br.readLine();
		while(linea != null) {
			habitantes.add(linea);
			linea = br.readLine();
		}
		int i=0;
		while(i<habitantes.size()) {
			String habitante = habitantes.get(i);
			ArrayList <Habitante> habitantesArray = new ArrayList(Arrays.asList(habitante.split(",")));
			System.out.println("Habitante " + i + ":");
			System.out.println("DNI = " + habitantesArray.get(0));
			System.out.println("Nombre = " + habitantesArray.get(1));
			System.out.println("Apellido = " + habitantesArray.get(2));
			System.out.println("Edad = " + habitantesArray.get(3) + "\n");
			i++;
		}
		habitantes.clear();

/*---------------------------------------------------------------INMUEBLES-------------------------------------------------------------------*/

		Inmueble inmueble1 = new Inmueble();

		inmueble1.setDireccion("Kale Nagusia, 31");
		inmueble1.setNombreDueño("Edurne");
		inmueble1.setApellidoDueño("Mendizabal");
		inmueble1.setArea(20);

		direccionInmueble = inmueble1.getDireccion();
		nombreDueñoInmueble = inmueble1.getNombreDueño();
		apellidoDueñoInmueble = inmueble1.getApellidoDueño();
		areaInmueble = inmueble1.getArea();

		System.out.println("\nInformación del inmueble");
		System.out.println("\nDireccion: " + direccionInmueble);
		System.out.println("Nombre: " + nombreDueñoInmueble);
		System.out.println("Apellido: " + apellidoDueñoInmueble);
		System.out.println("Area: " + areaInmueble + " m2");

/*------------------------------------------------------------ESPACIOS PUBLICOS--------------------------------------------------------------*/

		EspacioPublico espacioPublico1 = new EspacioPublico();

		espacioPublico1.setDireccion("Otelarrea, 35");
		espacioPublico1.setTipo("Escuela");

		direccionEspacioPublico = espacioPublico1.getDireccion();
		tipoEspacioPublico = espacioPublico1.getTipo();

		System.out.println("\n\nInformación del espacio público");
		System.out.println("\nDireccion: " + direccionEspacioPublico);
		System.out.println("Tipo: " + tipoEspacioPublico);

/*--------------------------------------------------------------AYUNTAMIENTOS----------------------------------------------------------------*/

		Ayuntamiento ayuntamiento1 = new Ayuntamiento();

		ayuntamiento1.setNombreAlcalde("Beñat");
		ayuntamiento1.setPueblo("Orexa");
		ayuntamiento1.setDireccion("Plaza, 5");

		nombreAlcaldeAyuntamiento = ayuntamiento1.getNombreAlcalde();
		puebloAyuntamiento = ayuntamiento1.getPueblo();
		direccionAyuntamiento = ayuntamiento1.getDireccion();

		System.out.println("\n\nInformación del ayuntamiento");
		System.out.println("\nAlcalde: " + nombreAlcaldeAyuntamiento);
		System.out.println("Pueblo: " + puebloAyuntamiento);
		System.out.println("Direccion: " + direccionAyuntamiento);

/*----------------------------------------------------------------PARTIDOS-------------------------------------------------------------------*/

		System.out.println("\n\nLista de los partidos\n");
		File archivo2 = new File("listadosPartidos.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(archivo2));
		ArrayList <String> partidos = new ArrayList <String> ();
		String linea2 = br2.readLine();
		while(linea2 != null) {
			partidos.add(linea2);
			linea2 = br2.readLine();
		}
		int i2=0;
		while(i2<partidos.size()) {
			String partido = partidos.get(i2);
			ArrayList <Partido> partidosArray = new ArrayList(Arrays.asList(partido.split(",")));
			System.out.println("Partido " + i2 + " (" + partidosArray.get(0) + "): ");
			System.out.println("Numero Miembros = " + partidosArray.get(1));
			System.out.println("Año Fundacion = " + partidosArray.get(2));
			System.out.println("Presidente = " + partidosArray.get(3) + "\n");
			i2++;
		}
		partidos.clear();
	}
}

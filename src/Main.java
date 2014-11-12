import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		String dniHabitante, nombreHabitante, apellidoHabitante, direccionInmueble, nombreDueñoInmueble, apellidoDueñoInmueble, tipoEspacioPublico, direccionEspacioPublico, nombreAlcaldeAyuntamiento, puebloAyuntamiento, direccionAyuntamiento, nombrePartido;
		int edadHabitante;
		double areaInmueble;

		Habitante habitante1 = new Habitante();

		habitante1.setDni("98765432A");
		habitante1.setNombre("Mikel");
		habitante1.setApellido("Olano");
		habitante1.setEdad(30);

		dniHabitante = habitante1.getDni();
		nombreHabitante = habitante1.getNombre();
		apellidoHabitante = habitante1.getApellido();
		edadHabitante = habitante1.getEdad();

		System.out.println("\n\nInformación del habitante");
		System.out.println("\nDNI: " + dniHabitante);
		System.out.println("Nombre: " + nombreHabitante);
		System.out.println("Apellido: " + apellidoHabitante);
		System.out.println("Edad: " + edadHabitante + " años");

		Inmueble inmueble1 = new Inmueble();

		inmueble1.setDireccion("Kale Nagusia, 31");
		inmueble1.setNombreDueño("Edurne");
		inmueble1.setApellidoDueño("Mendizabal");
		inmueble1.setArea(20);

		direccionInmueble = inmueble1.getDireccion();
		nombreDueñoInmueble = inmueble1.getNombreDueño();
		apellidoDueñoInmueble = inmueble1.getApellidoDueño();
		areaInmueble = inmueble1.getArea();

		System.out.println("\n\nInformación del inmueble");
		System.out.println("\nDireccion: " + direccionInmueble);
		System.out.println("Nombre: " + nombreDueñoInmueble);
		System.out.println("Apellido: " + apellidoDueñoInmueble);
		System.out.println("Area: " + areaInmueble + " m2");

		EspacioPublico espacioPublico1 = new EspacioPublico();

		espacioPublico1.setDireccion("Otelarrea, 35");
		espacioPublico1.setTipo("Escuela");

		direccionEspacioPublico = espacioPublico1.getDireccion();
		tipoEspacioPublico = espacioPublico1.getTipo();

		System.out.println("\n\nInformación del espacio público");
		System.out.println("\nDireccion: " + direccionEspacioPublico);
		System.out.println("Tipo: " + tipoEspacioPublico);

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

		System.out.println("\n\nLista de los partidos\n");
		File archivo = new File("listadosPartidos.txt");
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		ArrayList <String> partidos = new ArrayList <String> ();
		String linea = br.readLine();
		while(linea != null) {
			partidos.add(linea);
			linea = br.readLine();
		}
		int i=0;
		while(i<partidos.size()) {
			String partido = partidos.get(i);
			ArrayList <Partido> partidosArray = new ArrayList(Arrays.asList(partido.split(",")));
			System.out.println("Partido " + i + " (" + partidosArray.get(0) + "): ");
			System.out.println("Numero Miembros = " + partidosArray.get(1));
			System.out.println("Año Fundacion = " + partidosArray.get(2));
			System.out.println("Presidente = " + partidosArray.get(3) + "\n");
			i++;
		}
		partidos.clear();
	}
}

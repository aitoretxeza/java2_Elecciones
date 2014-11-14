import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	
	@SuppressWarnings("unchecked")

	public static void main(String[] args) throws IOException {

		String dniHabitante, nombreHabitante, apellidoHabitante, direccionInmueble, nombreDueñoInmueble, apellidoDueñoInmueble, tipoEspacioPublico, direccionEspacioPublico, nombreAlcaldeAyuntamiento, puebloAyuntamiento, direccionAyuntamiento, nombrePartido;

		int edadHabitante;

		double areaInmueble;

/*---------------------------------------------------------------HABITANTES------------------------------------------------------------------*/

		System.out.println("\n\n----- Lista de los habitantes mayores de edad -----\n");

		ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
	
		String path = "/home/zubiri/ProyectosJava/java2_Elecciones/src";		
		String archivo = "censo.txt";

		File fichero = new File(path, archivo);
		Scanner sc = null;

		try {
			sc = new Scanner(fichero);
			while (sc.hasNextLine()){
				String linea = sc.nextLine();
				String [] palabra = linea.split(", ");
				Habitante habitante = new Habitante();

				habitante.setDni(palabra[0]);
				habitante.setNombre(palabra[1]);
				habitante.setApellido(palabra[2]);
				habitante.setEdad(Integer.parseInt(palabra[3]));

				habitantes.add(habitante);

				if (habitante.getEdad() >= 18){		
					System.out.println("DNI: " + habitante.getDni());
					System.out.println("Nombre: " + habitante.getNombre());
					System.out.println("Apellido: " + habitante.getApellido());
					System.out.println("Edad: " + habitante.getEdad() + "\n");
				}

				habitantes.clear();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if (sc != null)
					sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		

/*---------------------------------------------------------------INMUEBLES-------------------------------------------------------------------*/

		System.out.println("\n---------- Información del inmueble ----------");

		Inmueble inmueble1 = new Inmueble();

		inmueble1.setDireccion("Kale Nagusia, 31");
		inmueble1.setNombreDueño("Edurne");
		inmueble1.setApellidoDueño("Mendizabal");
		inmueble1.setArea(20);

		direccionInmueble = inmueble1.getDireccion();
		nombreDueñoInmueble = inmueble1.getNombreDueño();
		apellidoDueñoInmueble = inmueble1.getApellidoDueño();
		areaInmueble = inmueble1.getArea();

		System.out.println("\nDireccion: " + direccionInmueble);
		System.out.println("Nombre: " + nombreDueñoInmueble);
		System.out.println("Apellido: " + apellidoDueñoInmueble);
		System.out.println("Area: " + areaInmueble + " m2");

/*------------------------------------------------------------ESPACIOS PUBLICOS--------------------------------------------------------------*/

		System.out.println("\n\n---------- Información del espacio público ----------");

		EspacioPublico espacioPublico1 = new EspacioPublico();

		espacioPublico1.setDireccion("Otelarrea, 35");
		espacioPublico1.setTipo("Escuela");

		direccionEspacioPublico = espacioPublico1.getDireccion();
		tipoEspacioPublico = espacioPublico1.getTipo();

		System.out.println("\nDireccion: " + direccionEspacioPublico);
		System.out.println("Tipo: " + tipoEspacioPublico);

/*--------------------------------------------------------------AYUNTAMIENTOS----------------------------------------------------------------*/

		System.out.println("\n\n---------- Información del ayuntamiento ----------");

		Ayuntamiento ayuntamiento1 = new Ayuntamiento();

		ayuntamiento1.setNombreAlcalde("Beñat");
		ayuntamiento1.setPueblo("Orexa");
		ayuntamiento1.setDireccion("Plaza, 5");

		nombreAlcaldeAyuntamiento = ayuntamiento1.getNombreAlcalde();
		puebloAyuntamiento = ayuntamiento1.getPueblo();
		direccionAyuntamiento = ayuntamiento1.getDireccion();

		System.out.println("\nAlcalde: " + nombreAlcaldeAyuntamiento);
		System.out.println("Pueblo: " + puebloAyuntamiento);
		System.out.println("Direccion: " + direccionAyuntamiento);

/*----------------------------------------------------------------PARTIDOS-------------------------------------------------------------------*/

		System.out.println("\n\n---------- Lista de los partidos ----------\n");

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

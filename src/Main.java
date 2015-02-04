import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String pathArchivo = "/home/zubiri/ProyectosJava/java2_Elecciones/src";

		Scanner sc = new Scanner(System.in);
		System.out.print("\n-------------------- MENU --------------------\n");
		System.out.print("\n1 - Habitantes");
		System.out.print("\n2 - Inmuebles");
		System.out.print("\n3 - Espacios Públicos");
		System.out.print("\n4 - Ayuntamientos");
		System.out.print("\n5 - Partidos políticos");
		System.out.print("\n6 - Salir");
		System.out.print("\n\nElija un número de las opciones de arriba: ");
		
		String respuesta = sc.nextLine();

		System.out.print("\n----------------------------------------------");
		
		switch (respuesta) {
/*------------------------------------------------------ HABITANTES ---------------------------------------------------------*/
			case "1": {

				System.out.println("\n\n-- Lista de los habitantes mayores de edad ---\n");

				ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
			
				String archivo = "censo.txt";

				File fichero = new File(pathArchivo, archivo);
				Scanner s = null;

				try {
					s = new Scanner(fichero);
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
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (sc != null)
							sc.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				break;
			}		
/*------------------------------------------------------ INMUEBLES ---------------------------------------------------------*/
			case "2": {
			
				System.out.println("\n\n---------- Información del inmueble ----------\n");

				Inmueble inmueble = new Inmueble();

				inmueble.setDireccion("Kale Nagusia, 31");
				inmueble.setNombreDueño("Edurne");
				inmueble.setApellidoDueño("Mendizabal");
				inmueble.setArea(20);

				System.out.println("Direccion: " + inmueble.getDireccion());
				System.out.println("Nombre: " + inmueble.getNombreDueño());
				System.out.println("Apellido: " + inmueble.getApellidoDueño());
				System.out.println("Area: " + inmueble.getArea() + " m2\n");

				break;
			}
/*------------------------------------------------------ ESPACIOS PUBLICOS ---------------------------------------------------------*/
			case "3": {

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

				break;
			}
/*------------------------------------------------------ AYUNTAMIENTOS ---------------------------------------------------------*/
			case "4": {

				System.out.println("\n\n-------- Información del ayuntamiento --------\n");

				Ayuntamiento ayuntamiento = new Ayuntamiento();

				ayuntamiento.setNombreAlcalde("Beñat");
				ayuntamiento.setPueblo("Orexa");
				ayuntamiento.setDireccion("Plaza, 5");

				System.out.println("Alcalde: " + ayuntamiento.getNombreAlcalde());
				System.out.println("Pueblo: " + ayuntamiento.getPueblo());
				System.out.println("Direccion: " + ayuntamiento.getDireccion() + "\n");

				break;
			}
/*------------------------------------------------------ PARTIDOS ---------------------------------------------------------*/
			case "5":  {

				System.out.println("\n\n----------- Lista de los partidos ------------\n");

				ArrayList<Partido> partidos = new ArrayList<Partido>();
			
				String archivo = "listadosPartidos.txt";

				File fichero = new File(pathArchivo, archivo);
				Scanner s = null;

				try {
					s = new Scanner(fichero);
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
						System.out.println("Númer de Afiliados: " + partido.getNumeroMiembros());
						System.out.println("Año de Fundación: " + partido.getAñoFundacion());
						System.out.println("Presidente: " + partido.getPresidente() + "\n");

						partidos.clear();
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (sc != null)
							sc.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				break;
			}
/*---------------------------------------------------------------- SALIR -------------------------------------------------------------------*/
			case "6": {

				System.out.println("\n\nSaliendo del programa\n");
				break;
			}
/*---------------------------------------------------------------- DEFECTO -------------------------------------------------------------------*/
			default: {

				System.out.println("\n\nCaracter invalido\n");
				System.out.println("Saliendo del programa\n");
				break;
			}
		}
	}
}

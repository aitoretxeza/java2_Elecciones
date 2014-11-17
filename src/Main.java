import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	
	@SuppressWarnings("unchecked")

	public static void main(String[] args) throws IOException {

		String dniHabitante, nombreHabitante, apellidoHabitante, direccionInmueble, nombreDueñoInmueble, apellidoDueñoInmueble, tipoEspacioPublico, direccionEspacioPublico, nombreAlcaldeAyuntamiento, puebloAyuntamiento, direccionAyuntamiento, nombrePartido;

		String pathArchivo = "/home/administrador/Zubiri 2014-2015/Java Proyectos/java2_Elecciones/src";

		int edadHabitante;

		double areaInmueble;

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

/*---------------------------------------------------------------HABITANTES------------------------------------------------------------------*/

			case "1":  {

				System.out.println("\n\n-- Lista de los habitantes mayores de edad ---\n");

				ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
			
				String archivo = "censo.txt";

				File fichero = new File(pathArchivo, archivo);
				Scanner s = null;

				try {
					s = new Scanner(fichero);
					while (s.hasNextLine()){
						String linea = s.nextLine();
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

				break;

			}		

/*---------------------------------------------------------------INMUEBLES-------------------------------------------------------------------*/

			case "2":  {
			
				System.out.println("\n\n---------- Información del inmueble ----------\n");

				Inmueble inmueble1 = new Inmueble();

				inmueble1.setDireccion("Kale Nagusia, 31");
				inmueble1.setNombreDueño("Edurne");
				inmueble1.setApellidoDueño("Mendizabal");
				inmueble1.setArea(20);

				direccionInmueble = inmueble1.getDireccion();
				nombreDueñoInmueble = inmueble1.getNombreDueño();
				apellidoDueñoInmueble = inmueble1.getApellidoDueño();
				areaInmueble = inmueble1.getArea();

				System.out.println("Direccion: " + direccionInmueble);
				System.out.println("Nombre: " + nombreDueñoInmueble);
				System.out.println("Apellido: " + apellidoDueñoInmueble);
				System.out.println("Area: " + areaInmueble + " m2\n");

				break;

			}

/*------------------------------------------------------------ESPACIOS PUBLICOS--------------------------------------------------------------*/

			case "3":  {

				System.out.println("\n\n------ Información del espacio público -------\n");

				EspacioPublico espacioPublico1 = new EspacioPublico();

				espacioPublico1.setDireccion("Otelarrea, 35");
				espacioPublico1.setTipo("Escuela");

				direccionEspacioPublico = espacioPublico1.getDireccion();
				tipoEspacioPublico = espacioPublico1.getTipo();

				System.out.println("Direccion: " + direccionEspacioPublico);
				System.out.println("Tipo: " + tipoEspacioPublico + "\n");

				break;

			}

/*--------------------------------------------------------------AYUNTAMIENTOS----------------------------------------------------------------*/

			case "4":  {

				System.out.println("\n\n-------- Información del ayuntamiento --------\n");

				Ayuntamiento ayuntamiento1 = new Ayuntamiento();

				ayuntamiento1.setNombreAlcalde("Beñat");
				ayuntamiento1.setPueblo("Orexa");
				ayuntamiento1.setDireccion("Plaza, 5");

				nombreAlcaldeAyuntamiento = ayuntamiento1.getNombreAlcalde();
				puebloAyuntamiento = ayuntamiento1.getPueblo();
				direccionAyuntamiento = ayuntamiento1.getDireccion();

				System.out.println("Alcalde: " + nombreAlcaldeAyuntamiento);
				System.out.println("Pueblo: " + puebloAyuntamiento);
				System.out.println("Direccion: " + direccionAyuntamiento + "\n");

				break;
			}

/*----------------------------------------------------------------PARTIDOS-------------------------------------------------------------------*/

			case "5":  {

				System.out.println("\n\n----------- Lista de los partidos ------------\n");

				ArrayList<Partido> partidos = new ArrayList<Partido>();
			
				String archivo = "listadosPartidos.txt";

				File fichero = new File(pathArchivo, archivo);
				Scanner s = null;

				try {
					s = new Scanner(fichero);
					while (s.hasNextLine()){
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
				} finally{
					try {
						if (sc != null)
							sc.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}

				break;
			}
			case "6":  {

				System.out.println("\n\nSaliendo del programa\n");
				break;

			}
			default:  {

				System.out.println("\n\nCaracter invalido\n");
				System.out.println("Saliendo del programa\n");
				break;
			}
		}
	}
}

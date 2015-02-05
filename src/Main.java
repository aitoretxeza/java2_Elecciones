import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("\n -------------------- MENU --------------------");
		System.out.print("\n|                                              |");
		System.out.print("\n|   1 - Habitantes                             |");
		System.out.print("\n|   2 - Inmuebles                              |");
		System.out.print("\n|   3 - Espacios Públicos                      |");
		System.out.print("\n|   4 - Ayuntamientos                          |");
		System.out.print("\n|   5 - Partidos políticos                     |");
		System.out.print("\n|   6 - Salir                                  |");
		System.out.print("\n|                                              |");
		System.out.print("\n ----------------------------------------------");
		System.out.print("\nElija un número de las opciones de arriba: ");		
		String respuesta = sc.nextLine();

		
		switch (respuesta) {
/*------------------------------------------------------ HABITANTES ---------------------------------------------------------*/
			case "1": {
				
				Habitante habitante = new Habitante();
				
				habitante.habitanteMain();
				
				break;
			}		
/*------------------------------------------------------ INMUEBLES ---------------------------------------------------------*/
			case "2": {				

				Inmueble inmueble = new Inmueble();

				inmueble.inmuebleMain();
				
				break;
			}
/*------------------------------------------------------ ESPACIOS PUBLICOS ---------------------------------------------------------*/
			case "3": {

				EspacioPublico espacioPublico = new EspacioPublico();
				
				espacioPublico.espacioPublicoMain();

				break;
			}
/*------------------------------------------------------ AYUNTAMIENTOS ---------------------------------------------------------*/
			case "4": {
				
				Ayuntamiento ayuntamiento = new Ayuntamiento();
				
				ayuntamiento.ayuntamientoMain();

				break;
			}
/*------------------------------------------------------ PARTIDOS ---------------------------------------------------------*/
			case "5":  {

				Partido partido = new Partido();
				
				partido.partidoMain();
				
				break;
			}
/*------------------------------------------------------ SALIR ---------------------------------------------------------*/
			case "6": {

				System.out.println("\n\nSaliendo del programa\n");
				break;
			}
/*------------------------------------------------------ DEFECTO ---------------------------------------------------------*/
			default: {

				System.out.println("\n\nCaracter invalido\n");
				System.out.println("Saliendo del programa\n");
				break;
			}
		}
	}
}

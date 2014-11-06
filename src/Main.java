public class Main {

	public static void main(String[] args) {

		String dniHabitante, nombreHabitante, apellidoHabitante, direccionInmueble, nombreDueñoInmueble, apellidoDueñoInmueble, tipoEspacioPublico, direccionEspacioPublico, nombreAlcaldeAyuntamiento, puebloAyuntamiento, direccionAyuntamiento;
		double edadHabitante, areaInmueble;

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
		System.out.println("\n\nDNI: " + dniHabitante);
		System.out.println("\nNombre: " + nombreHabitante);
		System.out.println("\nApellido: " + apellidoHabitante);
		System.out.println("\nEdad: " + edadHabitante + "años");

		Inmueble inmueble1 = new Inmueble();

		inmueble1.setDireccion("Kale Nagusia, 31");
		inmueble1.setNombreDueño("Edurne");
		inmueble1.setApellidoDueño("Mendizabal");
		inmueble1.setArea("20");

		direccionInmueble = inmueble1.getDireccion();
		nombreDueñoInmueble = inmueble1.getNombreDueño();
		apellidoDueñoInmueble = inmueble1.getApellidoDueño();
		areaInmueble = inmueble1.getArea();

		System.out.println("\n\nInformación del inmueble");
		System.out.println("\n\nDireccion: " + direccionInmueble);
		System.out.println("\nNombre: " + nombreDueñoInmueble);
		System.out.println("\nApellido: " + apellidoDueñoInmueble);
		System.out.println("\nArea: " + areaInmueble + "m2");

		EspacioPublico espacioPublico1 = new EspacioPublico();

		espacioPublico1.setDireccion("Otelarrea, 35");
		espacioPublico1.setTipo("Escuela");

		direccionEspacioPublico = espacioPublico1.getDireccion();
		tipoEspacioPublico = espacioPublico1.getTipo();

		System.out.println("\n\nInformación del espacio público");
		System.out.println("\n\nDireccion: " + direccionEspacioPublico);
		System.out.println("\nTipo: " + tipoEspacioPublico);

		Ayuntamiento ayuntamiento1 = new Ayuntamiento();

		ayuntamiento1.setNombreAlcalde("Beñat");
		ayuntamiento1.setPueblo("Orexa");
		ayuntamiento1.setDireccion("Plaza, 5");

		nombreAlcaldeAyuntamiento = ayuntamiento1.getNombreAlcalde();
		puebloAyuntamiento = ayuntamiento1.getPueblo();
		direccionAyuntamiento = ayuntamiento1.getDireccion();

		System.out.println("\n\nInformación del ayuntamiento");
		System.out.println("\n\nAlcalde: " + nombreAlcaldeAyuntamiento);
		System.out.println("\nPueblo: " + puebloAyuntamiento);
		System.out.println("\nDireccion: " + direccionAyuntamiento);
	}
}

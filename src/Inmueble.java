public class Inmueble {

	private String direccion, nombreDueño, apellidoDueño;
	private double area;

	public void setDireccion(String direccionIntroducido) {
		this.direccion = direccionIntroducido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setNombreDueño(String nombreDueñoIntroducido) {
		this.nombreDueño = nombreDueñoIntroducido;
	}

	public String getNombreDueño() {
		return this.nombreDueño;
	}

	public void setApellidoDueño(String apellidoDueñoIntroducido) {
		this.apellidoDueño = apellidoDueñoIntroducido;
	}

	public String getApellidoDueño() {
		return this.apellidoDueño;
	}

	public void setArea(double areaIntroducido) {
		this.area = areaIntroducido;
	}

	public double getArea() {
		return this.area;
	}
	
	public void inmuebleMain() {

		Inmueble inmueble = new Inmueble();
		
		inmueble.setDireccion("Kale Nagusia, 31");
		inmueble.setNombreDueño("Edurne");
		inmueble.setApellidoDueño("Mendizabal");
		inmueble.setArea(20);

		System.out.println("\n\n---------- Información del inmueble ----------\n");
		System.out.println("Direccion: " + inmueble.getDireccion());
		System.out.println("Nombre: " + inmueble.getNombreDueño());
		System.out.println("Apellido: " + inmueble.getApellidoDueño());
		System.out.println("Area: " + inmueble.getArea() + " m2\n");
	}
}
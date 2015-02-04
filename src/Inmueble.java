public class Inmueble {

	private String direccion, nombreDueño, apellidoDueño;
	private double area;

	public void setDireccion (String direccionIntroducido) {
		direccion = direccionIntroducido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setNombreDueño (String nombreDueñoIntroducido) {
		nombreDueño = nombreDueñoIntroducido;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setApellidoDueño (String apellidoDueñoIntroducido) {
		apellidoDueño = apellidoDueñoIntroducido;
	}

	public String getApellidoDueño() {
		return apellidoDueño;
	}

	public void setArea (double areaIntroducido) {
		area = areaIntroducido;
	}

	public double getArea() {
		return area;
	}
}

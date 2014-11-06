public class Habitante {

	public static void main(String[] args) {

		private String dni, nombre, apellido;
		private double edad;

		public void setDni (String dniIntroducido){
			dni = dniIntroducido;
	 	}
		
		public String getDni(){
			return dni;
	 	}

		public void setNombre (String nombreIntroducido){
			nombre = nombreIntroducido;
	 	}
		
		public String getNombre(){
			return nombre;
	 	}

		public void setApellido (String apellidoIntroducido){
			apellido = apellidoIntroducido;
	 	}
		
		public String getApellido(){
			return apellido;
	 	}

		public void setEdad (double edadIntroducido){
			edad = edadIntroducido;
	 	}
		
		public double getEdad(){
			return edad;
	 	}
	}
}

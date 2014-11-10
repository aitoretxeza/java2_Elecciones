public class Habitante {

		private String dni, nombre, apellido;
		private int edad;

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

		public void setEdad (int edadIntroducido){
			edad = edadIntroducido;
	 	}
		
		public int getEdad(){
			return edad;
	 	}
}

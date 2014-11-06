public class Ayuntamiento {

	public static void main(String[] args) {

		private String nombreAlcalde, direccion;

		public void setNombreAlcalde (String nombreAlcaldeIntroducido){
			nombreAlcalde = nombreAlcaldeIntroducido;
	 	}
		
		public String getNombreAlcalde(){
			return nombreAlcalde;
	 	}

		public void setDireccion (String direccionIntroducido){
			direccion = direccionIntroducido;
	 	}
		
		public String getDireccion(){
			return direccion;
	 	}
	}
}

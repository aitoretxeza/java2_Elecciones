public class Ayuntamiento {

		private String nombreAlcalde, pueblo, direccion;

		public void setNombreAlcalde (String nombreAlcaldeIntroducido){
			nombreAlcalde = nombreAlcaldeIntroducido;
	 	}
		
		public String getNombreAlcalde(){
			return nombreAlcalde;
	 	}

		public void setPueblo (String puebloIntroducido){
			pueblo = puebloIntroducido;
	 	}
		
		public String getPueblo(){
			return pueblo;
	 	}

		public void setDireccion (String direccionIntroducido){
			direccion = direccionIntroducido;
	 	}
		
		public String getDireccion(){
			return direccion;
	 	}
}

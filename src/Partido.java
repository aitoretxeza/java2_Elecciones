public class Partido {

	public static void main(String[] args) {

		private String nombre;
		private double miembros, añoFundacion;

		public void setNombre (String nombreIntroducido){
			nombre = nombreIntroducido;
	 	}
		
		public String getNombre(){
			return nombre;
	 	}

		public void setMiembros (double miembrosIntroducido){
			miembros = miembrosIntroducido;
	 	}
		
		public double getMiembros(){
			return miembros;
	 	}

		public void setAñoFundacion (double añoFundacionIntroducido){
			añoFundacion = añoFundacionIntroducido;
	 	}
		
		public double getAñoFundacion(){
			return añoFundacion;
	 	}
	}
}

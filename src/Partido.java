public class Partido {

		private String nombre, idealogia;
		private double numeroMiembros, añoFundacion;

		public void setNombre (String nombreIntroducido){
			nombre = nombreIntroducido;
	 	}
		
		public String getNombre(){
			return nombre;
	 	}

		public void setNumeroMiembros (double numeroMiembrosIntroducido){
			numeroMiembros = numeroMiembrosIntroducido;
	 	}
		
		public double getNumeroMiembros(){
			return numeroMiembros;
	 	}

		public void setAñoFundacion (double añoFundacionIntroducido){
			añoFundacion = añoFundacionIntroducido;
	 	}
		
		public double getAñoFundacion(){
			return añoFundacion;
	 	}

		public void setIdealogia (String idealogiaIntroducido){
			idealogia = idealogiaIntroducido;
	 	}
		
		public String getIdealogia(){
			return idealogia;
	 	}
}

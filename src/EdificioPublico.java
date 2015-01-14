public class EdificioPublico extends EspacioPublico {

	private String director;
	private int añoFundacion;

	public EdificioPublico () {

		super();
	}

		public void setDirector (String directorIntroducido){
			director = directorIntroducido;
	 	}
		
		public String getDirector(){
			return director;
	 	}

		public void setAñoFundacion (int añoFundacionIntroducido){
			añoFundacion = añoFundacionIntroducido;
	 	}
		
		public int getAñoFundacion(){
			return añoFundacion;
	 	}
}
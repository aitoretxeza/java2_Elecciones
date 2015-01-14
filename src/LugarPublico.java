public class LugarPublico extends EspacioPublico {

	private String tipo;

	public LugarPublico () {

		super();
	}

	public void setTipo (String tipoIntroducido){
		tipo = tipoIntroducido;
	}
	
	public String getTipo(){
		return tipo;
	}
}	
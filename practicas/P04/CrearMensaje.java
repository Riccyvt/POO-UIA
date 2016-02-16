public class CrearMensaje{
	public String getMensaje(String[] palabras){
		StringBuffer mensaje=new StringBuffer();
		for(int i=0; i<palabras.length; i++){	
			mensaje.append("  ");
			mensaje.append(palabras[i]);
		}
		return mensaje.toString();
	}
//...	
}
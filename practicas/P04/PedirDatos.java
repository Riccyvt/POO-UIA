import java.io.*;
public class PedirDatos {
	/* Funcion para leer caracteres*/
	public static char leerCaracter(String frase){
		char caracter;
		caracter=leerCadena(frase).charAt(0);
		return caracter;
	}
}
import java.io.*;
public class MatrizUnidimensional {
      public static void main(String[] args){
      	try{
            int nElementos;
			InputStreamReader isr = new InputStreamReader(System.in); 
			BufferedReader flujoE = new BufferedReader(isr);
			System.out.println("Número de elementos de la matriz:"); 
			nElementos = Integer.parseInt(flujoE.readLine());
			int[] m = new int[nElementos];
			int i = 0;
			System.out.println("Introducir los valores de la matriz.");
			for (i =0; i < nElementos; i++) { 
				System.out.println("m["+ i +"] = ");
				m[i] = Integer.parseInt(flujoE.readLine());
				}
            System.out.println();
            for (i =0; i < nElementos; i++) {
			System.out.println(m[i] + " "); 
			}
				System.out.println("\n\n Fin del proceso.");
			}
				catch(IOException ignorada){}
	}
}
 
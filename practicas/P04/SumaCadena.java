public class SumaCadena {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);  //declara entrada
      System.out.println("ingrese cadena");
      String cadena=leer.nextLine(), num="";  //guarda la cadena
      
      int largo=cadena.length(), sum=0;  //guarda largo de cadena
      
      for(int i=0; i<largo; i++){  //recorre la cadena
         if (Character.isDigit(cadena.charAt(i))){  //si el caracter es digito
            sum = sum + Integer.parseInt(cadena.charAt(i + "");  //suma caracter        
         }  
       }
      
      System.out.println(" Cadena es: " +  cadena);  //imprime cadena
      System.out.println(" suma es: " +  sum);  //imprime suma
      
    }
}
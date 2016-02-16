import java.util.Scanner;  
public class Obtenersubstring {  
    public static void main(String[] args) {  
         Scanner sc = new Scanner(System.in);  
        System.out.println("Ingresa una palabra");  
        String palabra = sc.nextLine();  
        System.out.println("Ingresa posicion");  
        int ini = sc.nextInt();  
        System.out.println("Ingresa longitud");  
        int tam = sc.nextInt();  
        String sal = palabra.substring(ini, tam+ini);  
        System.out.println(sal);  
        }  
}  
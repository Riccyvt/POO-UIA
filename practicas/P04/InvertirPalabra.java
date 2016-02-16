import java.util.Scanner;  
public class InvertirPalabra {  
     public static void main(String[] args) {  
         String cad="";  
     Scanner sc = new Scanner(System.in);  
     System.out.println("ingresa una palabra");  
    String pal=sc.nextLine();  
    int t=pal.length();  
    for(int i=t;i>0;i--){  
        cad=cad+pal.substring((i-1), i);  
    }  
    System.out.println(cad);  
     }  
}  
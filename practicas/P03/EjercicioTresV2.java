
import java.util.Scanner; 
public class EjercicioTresV2{
    public static void main(String[] args) {
        int sum=0, A,B,tem;   
         Scanner sc = new Scanner(System.in);  
         System.out.println("Ingresa el valor de A ");  
         A=sc.nextInt();  
         System.out.println("Ingresa el valor de B ");  
         B=sc.nextInt(); 
         if(A==0){  
          System.out.println("El numero "+A+" es nulo");  
           }   
          if(A>0){  
              System.out.println("El numero "+A+" es positivo");  
            } else { 
            System.out.println("El numero "+A+" es negativo");
                }
            if(A < B){
            tem=A;  
            A=B;  
            B=tem;  
            System.out.println("Ahora el valor de A es: "+A+" y el valor de B es: "+B);
            }  
            String cad="";  
            for(int i=A;i<=B;i=i+5){  
            cad=cad+" "+i;  
            sum=sum+i; 
            }  
            System.out.println(cad);  
            System.out.println("La suma de los multiplos es:"+ sum); 
         }
       }   
     
   



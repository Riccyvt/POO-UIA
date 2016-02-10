public class EjercicioTres {
    public static void main(String[] args) {
    int sum=0;  
       String cad="";  
       for(int i=0;i<=100;i=i+5){  
           cad=cad+" "+i;  
           sum=sum+i;  
       }  
       System.out.println(cad);  
       System.out.println("La suma de los multiplos es:"+ sum);  
     }  
}  
     
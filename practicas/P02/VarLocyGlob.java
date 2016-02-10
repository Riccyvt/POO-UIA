public class VarLocyGlob {  
     public static void main(String[] args) {           
  
         double radio, area;           
         System.out.println("HALLA EL AREA DE UN CIRCULO");  
         System.out.print("Ingresar el radio r = ");  
         Scanner scanner = new scanner(System.in);  
         radio = scanner.nextFloat();  
         area =  (3.14159*radio*radio);              
         System.out.println("Area = " + area);           
     }             
}  
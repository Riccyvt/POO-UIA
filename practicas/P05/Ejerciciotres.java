import java.util.*;
public class Ejerciciotres{
      public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      double nota;
      nota=0;
      System.out.println("Introduzca una nota entre 0 y 10: ");
      nota = sc.nextDouble();
      System.out.println("La calificación del alumno es ");
      if(nota > 0 || nota < 10)
      if (nota >= 9 && nota <=10)
           System.out.println("Sobresaliente");
      else if (nota >= 7 && nota <= 8.99)
           System.out.println("Notable");
      else if (nota >= 5 && nota <= 6.99)
           System.out.println("Bien");
      else if (nota >= 0 && nota <= 4.99)
           System.out.println("Suspenso");

    }       

 }   
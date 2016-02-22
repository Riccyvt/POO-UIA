import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Ejerciciodos {
    public static void main( String ... args ) {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<Integer>();
        for( int i = 1; i < 300 ; i++ ) {
            numeros.add( random.nextInt( 1000 ) );
        }
        for( int n : numeros ) {
            System.out.printf( "%01d%n", n );
        }
    }
}
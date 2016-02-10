public class EjercicioUno {
    public static void main(String[] args) {
int a = 10, b = 3, c = 1, d, e; 
boolean t;
float x, y;
x = a/b;
t = a < b && c<a;
d = a + b++;
e = ++a -b;   
y = (float)a/b;
}
}

// Error en c = a < b && c; 
// La primera expresion es booleana y la segunda entero.
// Solucion: 
// Declarar como booleano el primer termino 
// El segundo termino dejarlo abajo menor al primero


package Ejercicio2;
//1.  Leer por teclado un número entero N no negativo y mostrar el factorial de todos los números desde 0 hasta N.
//El factorial de un número entero se expresa mediante el símbolo ‘!’ y se define de la siguiente forma:
//Si n = 0 entonces 0! = 1
//Si n > 0 entonces
//n! = n * (n – 1) * (n – 2) * …. * 3 * 2 * 1
//Por ejemplo, n = 5 entonces
//5! = 5 * 4 * 3 * 2 * 1 = 120
//Solución:
import java.util.Scanner;
public class NumFactorial {

    public static void main(String[] args) {
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);

        //Leer un número entero >= 0
        do{
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        }while(N<0);

        for(int i = 0; i <= N ; i++){ //para cada número desde 1 hasta N

            //se calcula su factorial
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }

            //se muestra el factorial
            System.out.printf("%2d! = %.0f %n", i, factorial);

        }
    }

}
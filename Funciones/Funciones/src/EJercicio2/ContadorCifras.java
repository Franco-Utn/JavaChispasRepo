package EJercicio2;
import java.util.*;
import java.io.*;

public class ContadorCifras {

    // Función para calcular el número de cifras de un número entero
    public static int contarCifras(int n) {
        int cifras = 0;
        while (n != 0) {
            n = n / 10;
            cifras++;
        }
        return cifras;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        char car;
        do {
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            int cifras = contarCifras(n);
            System.out.println("El número tiene " + cifras + " cifras");
            System.out.print("Continuar? ");
            car = (char) System.in.read();
            sc.nextLine(); // Limpia el buffer de entrada
        } while (car != 'n' && car != 'N');
    }
}

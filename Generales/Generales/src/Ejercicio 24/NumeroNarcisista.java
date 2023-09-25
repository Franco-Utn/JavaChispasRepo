import java.util.Scanner;

public class NumeroNarcisista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, aux, cifra, numeroCifras = 0;
        double suma;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Error. Tiene que ser un número entero positivo");
            }
        } while (N <= 0);

        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux /= 10;
        }

        suma = 0;
        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            suma = suma + Math.pow(cifra, numeroCifras);
            aux /= 10;
        }

        if (suma == N) {
            System.out.println("Es narcisista");
        } else {
            System.out.println("No es narcisista");
        }
    }

}
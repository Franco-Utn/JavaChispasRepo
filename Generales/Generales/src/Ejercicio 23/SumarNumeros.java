import java.util.Scanner;

public class SumarNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma, cifra;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Número inválido");
            }
        } while (n <= 0);

        suma = 0;

        while (n != 0) {
            cifra = n % 10;
            suma = suma + cifra;
            n = n / 10;
        }

        System.out.println("La suma de sus cifras es: " + suma);
    }
}
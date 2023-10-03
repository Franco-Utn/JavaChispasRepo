package Ejercicio9;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número mayor que 1: ");
            numero = sc.nextInt();
        } while (numero <= 1);

        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
        printFibonacciSeries(numero);
    }

    public static void printFibonacciSeries(int n) {
        int fibo1 = 1;
        int fibo2 = 1;

        System.out.print(fibo1 + " ");
        for (int i = 2; i <= n; i++) {
            System.out.print(fibo2 + " ");
            int temp = fibo2;
            fibo2 = fibo1 + fibo2;
            fibo1 = temp;
        }
        System.out.println();
    }
}
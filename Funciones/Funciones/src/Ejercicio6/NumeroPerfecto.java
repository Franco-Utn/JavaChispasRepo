package Ejercicio6;


import java.util.Scanner;

public class NumeroPerfecto {

    // Función para determinar si un número es perfecto
    public static boolean esPerfecto(int n) {
        int suma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma = suma + i;
            }
        }

        return (suma == n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();

        if (esPerfecto(n)) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}

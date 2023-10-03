package Ejercicio1;

import java.util.*;

public class IntercambioVariables {

    // Función para intercambiar el valor de dos variables
    public static void intercambiar(int a, int b) {
        int aux = a;
        a = b;
        b = aux;
        System.out.println("Valores intercambiados: A = " + a + "   B = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        System.out.print("Introduzca valor de A: ");
        A = sc.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);

        // Llamada a la función para intercambiar valores
        intercambiar(A, B);
    }
}
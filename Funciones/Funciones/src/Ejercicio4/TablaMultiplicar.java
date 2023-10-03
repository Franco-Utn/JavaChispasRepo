package Ejercicio4;

import java.util.*;

public class TablaMultiplicar {

    // Función para mostrar la tabla de multiplicar de un número
    public static void mostrarTabla(int n) {
        System.out.println("Tabla del " + n);
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();

        // Llamada a la función para mostrar la tabla de multiplicar
        mostrarTabla(n);
    }
}
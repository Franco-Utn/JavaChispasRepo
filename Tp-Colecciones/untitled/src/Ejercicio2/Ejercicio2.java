package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<Double>();

        // Leer 20 números decimales ingresados por el usuario
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa un número decimal: ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }

        // Encontrar el mayor y el menor número en el arreglo
        double mayor = numeros.get(0);
        double menor = numeros.get(0);

        for (double numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Calcular y mostrar el rango
        double rango = mayor - menor;

        System.out.println("El mayor número en el arreglo es: " + mayor);
        System.out.println("El menor número en el arreglo es: " + menor);
        System.out.println("El rango de los elementos en el arreglo es: " + rango);
    }
}


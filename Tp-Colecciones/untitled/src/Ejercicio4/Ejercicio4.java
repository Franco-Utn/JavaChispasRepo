package Ejercicio4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros y llenarlo con 50 números aleatorios
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            numeros.add(rand.nextInt(100)); // Genera números aleatorios entre 0 y 99
        }

        // Imprimir la lista generada
        System.out.println("Lista de números generados: " + numeros);

        // Solicitar al usuario el valor que desea buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor que desea buscar: ");
        int valorBuscado = scanner.nextInt();

        // Realizar la búsqueda secuencial
        int posicion = -1;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == valorBuscado) {
                posicion = i;
                break; // Se encontró el valor, salir del bucle
            }
        }

        // Mostrar el resultado de la búsqueda
        if (posicion != -1) {
            System.out.println("El valor " + valorBuscado + " se encontró en la posición " + posicion);
        } else {
            System.out.println("El valor " + valorBuscado + " no se encontró en la lista.");
        }
    }
}

package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese 10 números enteros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Crear dos nuevas ArrayList para ordenar los números
        ArrayList<Integer> ascendente = new ArrayList<>(numeros); // Copiar la lista original
        ArrayList<Integer> descendente = new ArrayList<>(numeros); // Copiar la lista original

        // Ordenar de forma ascendente
        Collections.sort(ascendente);

        // Ordenar de forma descendente
        Collections.sort(descendente, Collections.reverseOrder());

        // Mostrar las listas ordenadas
        System.out.println("Lista ascendente: " + ascendente);
        System.out.println("Lista descendente: " + descendente);
    }
}

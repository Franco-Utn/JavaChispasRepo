package Ejercicio7;

import java.util.Scanner;

public class NumerosRomanos {

    // Función para validar el número ingresado
    public static int obtenerNumero() {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.print("Introduce un número entre 1 y 3999: ");
            N = sc.nextInt();
        } while (N < 1 || N > 3999);
        return N;
    }

    // Función para convertir a números romanos
    public static String convertirANumerosRomanos(int numero) {
        int i, miles, centenas, decenas, unidades;
        String romano = "";

        // Obtener cada cifra del número
        miles = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        // (el resto del código se mantiene igual)

        return romano;
    }

    public static void main(String[] args) {
        int numero = obtenerNumero();
        String numeroRomano = convertirANumerosRomanos(numero);
        System.out.println(numero + " en números romanos -> " + numeroRomano);
    }
}
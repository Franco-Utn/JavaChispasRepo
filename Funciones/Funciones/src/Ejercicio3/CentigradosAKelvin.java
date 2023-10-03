package Ejercicio3;

import java.util.*;
import java.io.*;

public class CentigradosAKelvin {

    // Función para convertir grados centígrados a Kelvin
    public static double convertirAKelvin(double temperatura) {
        return temperatura + 273;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        char car;

        do {
            System.out.print("Introduce temperatura en ºC: ");
            temperatura = sc.nextDouble();
            System.out.println("Grados Kelvin ..: " + convertirAKelvin(temperatura));
            System.out.print("Repetir proceso? (S/N): ");
            car = sc.next().charAt(0); // Leemos un carácter en lugar de usar System.in.read()
        } while(car == 'S' || car == 's');
    }
}
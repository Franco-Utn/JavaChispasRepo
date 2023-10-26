package Ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio1 {

        public static void main(String[] args) {
            // Crear un ArrayList para almacenar los números
            ArrayList<Integer> numeros = new ArrayList<>();

            // Crear un objeto Scanner para la entrada de usuario
            Scanner scanner = new Scanner(System.in);

            // Solicitar números hasta que se ingrese uno menor que 0
            System.out.println("Ingresa números (ingresa un número menor que 0 para detener):");
            int numero;
            while (true) {
                System.out.print("Número: ");
                numero = scanner.nextInt();
                if (numero < 0) {
                    break; // Salir del bucle si el número es menor que 0
                }
                numeros.add(numero); // Agregar el número al ArrayList
            }

            // Mostrar los números por pantalla
            System.out.println("Números ingresados:");
            for (int i : numeros) {
                System.out.println(i);
            }
        }
    }



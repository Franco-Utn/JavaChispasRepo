package Ejercicio5;

import java.util.*;

public class AcabadosEn2 {

    // Función para contar cuántos números acabados en 2 se han leído
    public static int contarNumerosAcabadosEn2() {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        while (n >= 0) {
            if (n % 10 == 2) {
                contador++;
            }
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
        }

        return contador;
    }

    public static void main(String[] args) {
        int contador = contarNumerosAcabadosEn2();
        System.out.println("Se han introducido " + contador + " números acabados en 2");
    }
}
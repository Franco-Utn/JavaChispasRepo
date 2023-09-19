package Ejercicio16;

import java.util.Scanner;


    public class DivisionMayorMenor {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese 2 números: ");
            int número1 = entrada.nextInt();
            int número2 = entrada.nextInt();
            int numMayor, numMenor;

            if (número1 <= 0 || número2 <= 0) {
                System.out.println("No se puede dividir por 0 o menor a 0.");
            } else if (número1 == número2) {
                System.out.println("Ingrese números distintos.");
            } else {
                if (número1 < número2) {
                    numMayor = número2;
                    numMenor = número1;
                } else {
                    numMayor = número1;  // Aquí debería ser "numMayor = número1;"
                    numMenor = número2;
                }

                System.out.println("La división del número mayor entre el número menor es: " + (double) numMayor / numMenor);
            }

            entrada.close(); // Cierra el scanner
        }
    }
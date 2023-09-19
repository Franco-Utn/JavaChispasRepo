package Ejercicio13;

import java.util.Scanner;

public class AñoBisiestoEnJava {
    public static void main(String[] args) {
// Programa java para comprobar si un año es bisiesto. El programa pide que se introduzca el valor de un año por teclado y calcula si es un año bisiesto o no lo es. Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese un año: ");
        int anho = lector.nextInt();

        if ((anho % 4 == 0 && anho % 100 != 0) || anho %  400 == 0){
            System.out.println("El año " +  anho + " Es bisiesto");
        } else {
            System.out.println("El año " + anho + "No es bisiesto");
        };
    }
}

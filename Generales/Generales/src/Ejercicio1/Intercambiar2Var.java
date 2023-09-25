package Ejercicio1;

import java.util.Scanner;

public class Intercambiar2Var {
    public static void main(String[] args) {
//        Programa para intercambiar el valor de dos variables. Los valores iniciales se leen por teclado.
//
//                Por ejemplo, suponiendo que las variables se llaman A y B, si A contiene 3 y B contiene 5, después del intercambio A contendrá 5 y B 3.

        Scanner input = new Scanner(System.in);
        int A,B,AUX;
        System.out.println("A =");
        A = input.nextInt();
        System.out.println("B =");
        B = input.nextInt();

        AUX = A;
        A = B;
        B = AUX;
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B);
    }
}

package Ejercicio20;

import java.util.Scanner;

public class ConvertirAlfabeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.print("Introduzca nota entre 0 y 10: ");
        nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}
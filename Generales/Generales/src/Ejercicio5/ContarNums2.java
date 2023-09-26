package Ejercicio5;

import java.util.Scanner;

public class ContarNums2 {
    public static void main(String[] args) {
//        Programa que lea una serie de números por teclado hasta que se lea un número negativo. El programa indicará cuántos números acabados en 2 se han leído.
        int num,contador;
        contador = 0;
        num = 0;
        Scanner sc = new Scanner(System.in);

        while (num >= 0){
            System.out.println("Ingrese un número positivo");
            num = sc.nextInt();
            if (num >= 0 && num %10==2){
                contador++;
            }

        }
        System.out.println("Hubieron " +contador+ " números acabados en 2");
    }
}

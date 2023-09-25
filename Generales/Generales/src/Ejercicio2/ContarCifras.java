package Ejercicio2;

import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {
//        Programa Java que pide un número entero por teclado y calcula y muestra el número de cifras que tiene.
//
//Por ejemplo si se introduce el número 54391 el programa mostrará el mensaje:
//
//El número tiene 5 cifras

        Scanner input = new Scanner(System.in);
        int n, cifras;
        System.out.println("INgrese un número: ");
        n = input.nextInt();
        cifras = 0;
                 while(n!=0){
                     n = n/10;
                     cifras++;
                 }
        System.out.println("El número tiene " + cifras+ " cifras");


    }
}

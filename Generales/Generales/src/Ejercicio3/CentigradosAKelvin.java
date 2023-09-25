package Ejercicio3;
import java.io.*;
import java.util.Scanner;

public class CentigradosAKelvin {
    public static void main(String[] args) {
//        Programa Java que lee una temperatura expresada en grados centígrados y la convierte a grados kelvin.
//
//El proceso de leer grados centígrados se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
        Scanner sc = new Scanner(System.in);

        char continuar;
        do{
            System.out.println("Ingrese la temperatura en Celcius: ");
            double grados = sc.nextDouble();
            System.out.println("Grados Kelvin ..: " + (grados+273));

            System.out.println("Desea Repetir S/N:");
            continuar = sc.next().toLowerCase().charAt(0); // Convierte a minúscula y lee el primer carácter

       }while(continuar == 's');


    }
}

package Ejercicio15;

import java.util.Scanner;

public class DigitoNumerico {
    public static void main(String[] args) {
//        Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un dígito numérico (cifra entre 0 y 9)");
        String numero = lector.next();

        if (numero.length()==1 && Character.isDigit(numero.charAt(0))) {
            System.out.println("Es un dígito numérico: " + numero);

        }else{
            System.out.println("No es un digito numérico: " + numero);
        }

    }
}

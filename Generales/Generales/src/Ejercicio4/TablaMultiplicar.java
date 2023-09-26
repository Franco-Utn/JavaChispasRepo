package Ejercicio4;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
//        Programa Java que lea un número entero N y muestre la tabla de multiplicar de ese número. Por ejemplo, si se lee el valor 7 se mostrará por pantalla:
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese la tabla que desea ver: ");
        n = sc.nextInt();
        System.out.println("Tabla de " + n);
        System.out.println("--------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+"x"+i+ "=" + n*i);
        }
    }
}

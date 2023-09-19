package Ejercicio14;
import java.util.Scanner;
public class NumCapicua {
    public static void main(String[] args) {
//        Programa java para comprobar si un número entero de tres cifras es capicúa.
//
//El programa pide que se introduzca un número entero y comprueba si el número es capicúa o no lo es. Si el número introducido no tiene tres cifras se muestra un mensaje indicándolo y el programa finaliza.
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número de 3 cifras.");
        String numero = lector.next();

        if(numero.length() == 3){
            if(numero.charAt(0) == numero.charAt(2)){
                System.out.println("Capicua");
            }else{
                System.out.println("No es capicua");
            }
        }else{
            System.out.println("No tiene 3 cifras!");
        }

    }
}

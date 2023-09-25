import java.util.Scanner;

public class MayorCifraDeNumero {

    public static void main(String[] args) {

        int num, posicionMayor, cifra, mayor, posicion;
        Scanner sc = new Scanner(System.in);

        // Creamos un bucle do-while para poder ingresar numeros enteros
        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        mayor = 0; // Iniciamos la variable que va a guardar los valores y la iniciamos en 0, para poder comparar los numeros

        // Iniciamos 2 variables que van a guardar las posiciones de los valores
        posicionMayor = 0;
        posicion = 0;

        while (num != 0) {
            posicion++;
            cifra = num % 10;
            if (cifra >= mayor) {
                mayor = cifra;
                posicionMayor = posicion;
            }
            num = num / 10; // Le sacamos al número su última cifra de la derecha.
        }

        System.out.print("Cifra mayor: " + mayor);

        System.out.println(" Posición: " + posicionMayor);
}
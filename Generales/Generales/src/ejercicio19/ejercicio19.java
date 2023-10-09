package ejercicio19;
import java.util.Scanner;

public class ejercicio19{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, mayor;

        System.out.print("Introduce número, para acabar introduce 0: ");
        n = sc.nextInt(); //Lectura del primer número

        mayor = n; //guardamos el primer número introducido como el mayor

        while (n != 0) {     //mientras el número introducido no sea 0
            if (n > mayor) { //si el número introducido es mayor que el mayor actual
                mayor = n;   //se toma como nuevo número mayor
            }
            System.out.print("Introduce número, para acabar introduce 0: ");
            n = sc.nextInt(); //leemos el siguiente número
        }

        //si mayor es cero significa que el primer número que se ha introducido ha sido el cero
        if (mayor == 0) {
            System.out.println("No se han introducido números");
        } else {
            System.out.println("El mayor número introducido ha sido: " + mayor);
        }
    }
}


import java.util.Scanner;

public class CifraMayor {

    public static void main(String[] args)  {

        int num, aux, posicionMayor, cifra, mayor, posicion, numCifras;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        //Guardamos el número en una variable auxiliar
        aux = num;
        numCifras = 0;
        while (aux != 0) {
            numCifras++;
            aux = aux / 10;
        }

        //Creamos variables para conocer el mayor y las pocisiones
        mayor = 0;
        posicionMayor = 0;
        posicion = 0;
        for(int i = numCifras-1; i >= 0; i--){
            posicion++;
            cifra = num / (int)Math.pow(10, i);
            if (cifra > mayor) {
                mayor = cifra;
                posicionMayor = posicion;
            }
            num = num % (int)Math.pow(10, i); //Le sacamos al número su primera cifra de la izquierda.
        }

        System.out.print("Cifra mayor: " + mayor);
        System.out.println(" Posición: " + posicionMayor);

    }
}
import java.util.Scanner;

public class MayorCifraDeNumero {

    public static void main(String[] args) {

        int num, posicionMayor, cifra, mayor, posicion;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        mayor = 0; //Esta variable contendrá el valor de la cifra mayor. 
                   //Inicialmente le damos el valor 0 que es el menor valor de cualquier cifra del número.    

        posicionMayor = 0; //variable que contendrá la posición donde se encuentra la cifra mayor del número
        posicion = 0; //variable que contendrá la posición de la cifra con la que estamos trabajando 
            
        while (num != 0) {
               posicion++;
               cifra = num % 10;        //obtenemos la cifra de la derecha del número
               if (cifra >= mayor) {    //si es mayor o igual que la mayor actual 
                   mayor = cifra;       // la tomamos como nueva mayor
                   posicionMayor = posicion; //y guardamos su posición
               }
               num = num / 10; //le quitamos al número su última cifra de la derecha. 
        }                      //Se repite el proceso mientras al número le queden cifras (num!=0)               
            
        System.out.print("Cifra mayor: " + mayor); //mostramos la cifra mayor del número
            
        System.out.println(" Posición: " + posicionMayor); //mostramos la posición de la cifra mayor
    }
}
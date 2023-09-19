package Ejercicio17;

import java.util.Scanner;

public class Mayor3Num {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese 3 números: ");
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();
        int num3 = lector.nextInt();
        int numMayor;
        numMayor = -9999999;
        if (num1 > num2 && num1 > num3) {
            numMayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            numMayor = num2;
        }else if (num3 > num1 && num3 > num2){
            numMayor = num3;
        }else{
            System.out.println("Son iguales");
        }
        System.out.println("EL número mayor es: " + numMayor);

    }
}

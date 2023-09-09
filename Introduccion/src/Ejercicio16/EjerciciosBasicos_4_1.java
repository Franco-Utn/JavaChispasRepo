package Ejercicio16;

public class EjerciciosBasicos_4_1 {
    public static void main(String[] args) {
//        Determina el valor que toma la variable x al ejecutarse cada una de las siguientes expresiones. Las instrucciones son independientes unas de otras, es decir, el valor inicial para las variables i, j, k en cada instrucción es i = 1, j = 1, k = 1.
        int i = 1, j = 1, k = 1;
        float x;

        // a) x = (j >= 0 && k > 1) ? ++j : k+1;
        x = (j >= 0 && k > 1) ? ++j : k+1;
        System.out.println("a) x = " + x);  // Salida: x = 2.0

        // b) x = (j > 1 || k >= 1) ? j+3 : k+1;
        x = (j > 1 || k >= 1) ? j+3 : k+1;
        System.out.println("b) x = " + x);  // Salida: x = 4.0

        // c) x = (j >= 1 && i <= 1) ? 10 : 20;
        x = (j >= 1 && i <= 1) ? 10 : 20;
        System.out.println("c) x = " + x);  // Salida: x = 10.0

        // d) x = (i + j > 2 || k < 1) ? 2 : 4;
        x = (i + j > 2 || k < 1) ? 2 : 4;
        System.out.println("d) x = " + x);  // Salida: x = 2.0

        // e) x = (3 / 2 > i) ? j+5 : k;
        x = (3 / 2 > i) ? j+5 : k;
        System.out.println("e) x = " + x);  // Salida: x = 6.0

        // f) x = (3 % 2 > i) ? j++ : ++k;
        x = (3 % 2 > i) ? j++ : ++k;
        System.out.println("f) x = " + x);  // Salida: x = 1.0

        // g) x = (i + 10 <= j + 10 || k == 0) ? -1 : -2;
        x = (i + 10 <= j + 10 || k == 0) ? -1 : -2;
        System.out.println("g) x = " + x);  // Salida: x = -1.0

        // h) x = (i == 0 || j == 1 || k == 2) ? 0 : 5;
        x = (i == 0 || j == 1 || k == 2) ? 0 : 5;
        System.out.println("h) x = " + x);  // Salida: x = 5.0

        // i) x = (i == 0 || j == 1 && k == 2) ? 0 : 5;
        x = (i == 0 || j == 1 && k == 2) ? 0 : 5;
        System.out.println("i) x = " + x);  // Salida: x = 5.0

        // j) x = (i != 0 || j == 1 && k == 2) ? 0 : 5;
        x = (i != 0 || j == 1 && k == 2) ? 0 : 5;
        System.out.println("j) x = " + x);  // Salida: x = 0.0
    }
}

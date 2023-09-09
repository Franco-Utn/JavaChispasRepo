package Ejercicio16;

public class EjerciciosBasicos_4 {
    public static void main(String[] args) {

//        Ejercicio 1: Un programa contiene las siguientes declaraciones y asignaciones iniciales de variables:
//        int i = 8, j = 5, k;
//        float x = 0.005F, y = -0.01F, z;
//        char a, b = 'p', c = 'q';
//        Determina el valor de cada una de las siguientes expresiones:
        int i = 8, j = 5, k;
        float x = 0.005F, y = -0.01F, z;
        char a, b = 'p', c = 'q';

        // a) k = (j == 5) ? i : j;
        k = (j == 5) ? i : j;  // El valor de j es igual a 5, por lo que se asigna i a k.
        System.out.println("a) k = " + k);  // Salida: k = 8

        // b) k = (j > 5) ? i : j;
        k = (j > 5) ? i : j;  // El valor de j no es mayor que 5, por lo que se asigna j a k.
        System.out.println("b) k = " + k);  // Salida: k = 5

        // c) z = (x >= 0) ? x : 0;
        z = (x >= 0) ? x : 0;  // El valor de x es mayor o igual a 0, por lo que se asigna x a z.
        System.out.println("c) z = " + z);  // Salida: z = 0.005

        // d) z = (y >= 0) ? y : 0;
        z = (y >= 0) ? y : 0;  // El valor de y no es mayor o igual a 0, por lo que se asigna 0 a z.
        System.out.println("d) z = " + z);  // Salida: z = 0.0

        // e) a = (b < c) ? b : c;
        a = (b < c) ? b : c;  // El valor de b ('p') es menor que c ('q'), por lo que se asigna b a a.
        System.out.println("e) a = " + a);  // Salida: a = p

        // f) k = (j > 0) ? j : 0;
        k = (j > 0) ? j : 0;  // El valor de j es mayor que 0, por lo que se asigna j a k.
        System.out.println("f) k = " + k);  // Salida: k = 5

        // g) k = (i > 0 && j > 0) ? 0 : 1;
        k = (i > 0 && j > 0) ? 0 : 1;  // Tanto i como j son mayores que 0, por lo que se asigna 0 a k.
        System.out.println("g) k = " + k);  // Salida: k = 0

        // h) k = (y > 0 || x > 0) ? i + 1 : i - 1;
        k = (y > 0 || x > 0) ? i + 1 : i - 1;  // Ni y ni x son mayores que 0, por lo que se asigna i - 1 a k.
        System.out.println("h) k = " + k);  // Salida: k = 7

        // i) a = (b < 'c') ? b : c;
        a = (b < 'c') ? b : c;  // El valor de b ('p') es menor que 'c', por lo que se asigna b a a.
        System.out.println("i) a = " + a);  // Salida: a = p

        // j) a = (b >= c) ? b : 'r';
        a = (b >= c) ? b : 'r';  // El valor de b ('p') no es mayor o igual que 'q', por lo que se asigna 'r' a a.
        System.out.println("j) a = " + a);  // Salida: a = r
//
    }
}

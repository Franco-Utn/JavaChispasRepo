package Ejercicio14;

public class EjerciciosBasicos_2 {
    public static void main(String[] args) {
//        Escribe un programa Java que declare una variable entera N y asígnale un valor. A continuación escribe las instrucciones que realicen los siguientes:Incrementar N en 77.
//Decrementarla en 3.
//Duplicar su valor.
        int N = 0;
        System.out.println("Valor inicial de N = " + N);
        N+=77;
        System.out.println("N + 77 = " + N);
        N-=3;
        System.out.println("N - 3 = " + N);
        N*=2;
        System.out.println("N * 2 = " + N);
//        Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación realiza las instrucciones necesarias para que:
//        B tome el valor de C
//        C tome el valor de A
//        A tome el valor de D
//        D tome el valor de B

        int A = 0, B = 1, C = 2, D = 3, AUX;
        System.out.println("Valores iniciales");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        System.out.println("Valores finales");
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C = " + C);
        System.out.println("A toma el valor de D -> A = " + A);
        System.out.println("D toma el valor de B -> D = " + D);
    }
}

package Ejercicio13;

public class EjerciciosBasicos {
    public static void main(String[] args) {
//        Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla:
        int N = 2;
        double A = 1.56;
        char C = 'c';
        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);
        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numérico del carácter " + C + " = " + (int)C);

//        Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla:

            int X = 1, Y = 2;
            double M = 3.2, W = 4.7;
            System.out.println("Variable X = " + X);
            System.out.println("Variable Y = " + Y);
            System.out.println("Variable M = " + M);
            System.out.println("Variable W = " + W);
            System.out.println(X + " + " + Y + " = " + (X+Y));
            System.out.println(X + " - " + Y + " = " + (X-Y));
            System.out.println(X + " * " + Y + " = " + X*Y);
            System.out.println(X + " / " + Y + " = " + X/Y);
            System.out.println(X + " % " + Y + " = " + X%Y);
            System.out.println(W + " + " + M + " = " + (W+M));
            System.out.println(W + " - " + M + " = " + (W-M));
            System.out.println(W + " * " + M + " = " + W*M);
            System.out.println(W + " / " + M + " = " + W/M);
            System.out.println(W + " % " + M + " = " + W%M);
            System.out.println(X + " + " + W + " = " + (X+W));
            System.out.println(Y + " / " + M + " = " + Y/M);
            System.out.println(Y + " % " + M + " = " + Y%M);
            System.out.println("Variable X = " + X + " el doble es " + 2*X);
            System.out.println("Variable Y = " + Y + " el doble es " + 2*Y);
            System.out.println("Variable M = " + M + " el doble es " + 2*M);
            System.out.println("Variable W = " + W + " el doble es " + 2*W);
            System.out.println(X + " + " + Y + " + " + W + " + " + M + " = " + (X+Y+M+W));
            System.out.println(X + " * " + Y + " * " + W + " * " + M + " = " + (X*Y*M*W));
        }
}

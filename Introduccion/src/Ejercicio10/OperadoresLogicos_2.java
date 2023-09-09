package Ejercicio10;

public class OperadoresLogicos_2 {
    public static void main(String[] args) {
//        Ejercicio 2: Si W, X, Y y Z son variables de tipo boolean con valores W = false, X = true, Y = true, Z = false, determina el valor de las siguientes expresiones lógicas:
                // Declaración e inicialización de variables booleanas
                boolean W = false;
                boolean X = true;
                boolean Y = true;
                boolean Z = false;

                // a) W || Y && X && W || Z
                boolean resultadoA = W || Y && X && W || Z;
                System.out.println("a) Resultado: " + resultadoA);

                // b) X && !Y && !X || !W && Y
                boolean resultadoB = X && !Y && !X || !W && Y;
                System.out.println("b) Resultado: " + resultadoB);

                // c) !(W || !Y) && X || Z
                boolean resultadoC = !(W || !Y) && X || Z;
                System.out.println("c) Resultado: " + resultadoC);

                // d) X && Y && W || Z || X
                boolean resultadoD = X && Y && W || Z || X;
                System.out.println("d) Resultado: " + resultadoD);

                // e) Y || !(Y || Z && W)
                boolean resultadoE = Y || !(Y || Z && W);
                System.out.println("e) Resultado: " + resultadoE);

                // f) !X && Y && (!Z || !X)
                boolean resultadoF = !X && Y && (!Z || !X);
                System.out.println("f) Resultado: " + resultadoF);

    }
}

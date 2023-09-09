package Ejercicio10;

public class OperadoresLogicos_1 {
    public static void main(String[] args) {
        //Ejercicio 1: Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las siguientes expresiones lógicas:
    boolean X,Y,Z;
    X=true;Y=false;Z=true;

        // a) (X && Y) || (X && Z)
        boolean resultadoA = (X && Y) || (X && Z);
        System.out.println("a) Resultado: " + resultadoA);

        // b) (X || !Y) && (!X || Z)
        boolean resultadoB = (X || !Y) && (!X || Z);
        System.out.println("b) Resultado: " + resultadoB);

        // c) X || Y && Z
        boolean resultadoC = X || Y && Z;
        System.out.println("c) Resultado: " + resultadoC);

        // d) !(X || Y) && Z
        boolean resultadoD = !(X || Y) && Z;
        System.out.println("d) Resultado: " + resultadoD);

        // e) X || Y || X && !Z && !Y
        boolean resultadoE = X || Y || X && !Z && !Y;
        System.out.println("e) Resultado: " + resultadoE);

        // f) !X || !Y || Z && X && !Y
        boolean resultadoF = !X || !Y || Z && X && !Y;
        System.out.println("f) Resultado: " + resultadoF);
    }
}

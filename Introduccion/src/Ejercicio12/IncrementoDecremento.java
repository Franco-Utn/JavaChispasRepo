package Ejercicio12;

public class IncrementoDecremento {
    public static void main(String[] args) {
//        Ejercicio 1: Si x es una variable de tipo int con valor 10, determina qué se muestra por pantalla cuando se ejecutan las siguientes instrucciones:
        int x = 10;
        System.out.println(x);
        x++;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(++x);
        ++x;
        x++;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(++x);
//        Ejercicio 2: Dadas las variables A y B de tipo char, calcula qué se muestra por pantalla cuando se ejecutan las siguientes instrucciones:
        char A = 'c';
        char B;
        System.out.println(A++);
        System.out.println(A++);
        System.out.println(++A);
        B = --A;
        System.out.println(++A);
        A++;
        --B;
        System.out.println(B++);
        System.out.println(++B);
        System.out.println(++A);
        System.out.println(B--);
        System.out.println(A);
        System.out.println(B);
//        Ejercicio 3: Un programa Java contiene las siguientes declaraciones y asignaciones iniciales:
//        Determina el valor final de las tres variables en cada una de las siguientes instrucciones. Las instrucciones son independientes unas de otras, es decir, el valor inicial de las variables en cada instrucción es i = 1, j = 1, k = 1.
        int i, j, k;
        i = 1;
        j = 1;
        k = 1;

        i = ++j;
// Incrementa j antes de asignar su valor a i.
//
        System.out.println("a) i = " + i); // i = 2
        System.out.println("   j = " + j); // j = 2
        System.out.println("   k = " + k); // k = 1

        i = 1;
        j = 1;
        k = 1;

        i = k++;
// Asigna el valor actual de k a i y luego incrementa k.
//
        System.out.println("b) i = " + i); // i = 1
        System.out.println("   j = " + j); // j = 1
        System.out.println("   k = " + k); // k = 2

        i = 1;
        j = 1;
        k = 1;

        i = k + ++j;
// Incrementa j antes de usarlo en la suma.
//
        System.out.println("c) i = " + i); // i = 3
        System.out.println("   j = " + j); // j = 2
        System.out.println("   k = " + k); // k = 1

        i = 1;
        j = 1;
        k = 1;
        i = i + j++;
// Usa el valor actual de j en la suma y luego incrementa j.
//
        System.out.println("d) i = " + i); // i = 2
        System.out.println("   j = " + j); // j = 2
        System.out.println("   k = " + k); // k = 1

        i = 1;
        j = 1;
        k = 1;
        i = j + ++k;
// Incrementa k antes de usarlo en la suma.
//
        System.out.println("e) i = " + i); // i = 3
        System.out.println("   j = " + j); // j = 1
        System.out.println("   k = " + k); // k = 2

        i = 1;
        j = 1;
        k = 1;
i = ++j + k++;
// Incrementa j antes de usarlo en la suma, incrementa k después de usarlo en la asignación.
//
        System.out.println("f) i = " + i); // i = 3
        System.out.println("   j = " + j); // j = 2
        System.out.println("   k = " + k); // k = 2

        i = 1;
        j = 1;
        k = 1;
j = k-- + --i;
// Decrementa k después de usarlo en la suma, decrementa i antes de usarlo en la asignación.
//
        System.out.println("g) i = " + i); // i = 0
        System.out.println("   j = " + j); // j = 1
        System.out.println("   k = " + k); // k = 0

        i = 1;
        j = 1;
        k = 1;
i = k + 1 + ++j;
// Incrementa j antes de usarlo en la suma.
// j se convierte en 7, k es 3, i se establece en 11.
        System.out.println("h) i = " + i); // i = 11
        System.out.println("   j = " + j); // j = 7
        System.out.println("   k = " + k); // k = 3

        i = 1;
        j = 1;
        k = 1;
i = ++i + --j + k--;
// Incrementa i antes de usarlo en la suma, decrementa j antes de usarlo en la suma,

        System.out.println("i) i = " + i); // i = 3
        System.out.println("   j = " + j); // j = 0
        System.out.println("   k = " + k); // k = 0

        i = 1;
        j = 1;
        k = 1;
k = j-- + ++k;
// Decrementa j después de usarlo en la suma, incrementa k antes de usarlo en la asignación.
// j se convierte en 6, k se convierte en 3, k se establece en 3.
        System.out.println("j) i = " + i); // i = 1
        System.out.println("   j = " + j); // j = 0
        System.out.println("   k = " + k); // k = 3



    }
}

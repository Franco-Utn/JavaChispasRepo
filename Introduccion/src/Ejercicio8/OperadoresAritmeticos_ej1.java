package Ejercicio8;

public class OperadoresAritmeticos_ej1 {
    public static void main(String[] args) {
//Ejercicio 1: Si a, b y c son variables enteras con valores a=8, b=3, c=-5, determina el valor de las siguientes expresiones aritméticas:
         int a , b , c;
         double ejercicio_a , ejercicio_b , ejercicio_c , ejercicio_d , ejercicio_e , ejercicio_f , ejercicio_g , ejercicio_h , ejercicio_i , ejercicio_j , ejercicio_k , ejercicio_l , ejercicio_m , ejercicio_n;
         a = 8;
         b=3;
         c=-5;

         //a) a + b + c
        ejercicio_a = a + b + c;
        System.out.println(ejercicio_a);
        //b) 2 * b + 3 * (a – c)
        ejercicio_b = 2 * b + 3 * (a - c);
        System.out.println(ejercicio_b);
        //c) a / b
        ejercicio_c = a / b;
        System.out.println(ejercicio_c);
        //d) a % 2
        ejercicio_d = a % b;
        System.out.println(ejercicio_d);
//        e) a / c
        ejercicio_e = a / c;
        System.out.println(ejercicio_e);
//        f) a % c
        ejercicio_f = a % c;
        System.out.println(ejercicio_f);
//        g) a * b / c
        ejercicio_g = a * b / c;
        System.out.println(ejercicio_g);
//        h) a * (b / c)
        ejercicio_h = a * (b / c);
        System.out.println(ejercicio_h);
//        i) (a * c) % b
        ejercicio_i = (a * c) % b;
        System.out.println(ejercicio_i);
//        j)  a * (c % b)
        ejercicio_j =  a * (c % b);
        System.out.println(ejercicio_j);
//        k)(3 * a – 2 * b) % (2 * a – c)
        ejercicio_k = (3 * a - 2 * b) % (2 * a - c);
        System.out.println(ejercicio_k);
//        l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)
        ejercicio_l =  2 * ( a / 5 + (4 - b * 3)) % (a + c - 2);
        System.out.println(ejercicio_l);
//        m)(a - 3 * b) % (c + 2 * a) / (a - c)
        ejercicio_m = (a - 3 * b) % (c + 2 * a) / (a - c);
        System.out.println(ejercicio_m);
//        n)a - b - c * 2
        ejercicio_n = a - b - c * 2;
        System.out.println(ejercicio_n);
    }
}

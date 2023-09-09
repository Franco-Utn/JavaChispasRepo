package Ejercicio8;

public class OperadoresAritméticos_2 {
    public static void main(String[] args) {
        // Ejercicio 2: Si x, y, z son variables de tipo double con valores x= 88, y = 3.5, z = -5.2,
        // determina el valor de las siguientes expresiones aritméticas. Obtén el resultado de cada expresión
        // con un máximo de cuatro decimales.

        double x, y, z;
        double ejercicio_a, ejercicio_b, ejercicio_c, ejercicio_d, ejercicio_e, ejercicio_f, ejercicio_g,
                ejercicio_h, ejercicio_i, ejercicio_j, ejercicio_k, ejercicio_l, ejercicio_m, ejercicio_n;

        x = 88;
        y = 3.5;
        z = -5.2;

        // a) x + y + z
        ejercicio_a = x + y + z;
        System.out.printf("a) %.4f\n", ejercicio_a);

        // b) 2 * y + 3 * (x – z)
        ejercicio_b = 2 * y + 3 * (x - z);
        System.out.printf("b) %.4f\n", ejercicio_b);

        // c) x / y
        ejercicio_c = x / y;
        System.out.printf("c) %.4f\n", ejercicio_c);

        // d) x % y
        ejercicio_d = x % y;
        System.out.printf("d) %.4f\n", ejercicio_d);

        // e) x / (y + z)
        ejercicio_e = x / (y + z);
        System.out.printf("e) %.4f\n", ejercicio_e);

        // f) (x / y) + z
        ejercicio_f = (x / y) + z;
        System.out.printf("f) %.4f\n", ejercicio_f);

        // g) 2 * x / 3 * y
        ejercicio_g = 2 * x / (3 * y);
        System.out.printf("g) %.4f\n", ejercicio_g);

        // h) 2 * x / (3 * y)
        ejercicio_h = 2 * x / (3 * y);
        System.out.printf("h) %.4f\n", ejercicio_h);

        // i) x * y % z
        ejercicio_i = (x * y) % z;
        System.out.printf("i) %.4f\n", ejercicio_i);

        // j) x * (y % z)
        ejercicio_j = x * (y % z);
        System.out.printf("j) %.4f\n", ejercicio_j);

        // k) 3 * x – z – 2 * x
        ejercicio_k = 3 * x - z - 2 * x;
        System.out.printf("k) %.4f\n", ejercicio_k);

        // l) 2 * x / 5 % y
        ejercicio_l = (2 * x / 5) % y;
        System.out.printf("l) %.4f\n", ejercicio_l);

        // m) x - 100 % y % z
        ejercicio_m = x - (100 % y) % z;
        System.out.printf("m) %.4f\n", ejercicio_m);

        // n) x - y - z * 2
        ejercicio_n = x - y - z * 2;
        System.out.printf("n) %.4f\n", ejercicio_n);
    }

}

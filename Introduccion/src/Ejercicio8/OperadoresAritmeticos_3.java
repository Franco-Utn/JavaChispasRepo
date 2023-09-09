package Ejercicio8;

public class OperadoresAritmeticos_3 {
    public static void main(String[] args) {
        // Ejercicio 3: Si c1, c2 y c3 son variables de tipo char con valores c1=’E’, c2=’5’, c3=’?’, determina
        // el valor numérico de las siguientes expresiones aritméticas. Para resolverlo necesitas saber el valor
        // numérico correspondiente a esos caracteres según la tabla ASCII:
        // 'E'   69
        // '5'   53
        // '?'   63

        char c1, c2, c3;
        int ejercicio_a, ejercicio_b, ejercicio_c, ejercicio_d, ejercicio_e, ejercicio_f,
                ejercicio_g, ejercicio_h, ejercicio_i, ejercicio_j;

        c1 = 'E';
        c2 = '5';
        c3 = '?';

        // a) c1 + 1
        ejercicio_a = c1 + 1;
        System.out.println("a) " + ejercicio_a);

        // b) c1 - c2 + c3
        ejercicio_b = c1 - c2 + c3;
        System.out.println("b) " + ejercicio_b);

        // c) c2 - 2
        ejercicio_c = c2 - 2;
        System.out.println("c) " + ejercicio_c);

        // d) c2 - '2'
        ejercicio_d = c2 - '2';
        System.out.println("d) " + ejercicio_d);

        // e) c3 + '#'
        ejercicio_e = c3 + '#';
        System.out.println("e) " + ejercicio_e);

        // f) c1 % c3
        ejercicio_f = c1 % c3;
        System.out.println("f) " + ejercicio_f);

        // g) '2' + '2'
        ejercicio_g = '2' + '2';
        System.out.println("g) " + ejercicio_g);

        // h) (c1 / c2) * c3
        ejercicio_h = (c1 / c2) * c3;
        System.out.println("h) " + ejercicio_h);

        // i) 3 * c2
        ejercicio_i = 3 * c2;
        System.out.println("i) " + ejercicio_i);

        // j) '3' * c2
        ejercicio_j = '3' * c2;
        System.out.println("j) " + ejercicio_j);
    }

}

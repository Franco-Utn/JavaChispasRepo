package Ejercicio11;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 8, j = 5;
        float x = 0.005F, y = -0.01F;
        char c = 'c', d = 'd';

        // a) i <= j
        boolean a = i <= j;
        System.out.println("a) " + a);

        // b) c > d
        boolean b = c > d;
        System.out.println("b) " + b);

        // c) x >= 0
        boolean c1 = x >= 0;
        System.out.println("c) " + c1);

        // d) x < y--
        boolean d1 = x < y--;
        System.out.println("d) " + d1);

        // e) j != 6
        boolean e = j != 6;
        System.out.println("e) " + e);

        // f) c == 99
        boolean f = c == 99;
        System.out.println("f) " + f);

        // g) !(i <= j)
        boolean g = !(i <= j);
        System.out.println("g) " + g);

        // h) !(c == 99)
        boolean h = !(c == 99);
        System.out.println("h) " + h);

        // i) !(x > 0)
        boolean i1 = !(x > 0);
        System.out.println("i) " + i1);

        // j) -j == i - 13
        boolean j1 = -j == i - 13;
        System.out.println("j) " + j1);

        // k) ++x > 0
        boolean k = ++x > 0;
        System.out.println("k) " + k);

        // l) y-- < 1
        boolean l = y-- < 1;
        System.out.println("l) " + l);

        // m) c > d || c > 0
        boolean m = c > d || c > 0;
        System.out.println("m) " + m);

        // n) 5 * (i + j) > 'c'
        boolean n = 5 * (i + j) > 'c';
        System.out.println("n) " + n);

        // o) 2 * x + y == 0
        boolean o = 2 * x + y == 0;
        System.out.println("o) " + o);

        // p) 2 * x + (y == 0)
//        boolean p = 2 * x + (y == 0);
//        System.out.println("p) " + p);

        // q) x + y >= 0
        boolean q = x + y >= 0;
        System.out.println("q) " + q);

        // r) x < ++y
        boolean r = x < ++y;
        System.out.println("r) " + r);

        // s) -(i + j) != -i + j
        boolean s = -(i + j) != -i + j;
        System.out.println("s) " + s);

        // t) i <= j && i >= c
        boolean t = i <= j && i >= c;
        System.out.println("t) " + t);

        // u) i > 0 && j < 5
        boolean u = i > 0 && j < 5;
        System.out.println("u) " + u);

        // v) i > 0 || j < 5
        boolean v = i > 0 || j < 5;
        System.out.println("v) " + v);

        // w) x > y && i > 0 || j < 5
        boolean w = x > y && i > 0 || j < 5;
        System.out.println("w) " + w);

        // x) (3 * i - 2 * j) % (2 * d - c) > 3 * d
        boolean x1 = (3 * i - 2 * j) % (2 * d - c) > 3 * d;
        System.out.println("x) " + x1);

        // y) 2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10
        boolean y1 = 2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10;
        System.out.println("y) " + y1);

        // z) (i - 3 * j) % (c + 2 * d) / (x - y) >= 0
        boolean z = (i - 3 * j) % (c + 2 * d) / (x - y) >= 0;
    }
}

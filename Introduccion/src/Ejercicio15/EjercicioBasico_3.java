package Ejercicio15;

import java.util.Scanner;

public class EjercicioBasico_3 {
    public static void main(String[] args) {


//    Escribe un programa java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
//    Si por ejemplo A = 14 la salida será
        Scanner entrada = new Scanner(System.in);
        // Pedir al usuario que ingrese un número
        System.out.println("Por favor, ingrese un número: ");
        // Leer el número ingresado por el usuario
        int numero = entrada.nextInt();
        System.out.println(numero % 2 == 0 ? "Es par" : "Es impar");
//        Escribe un programa java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
        Scanner entrada2 = new Scanner(System.in);
        // Pedir al usuario que ingrese un número
        System.out.println("Por favor, ingrese un número: ");
        // Leer el número ingresado por el usuario
        int numero2 = entrada2.nextInt();
        System.out.println(numero2 >= 0 ? "Es positivo" : "Es negativo");
//        Escribe un programa java que declare una variable C de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
        Scanner entrada3 = new Scanner(System.in);
        // Pedir al usuario que ingrese un número
        System.out.println("Por favor, ingrese un número: ");
        // Leer el número ingresado por el usuario
        int C = entrada3.nextInt();
        System.out.println(C + (C >= 0 ? " es positivo " : " es negativo "));
        System.out.println(C + (C%2== 0 ? " es par " : " es impar "));
        System.out.println(C + (C%5== 0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
        System.out.println(C + (C%10== 0 ? " es múltiplo de 10 " : " no es múltiplo de 10 "));
        System.out.println(C + (C>100 ? " es mayor que 100 " : " es menor que 100 "));
    } }


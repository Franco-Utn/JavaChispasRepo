package Ejercicio8;
import java.io.IOException;
import java.util.Scanner;

public class CifradoCesar {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto = obtenerTexto(sc);
        int codigo = obtenerCodigo(sc);
        char opcion = obtenerOpcion(sc);

        if (Character.toUpperCase(opcion) == 'C') {
            System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
        } else {
            System.out.println("Texto descifrado: " + descifradoCesar(texto, codigo));
        }
    }

    public static String obtenerTexto(Scanner sc) {
        String texto;
        do {
            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        return texto;
    }

    public static int obtenerCodigo(Scanner sc) {
        int codigo;
        do {
            System.out.print("Introduce el código: ");
            codigo = sc.nextInt();
        } while (codigo < 1);
        return codigo;
    }

    public static char obtenerOpcion(Scanner sc) {
        char opcion;
        do {
            sc.nextLine();
            System.out.print("(C) cifrar o (D) descifrar?: ");
            opcion = Character.toUpperCase(sc.next().charAt(0));
        } while (opcion != 'C' && opcion != 'D');
        return opcion;
    }

    public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        // (el resto del código se mantiene igual)
        return cifrado.toString();
    }

    public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        // (el resto del código se mantiene igual)
        return cifrado.toString();
    }
}
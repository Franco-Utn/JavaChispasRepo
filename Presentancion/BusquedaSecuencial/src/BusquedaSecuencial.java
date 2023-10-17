import java.util.Scanner;

public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] arreglo, int elementoBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elementoBuscado) {
                return i;  // Se encontró el elemento, se devuelve su posición
            }
        }
        return -1;  // Si no se encuentra el elemento, se devuelve -1
    }

    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número que quieras buscar (del 1 al 100): ");
        int elementoBuscado = scanner.nextInt();

        int resultado = busquedaSecuencial(numeros, elementoBuscado);

        if (resultado != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + resultado);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en la lista.");
        }
    }
}

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();
        int suma = 0;

        // Generar 20 números enteros positivos pares aleatorios del 1 al 100
        for (int i = 0; i < 20; i++) {
            int numero = rand.nextInt(50) * 2 + 2; // Genera un número par (2, 4, 6, ...) en el rango 1-100
            numeros.add(numero);
            suma += numero;
        }

        // Calcular el promedio aritmético
        double promedio = (double) suma / numeros.size();

        // Contar cuántos números son iguales, mayores y menores que el promedio
        int igualesAlPromedio = 0;
        int mayoresAlPromedio = 0;
        int menoresAlPromedio = 0;

        for (int numero : numeros) {
            if (numero == promedio) {
                igualesAlPromedio++;
            } else if (numero > promedio) {
                mayoresAlPromedio++;
            } else {
                menoresAlPromedio++;
            }
        }

        System.out.println("Números generados: " + numeros);
        System.out.println("Promedio aritmético: " + promedio);
        System.out.println("Números iguales al promedio: " + igualesAlPromedio);
        System.out.println("Números mayores que el promedio: " + mayoresAlPromedio);
        System.out.println("Números menores que el promedio: " + menoresAlPromedio);
    }
}

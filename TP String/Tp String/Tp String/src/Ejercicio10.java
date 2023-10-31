import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingresa una frase: ");

        if (frase.endsWith(".")) {
            String[] palabras = frase.substring(0, frase.length() - 1).split("\\s+");

            String palabraMasConsonantes = "";

            for (String palabra : palabras) {
                int contadorConsonantes = 0;
                String palabraActual = palabra.toLowerCase(); // Convierte la palabra a minúsculas para simplificar la comparación

                for (int i = 0; i < palabraActual.length(); i++) {
                    char letra = palabraActual.charAt(i);

                    if ("bcdfghjklmnpqrstvwxyz".indexOf(letra) != -1) {
                        contadorConsonantes++;
                    } else {
                        contadorConsonantes = 0;
                    }

                    if (contadorConsonantes > palabraMasConsonantes.length()) {
                        palabraMasConsonantes = palabra;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "La palabra con más consonantes consecutivas es: " + palabraMasConsonantes);


        } else {
            JOptionPane.showMessageDialog(null, "La frase no termina en un punto.");
        }
    }
}

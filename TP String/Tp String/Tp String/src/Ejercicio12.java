import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa una frase: ");

        if (input.endsWith(".")) {
            String[] frases = input.split(";");

            String fraseMasPalabras = "";
            int maxPalabras = 0;

            for (String frase : frases) {
                String[] palabras = frase.trim().split("\\s+");
                int cantidadPalabras = palabras.length;

                if (cantidadPalabras > maxPalabras) {
                    maxPalabras = cantidadPalabras;
                    fraseMasPalabras = frase.trim(); // Conserva los espacios alrededor de la frase
                }
            }

            String[] palabrasFraseMasPalabras = fraseMasPalabras.split("\\s+");
            String palabraMasCorta = encontrarPalabraMasCorta(palabrasFraseMasPalabras);
            JOptionPane.showMessageDialog(null, "La frase con más palabras es: " + fraseMasPalabras +
                    "\nLa palabra más corta en esa frase es: " + palabraMasCorta);
        } else {
            JOptionPane.showMessageDialog(null, "La frase no termina en punto.");
        }
    }

    public static String encontrarPalabraMasCorta(String[] palabras) {
        String palabraMasCorta = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
        }
        return palabraMasCorta;
    }
}


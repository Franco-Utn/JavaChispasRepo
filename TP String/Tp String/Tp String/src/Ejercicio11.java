import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa una frase: ");

        if (input.endsWith(".")) {
            String[] frases = input.split(" ; ");

            String fraseMasPalabras = "";
            int maxPalabras = 0;

            for (String frase : frases) {
                String[] palabras = frase.split("\\s+");
                int cantidadPalabras = palabras.length;

                if (cantidadPalabras > maxPalabras) {
                    maxPalabras = cantidadPalabras;
                    fraseMasPalabras = frase;
                }
            }

            JOptionPane.showMessageDialog(null, "La frase con más palabras es: " + fraseMasPalabras);


        }else{
            JOptionPane.showMessageDialog(null, "La frase no termina en punto");

        }
    }
}


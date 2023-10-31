import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Introduzca una frase: ");

        if (frase.endsWith(".")) {
            int vocales = 0;
            String frase_minus = frase.toLowerCase();

            for (int i = 0; i < frase_minus.length(); i++) {
                char caracter = frase_minus.charAt(i);
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    vocales++;
                }
            }

            JOptionPane.showMessageDialog(null, "La frase contiene " + vocales + " vocales");
        } else {
            JOptionPane.showMessageDialog(null, "La frase no termina en un punto.");
        }
    }
}

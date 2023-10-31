import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingresa una frase: ");

        if (frase.endsWith(".")) {
            String[] palabras = frase.substring(0, frase.length() - 1).split("\\s+");
            int cantidadPalabras = palabras.length;

            JOptionPane.showMessageDialog(null, "LA CANTIDAD DE PALABRAS EN EL TEXTO ES DE: "+ cantidadPalabras);
        } else {
            JOptionPane.showMessageDialog(null, "La frase no termina en un punto.");
        }
    }
}


import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingresa una frase: ");

        if (frase.endsWith(".")) {
            int palabrasTerVocal = 0;
            String[] palabras = frase.substring(0, frase.length() - 1).split("\\s+");

            for (String palabra : palabras) {
                if (palabra.endsWith("a") || palabra.endsWith("e") || palabra.endsWith("i") || palabra.endsWith("o") || palabra.endsWith("u")) {
                    palabrasTerVocal++;
                }
            }

            JOptionPane.showMessageDialog(null, "LA CANTIDAD DE PALABRAS TERMINADAS EN VOCAL SON: " + palabrasTerVocal);
        }else {
            JOptionPane.showMessageDialog(null, "La frase no termina en punto");
        }
    }
}


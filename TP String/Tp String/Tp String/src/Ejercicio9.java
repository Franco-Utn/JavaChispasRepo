import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Ingresa una frase: ");

        if (frase.endsWith(".")) {
            String[] palabras = frase.substring(0, frase.length() - 1).split("\\s+");
            String palabraMasLarga = "";

            for (String palabra : palabras){
                if (palabra.length() > palabraMasLarga.length()){
                    palabraMasLarga = palabra;

                }
            }
            JOptionPane.showConfirmDialog(null, "La palabra mas larga es: "+ palabraMasLarga);
        }else{
            JOptionPane.showConfirmDialog(null, "La frase no termina en punto");

        }
    }
}

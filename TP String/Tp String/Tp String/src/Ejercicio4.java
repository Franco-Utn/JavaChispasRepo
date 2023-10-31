import javax.swing.JOptionPane;
public class Ejercicio4 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el texto
        String texto = JOptionPane.showInputDialog("Ingrese un texto terminado en un punto:");

        if (texto != null) {
            int contador = 0;

            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                    contador++;
                }
            }

            JOptionPane.showMessageDialog(null, "La cantidad de letras 'a' en el texto es: " + contador);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresó ningún texto.");
        }
    }
}


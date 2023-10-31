import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int negatividad = 0;
        int suma = 0;
        int vecessuma =0;
        int[] numeros = new int[10];

        for (int i = 0; i < 10 ; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor "+ (i+1) +" del arreglo"));
            if (numeros[i] < negatividad) {
                negatividad = numeros[i];
            }

            if (numeros[i] > 0) {
                suma = (suma + numeros[i]);
                vecessuma++;
            }
        }

        JOptionPane.showMessageDialog(null, "El número más grande negativo ingresado fue: " + negatividad);
        JOptionPane.showMessageDialog(null, "El promedio de los numeros positivos fue: " + (suma/vecessuma));

    }
}

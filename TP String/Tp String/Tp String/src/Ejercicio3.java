import javax.swing.*;

    public class Ejercicio3 {
        public static void main(String[] args) {
            int pares = 0;
            int suma = 0;
            int[] numeros = new int[10];

            for (int i = 0; i < 10 ; i++){
                numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor "+ (i+1) +" del arreglo"));
                if (i == 0){
                    pares = numeros[i];
                }
                if (numeros[i] % 2 == 0 && numeros[i] < pares) {
                    pares = numeros[i];
                }

                if (numeros[i] % 2 != 0) {
                    suma = suma + 1;

                }
            }

            JOptionPane.showMessageDialog(null, "El menor de los pares fue: " + pares);
            JOptionPane.showMessageDialog(null, "La cantidad de impares fue de: " + (suma));
        }
    }


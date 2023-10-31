import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("");
        String frase = JOptionPane.showInputDialog("Introduzca una frase: ");
        int x = frase.length();
        JOptionPane.showMessageDialog(null, "La longitud de la cadena es: "+x);
        int xx = x-1;
        int z = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de posicion dentro de la cadena:(El rango de valores posibles es de: 0 a)" + xx));
        String zz = String.valueOf(frase.charAt(z));
        if (zz.equals(" ")|| zz.equals("")) {
            JOptionPane.showMessageDialog(null,"El caracter ingresado es un espacio");
        } else {
            JOptionPane.showMessageDialog(null,"El caracter en la posicion ingresada es:  " + zz );
        }
        String zx = JOptionPane.showInputDialog("Introduzca una subcadena");
        boolean xz = frase.contains(zx);
        int indiceInicio = frase.indexOf(zx);
        if (xz){
            int indiceFinal = (indiceInicio + zx.length()) - 1;
            JOptionPane.showMessageDialog(null,"La subcadena '" + zx+ "' comienza en " + indiceInicio +" y termina en " + indiceFinal );
        }
        String zxz = JOptionPane.showInputDialog("Introduzca un carcter");
        char zxzChar = zxz.charAt(0);
        int caracteres = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == zxzChar) {
                caracteres++;
            }
        }

        JOptionPane.showMessageDialog(null,"El caracter aparece "+caracteres +" veces");
        String fraseMayuscula = frase.toUpperCase();
        JOptionPane.showMessageDialog(null,"La frase en mayusculas es: "+fraseMayuscula);

    }
}
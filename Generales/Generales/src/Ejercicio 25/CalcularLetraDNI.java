import java.util.Scanner;

Public class CalcularLetradni {
    public static char CalcularLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni;
        System.out.print("Introduce número de DNI: ");
        dni = sc.nextInt();
        System.out.println("Letra dni -> " + CalcularLetraDNI(dni));
    }

}
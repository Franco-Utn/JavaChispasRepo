import java.util.ArrayList;

class Nota {
    String catedra;
    double notaExamen;

    Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }
}

class Alumno {
    String nombreCompleto;
    long legajo;
    ArrayList<Nota> notas;

    Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public double calcularPromedio() {
        double suma = 0;
        for(Nota n : notas) {
            suma += n.notaExamen;
        }
        return suma / notas.size();
    }
}

public class CargaNotas {

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        // carga de alumnos
        String salirAlumno = "N";
        while(!salirAlumno.equalsIgnoreCase("S")) {

            System.out.println("Ingrese datos del alumno");

            System.out.print("Nombre completo: ");
            String nombreCompleto = leerString();

            System.out.print("Legajo: ");
            long legajo = leerLong();

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            String salirNota = "N";
            while(!salirNota.equalsIgnoreCase("S")) {

                System.out.print("Nombre cátedra: ");
                String catedra = leerString();

                System.out.print("Nota examen: ");
                double nota = leerDouble();

                Nota n = new Nota(catedra, nota);
                alumno.notas.add(n);

                System.out.print("Salir de carga de notas (S/N): ");
                salirNota = leerString();
            }

            alumnos.add(alumno);

            System.out.print("Salir de carga de alumnos (S/N): ");
            salirAlumno = leerString();
        }

        // mostrar datos cargados
        for(Alumno a : alumnos) {
            System.out.println("\nDatos Alumno: " + a.nombreCompleto + " - " + a.legajo);
            for(Nota n : a.notas) {
                System.out.println("Nota: " + n.catedra + " - " + n.notaExamen);
            }
            System.out.println("Promedio: " + a.calcularPromedio());
        }

    }

    public static String leerString() {
        return new java.util.Scanner(System.in).nextLine();
    }

    public static long leerLong() {
        return new java.util.Scanner(System.in).nextLong();
    }

    public static double leerDouble() {
        return new java.util.Scanner(System.in).nextDouble();
    }

}
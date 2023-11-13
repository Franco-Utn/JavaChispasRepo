import java.util.ArrayList;

class Ingrediente {
    String nombre;
    double cantidad;
    String unidadMedida;

    Ingrediente(String nombre, double cantidad, String unidadMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }
}

class Plato {
    String nombre;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> ingredientes;

    Plato(String nombre, double precio, boolean esBebida) {
        this.nombre = nombre;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }
}

public class MenuRestaurant {

    public static void main(String[] args) {

        ArrayList<Plato> platos = new ArrayList<>();

        String salir = "N";
        while(!salir.equalsIgnoreCase("S")) {

            System.out.print("Nombre plato: ");
            String nombre = leerString();

            System.out.print("Precio: ");
            double precio = leerDouble();

            System.out.print("Es bebida (S/N): ");
            boolean esBebida = leerString().equalsIgnoreCase("S");

            Plato plato = new Plato(nombre, precio, esBebida);

            if(!esBebida) {
                String salirIngrediente = "N";
                while(!salirIngrediente.equalsIgnoreCase("S")) {

                    System.out.print("Nombre ingrediente: ");
                    String nombreIngrediente = leerString();

                    System.out.print("Cantidad: ");
                    double cantidad = leerDouble();

                    System.out.print("Unidad de medida: ");
                    String unidadMedida = leerString();

                    Ingrediente i = new Ingrediente(nombreIngrediente, cantidad, unidadMedida);
                    plato.ingredientes.add(i);

                    System.out.print("Salir de carga de ingredientes (S/N): ");
                    salirIngrediente = leerString();

                }
            }

            platos.add(plato);

            System.out.print("Salir de carga de platos (S/N): ");
            salir = leerString();

        }

        // mostrar menu
        System.out.println("\n------------- MENÚ -------------");
        for(Plato p : platos) {
            System.out.println(p.nombre);
            System.out.println("Precio: $" + p.precio);
            if(!p.esBebida) {
                System.out.println("Ingredientes:");
                for(Ingrediente i : p.ingredientes) {
                    System.out.println(i.nombre + " " + i.cantidad + " " + i.unidadMedida);
                }
            }
            System.out.println("--------------------------------");
        }

    }

    public static String leerString() {
        return new java.util.Scanner(System.in).nextLine();
    }

    public static double leerDouble() {
        return new java.util.Scanner(System.in).nextDouble();
    }

}

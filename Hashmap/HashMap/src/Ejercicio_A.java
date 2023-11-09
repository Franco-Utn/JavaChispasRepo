import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_A {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion;

        String nombre;
        Long numero;

        HashMap<String, Long> agenda = new HashMap<String, Long>();

        while (!salir) {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nombre: ");
                        nombre = sn.next();
                        System.out.println("Introduce el número de teléfono: ");
                        numero = sn.nextLong();

                        if (!agenda.containsKey(nombre)) {
                            agenda.put(nombre, numero);
                            System.out.println("Se ha añadido el contacto");
                        } else {
                            System.out.println("Ya existe el contacto");
                        }
                        break;

                    case 2:
                        System.out.println("Introduce el nombre: ");
                        nombre = sn.next();

                        if (agenda.containsKey(nombre)) {
                            System.out.println("El teléfono es: " + agenda.get(nombre));
                        } else {
                            System.out.println("La persona buscada no se encuentra en la agenda");
                        }
                        break;

                    case 3:
                        if (agenda.isEmpty()) {
                            System.out.println("No hay contactos en la agenda");
                        } else {
                            for (Map.Entry<String, Long> entry : agenda.entrySet()) {
                                System.out.println("Nombre: " + entry.getKey() + " Teléfono: " + entry.getValue());
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Agenda cerrada");
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

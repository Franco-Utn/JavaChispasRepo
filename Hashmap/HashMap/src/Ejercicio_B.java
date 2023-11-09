import java.util.HashSet;
import java.util.Scanner;

class ComponenteCPU {
    private String componente;
    private String marca;
    private int cantidad;
    private double precio;

    public ComponenteCPU(String componente, String marca, int cantidad, double precio) {
        this.componente = componente;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getSubTotal() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return componente + " " + marca + " " + cantidad + " " + precio + " SubTotal: " + getSubTotal();
    }
}

class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponenteCPU> componentes = new HashSet<>();

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void agregarComponente(ComponenteCPU componente) {
        componentes.add(componente);
    }

    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (ComponenteCPU componente : componentes) {
            costoTotal += componente.getSubTotal();
        }
        return costoTotal;
    }

    public double calcularPrecioVenta() {
        double costoTotal = calcularCostoTotal();
        if (costoTotal < 50000) {
            return costoTotal + (0.4 * costoTotal);
        } else {
            return costoTotal + (0.3 * costoTotal);
        }
    }

    public void mostrarInformacion() {
        System.out.println("-----------Computadora----------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Componentes:");

        for (ComponenteCPU componente : componentes) {
            System.out.println(componente);
        }

        double costoTotal = calcularCostoTotal();
        System.out.println("Costo Total " + costoTotal);

        double precioVenta = calcularPrecioVenta();
        double precioSugerido = costoTotal;
        if (costoTotal < 50000) {
            precioSugerido += (0.4 * costoTotal);
        } else {
            precioSugerido += (0.3 * costoTotal);
        }

        System.out.println("El precio sugerido de venta es " + precioSugerido);
    }
}

public class Ejercicio_B{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la marca de la computadora: ");
            String marca = sn.nextLine();

            System.out.println("Ingrese el modelo de la computadora: ");
            String modelo = sn.nextLine();

            Computadora computadora = new Computadora(marca, modelo);

            while (true) {
                System.out.println("Ingrese el nombre del componente CPU: ");
                String componente = sn.nextLine();

                System.out.println("Ingrese la marca del componente CPU: ");
                String componenteMarca = sn.nextLine();

                System.out.println("Ingrese la cantidad de componentes CPU: ");
                int cantidad = sn.nextInt();

                System.out.println("Ingrese el precio por unidad del componente CPU: ");
                double precio = sn.nextDouble();

                ComponenteCPU componenteCPU = new ComponenteCPU(componente, componenteMarca, cantidad, precio);
                computadora.agregarComponente(componenteCPU);

                System.out.println("¿Desea agregar otro componente? (SI/NO): ");
                String respuesta = sn.next();
                if (respuesta.equalsIgnoreCase("NO")) {
                    break;
                }
            }

            computadora.mostrarInformacion();

            System.out.println("¿Desea cotizar una nueva computadora? (SI/NO): ");
            String respuesta = sn.next();
            if (respuesta.equalsIgnoreCase("NO")) {
                break;
            }
        }
    }
}

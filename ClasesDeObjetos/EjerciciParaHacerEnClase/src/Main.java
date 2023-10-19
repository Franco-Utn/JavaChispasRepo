import VIdeoJuego.Videojuego;
import Auto.Auto;
public class Main {

    public static void main(String[] args) {

        // Crear un objeto Videojuego
        Videojuego juego1 = new Videojuego("Super Mario Bros", "Plataformas", "Nintendo");

        // Crear otro objeto Videojuego
        Videojuego juego2 = new Videojuego("The Legend of Zelda", "Aventura", "Nintendo");

        // Crear un objeto Auto
        Auto auto1 = new Auto("Toyota Corolla", "Blanco", 1600);

        // Crear otro objeto Auto
        Auto auto2 = new Auto("Ford Mustang", "Rojo", 5000);

        // Imprimir las propiedades de los objetos
        System.out.println("Juego 1: " + juego1.getTitulo());
        System.out.println("Juego 2: " + juego2.getTitulo());

        System.out.println("Auto 1: " + auto1.getModelo());
        System.out.println("Auto 2: " + auto2.getModelo());
    }

}
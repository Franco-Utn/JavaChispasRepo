package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

class Celda {
    int fila;
    int columna;
    String valor;

    public Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
}

class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<>();

    public void agregarCelda(Celda celda) {
        matrizCuadrada.add(celda);
    }

    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.fila == fila && celda.columna == columna) {
                return celda.valor;
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matriz matriz = new Matriz();

        while (true) {
            System.out.print("Ingrese un valor (o 'FIN' para finalizar): ");
            String valor = scanner.next();

            if (valor.equalsIgnoreCase("FIN")) {
                break;
            }

            System.out.print("Ingrese la fila: ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna: ");
            int columna = scanner.nextInt();

            Celda celda = new Celda(fila, columna, valor);
            matriz.agregarCelda(celda);
        }

        System.out.println("Valores en la matriz:");
        for (Celda celda : matriz.matrizCuadrada) {
            System.out.println("Fila: " + celda.fila + ", Columna: " + celda.columna + ", Valor: " + celda.valor);
        }

        System.out.print("Ingrese la fila para consultar: ");
        int filaConsulta = scanner.nextInt();
        System.out.print("Ingrese la columna para consultar: ");
        int columnaConsulta = scanner.nextInt();

        String valorConsultado = matriz.obtenerValor(filaConsulta, columnaConsulta);
        System.out.println("Valor en la fila " + filaConsulta + " y columna " + columnaConsulta + ": " + valorConsultado);
    }
}


package Ejercicio18;
import java.util.Scanner;

public class HorasMinutosSegundos {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese las horas: ");
        int hours = lector.nextInt();
        System.out.println("Ingrese los minutos: ");
        int minutes = lector.nextInt();
        System.out.println("Ingrese los segundos: ");
        int seconds = lector.nextInt();
        if (hours >= 0 && hours <24 && minutes>=0 && minutes < 60 && seconds >= 0 && seconds < 60){
            System.out.println("El tiempo ingresado es válido "+hours+" : "+minutes+" : "+seconds + " =)");
        }else{
            System.out.println("El tiempo ingresado es inválido =(");
        }
    }
}

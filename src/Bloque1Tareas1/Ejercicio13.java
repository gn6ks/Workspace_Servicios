package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Celsius (Cº): ");
        double celsius = sc.nextDouble();

        double farenheit;
        farenheit = celsius * 1.8 + 32;

        System.out.println("Temperatura en Fahrenheit: " + farenheit);
    }
}

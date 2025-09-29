package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el numero limite: ");
        int num = sc.nextInt();
        int contador = 0;
        int total = 0;

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                total = i + total;
            }
        }

        System.out.println("El resultado es: " + total);
    }
}

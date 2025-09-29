package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int num;
        int total = 0;

        do {
            System.out.print("Ingrese el numero: ");
            num = sc.nextInt();
            total = total + num;
            contador++;
        } while (contador != 5);

        System.out.println("Total: " + total);
    }
}

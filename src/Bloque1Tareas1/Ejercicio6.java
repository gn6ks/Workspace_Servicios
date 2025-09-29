package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int num;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero: ");
            num = sc.nextInt();
            contador = contador + num;
        }

        System.out.println("Total: " + contador);
    }
}

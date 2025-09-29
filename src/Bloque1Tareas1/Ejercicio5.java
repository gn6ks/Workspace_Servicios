package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //variables fuera de dow
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        do {
            System.out.print("Ingrese el numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextInt();
        } while (num1 != num2);

        System.out.println("son iguales yey");
    }
}

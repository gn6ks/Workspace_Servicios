package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 >  num2) {
            System.out.println("numero mayor " + num1);
            System.out.println("numero menor " + num2);
        } else if (num2 > num1) {
            System.out.println("numero mayor " + num2);
            System.out.println("numero menor " + num1);
        } else {
            System.out.println("numeros iguales");
        }
    }
}
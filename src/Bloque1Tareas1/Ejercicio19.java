package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime el caracter para pasarlo a ascii: ");
        String caracter = sc.nextLine();

        for (int i = 0; i < caracter.length(); i++) {
            char c = caracter.charAt(i);
            System.out.println("letra: " + c  + " ascii: " + (int) c);
        }
    }
}

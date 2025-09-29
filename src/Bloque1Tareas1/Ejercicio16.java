package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        //variables locales
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.println("Fecha de nacimiento: ");
        String nacimiento = sc.nextLine();

        for (int i = 0; i < nacimiento.length(); i++) {
            char c = nacimiento.charAt(i);
            suma += Character.getNumericValue(c);
        }

        System.out.println("Tu numero de la suerte es " + suma);
    }
}

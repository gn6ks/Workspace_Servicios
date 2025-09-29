package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Requisitos minimos, 5 caracteres, 1 numero, 1 mayuscula");
        boolean contraseñaValida = false;

        while (!contraseñaValida) {
            System.out.println("Ingrese contraseña (7 caracteres): ");
            String contraseña = sc.nextLine();

            if (contraseña.length() < 7) {
                System.out.println("se requieren minimo 7 caracteres");
                continue;
            }

            if (!contraseña.matches(".*[A-Z].*")) {
                System.out.println("se requieren 1 mayuscula minima");
                continue;
            }

            if (!contraseña.matches(".*\\d.*")) {
                System.out.println("se requieren 1 numero minimo");
                continue;
            }

            contraseñaValida = true;
            System.out.println("la contraseña es: " + contraseña);
        }

        sc.close();
    }
}

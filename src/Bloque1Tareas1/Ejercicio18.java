package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Requisitos minimos, 5 caracteres, 1 numero, 1 mayuscula");
        boolean contraseñaValida = false;

        while (!contraseñaValida) {
            System.out.println("Ingrese contraseña (7 caracteres): ");
            String contraseña = sc.nextLine();
            System.out.println("Ingrese la contraseña otra vez (7 caracteres): ");
            String contraseñaRepetida = sc.nextLine();

            if (!contraseña.equals(contraseñaRepetida)) {
                System.out.println("Las contraseñas no coinciden.");
                continue;
            }

            if (!comprobarLength(contraseña) || !comprobarLength(contraseñaRepetida)) {
                continue;
            }

            if (!comprobarMayusculas(contraseña) || !comprobarMayusculas(contraseñaRepetida)) {
                continue;
            }

            if (!comprobarDigito(contraseña) || !comprobarDigito(contraseñaRepetida)) {
                continue;
            }

            contraseñaValida = true;
            System.out.println("¡Contraseña válida! La contraseña es: " + contraseña);
        }
        sc.close();
    }

    public static boolean comprobarLength(String contraseña) {
        if (contraseña.length() < 7) {
            System.out.println("se requieren minimo 7 caracteres");
            return false;
        } else {
            return true;
        }
    }

    public static boolean comprobarMayusculas(String contraseña) {
        if (!contraseña.matches(".*[A-Z].*")) {
            System.out.println("se requieren 1 mayuscula minima");
            return false;
        } else {
            return true;
        }
    }

    public static boolean comprobarDigito(String contraseña) {
        if (!contraseña.matches(".*\\d.*")) {
            System.out.println("se requieren 1 numero minimo");
            return false;
        } else {
            return true;
        }
    }
}

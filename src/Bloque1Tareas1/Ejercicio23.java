package Bloque1Tareas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> personas = new ArrayList<>();
        int clave;

        do {
            System.out.println("Introduce clave: ");
            clave = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < clave; i++) {
                System.out.println("Nombre persona " + (i + 1) + ":");
                String nombre = sc.nextLine();
                personas.add(nombre);
            }
        } while (clave != 0);

        retornarNombres(personas);
    }

    public static void retornarNombres(List<String> personas) {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i + 1) + ": " + personas.get(i));
        }
    }
}

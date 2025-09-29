package Bloque1Tareas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> personas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre persona " + (i + 1) + ":");
            String nombre = sc.nextLine();
            personas.add(nombre);
        }

        System.out.println(personas);
    }
}

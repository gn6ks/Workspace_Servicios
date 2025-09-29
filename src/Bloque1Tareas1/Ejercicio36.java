package Bloque1Tareas1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el numero: ");
            lista.add(sc.nextInt());
        }

        Collections.reverse(lista);
        System.out.println(lista);
    }
}

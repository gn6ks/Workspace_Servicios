package Bloque1Tareas1;

import java.util.ArrayList;

public class Ejercicio32 {
    public static void main(String[] args) {

        String[] compañeros = {"aymane", "samuel", "dani", "oscar", "david", "jorge"};

        for (int i = 0; i < compañeros.length; i++) {
            System.out.println(compañeros[i]);
        }

        ArrayList<String> compañeros2 = new ArrayList<String>();
        compañeros2.add("aymane");
        compañeros2.add("samuel");
        compañeros2.add("dani");
        compañeros2.add("oscar");
        compañeros2.add("david");
        compañeros2.add("jorge");

        System.out.println(compañeros2);
    }
}

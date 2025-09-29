package Bloque1Tareas1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array list para añadir vehiculos con .Addcomparar strings java
        ArrayList<Vehicle> listaVehiculo = new ArrayList<>();
        String respuesta;


        System.out.println("¿Quiere usted hacer un vehiculo para la lista? (s/n): ");
        respuesta = sc.next().toUpperCase();

        while (!respuesta.equals("N")) {
            System.out.println("tipo vehicle: ");
            String tipo = sc.next();
            System.out.println("marca: ");
            String marca = sc.next();
            System.out.println("modelo: ");
            String modelo = sc.next();
            Vehicle v = new Vehicle(tipo, marca, modelo);
            listaVehiculo.add(v);

            System.out.println("¿Quiere usted hacer un vehiculo para la lista? (s/n): ");
            respuesta = sc.next().toUpperCase();
        }

        System.out.println(listaVehiculo);
    }

    public static class Vehicle {
        private String tipo;
        private String marca;
        private String modelo;

        public Vehicle(String t, String m, String mod) {
            this.tipo = t;
            this.marca = m;
            this.modelo = mod;
        }

        public String toString() {
            return tipo + " - " + marca + " - " + modelo;
        }
    }
}

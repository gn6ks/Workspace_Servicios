package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de DNI (sin letra: )");
        int numerosDni = sc.nextInt();
        obtenerLetraPorResto(numerosDni);
    }

    public static void obtenerLetraPorResto(int numerosDni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numerosDni % 23;
        if (resto >= 0 && resto < letras.length) {
            System.out.println("La letra es: " + letras[resto]);
        } else {
            System.out.println("mal puesto twin");
        }
    }
}

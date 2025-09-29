package Bloque1Tareas1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //array 1 al 10
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Introduce el numero: ");
        int numero = sc.nextInt();

        int numeroRandom = rand.nextInt(numeros.length);

        if (numero == numeroRandom) {
            System.out.print("premio " + numero + " y " + numeroRandom + " son iguales.");
        } else {
            System.out.print("suerte la proxima " + numero + " y " + numeroRandom + " NO son iguales.");
        }
    }
}

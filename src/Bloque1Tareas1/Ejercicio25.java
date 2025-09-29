package Bloque1Tareas1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //array 1 al 10
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Introduce el numero: ");
        int numero1 = sc.nextInt();

        int numeroRandom = rand.nextInt(numeros.length);
        int numeroRandom2 = rand.nextInt(numeros.length);

        if (numero1 == numeroRandom && numeroRandom == numeroRandom2) {
            System.out.print("premio " + numero1 + ", " + numeroRandom + " y " + numeroRandom2 + " son iguales.");
        } else {
            System.out.print("Suerte la proxima " + numero1 + ", " + numeroRandom + " y " + numeroRandom2 + " NO son iguales.");
        }
    }
}

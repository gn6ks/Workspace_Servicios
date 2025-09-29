package Bloque1Tareas1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variables de lista, numeros, contador de tiempo
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaPrimos = new ArrayList<>();
        long tiempoInicial = System.currentTimeMillis();

        System.out.println("Indique el primer numero del intervalo: ");
        int num1 = sc.nextInt();
        System.out.println("Indique el segundo numero del intervalo: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (esPrimo(i)) {
                listaPrimos.add(i);
            }
            lista.add(i);
        }

        System.out.println(lista);
        System.out.println(listaPrimos);
        System.out.println("ha tardado " +  (System.currentTimeMillis() - tiempoInicial) + "ms en completarse.");
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}

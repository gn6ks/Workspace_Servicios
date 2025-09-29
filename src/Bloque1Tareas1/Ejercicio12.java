package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorTotal = 0;
        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;
        int matriculas = 0;

        do {
            System.out.println("Nota del 1 al 10: ");
            int nota = sc.nextInt();
            if (nota >= 1 && nota <= 10) {
                if (nota == 10) {
                    matriculas++;
                } else if (nota == 9) {
                    sobresalientes++;
                } else if (nota <= 8 && nota >= 7) {
                    notables++;
                } else if (nota <= 6 && nota >= 5) {
                    aprobados++;
                } else {
                    suspensos++;
                }
            }
            contadorTotal++;
        } while (contadorTotal != 10);

        System.out.println("total de notas " + contadorTotal);
        System.out.println("total de matriculas " + matriculas);
        System.out.println("total de sobresalientes " + sobresalientes);
        System.out.println("total de notables " + notables);
        System.out.println("total de aprobados " + aprobados);
        System.out.println("total de suspensos " + suspensos);
    }
}

package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio26 {
    static int matriculas = 0;
    static int sobresalientes = 0;
    static int notables = 0;
    static int aprobados = 0;
    static int suspensos = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorTotal = 0;

        do {
            System.out.println("Nota del 1 al 10: ");
            int nota = sc.nextInt();

            if (nota >= 1 && nota <= 10) {
                contarMatriculas(nota);
                contarSobresalientes(nota);
                contarNotables(nota);
                contarAprobados(nota);
                contarSuspensos(nota);
                contadorTotal++;
            } else {
                System.out.println("del 1 al 10");
            }
        } while (contadorTotal != 10);

        System.out.println("Total de notas: " + contadorTotal);
        System.out.println("Total de matrículas: " + matriculas);
        System.out.println("Total de sobresalientes: " + sobresalientes);
        System.out.println("Total de notables: " + notables);
        System.out.println("Total de aprobados: " + aprobados);
        System.out.println("Total de suspensos: " + suspensos);

        sc.close();
    }

    public static void contarMatriculas(int nota) {
        if (nota == 10) {
            matriculas++;
        }
    }

    public static void contarSobresalientes(int nota) {
        if (nota == 9) {
            sobresalientes++;
        }
    }

    public static void contarNotables(int nota) {
        if (nota >= 7 && nota <= 8) {
            notables++;
        }
    }

    public static void contarAprobados(int nota) {
        if (nota >= 5 && nota <= 6) {
            aprobados++;
        }
    }

    public static void contarSuspensos(int nota) {
        if (nota >= 1 && nota <= 4) {
            suspensos++;
        }
    }
}
package Bloque1Tareas1;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique su nombre: ");
        String nom = sc.next();
        System.out.println("Indique su experiencia en años: ");
        int anyos = sc.nextInt();

        if (anyos <= 0) {
            System.out.println("No se pueden numeros negativos");
        } else if (anyos > 0 && anyos < 1) {
            System.out.println("El/la emplead@ " + nom + " es Desenvolupador Junior L1 " + " Salario base: 15000-18000");
        } else if (anyos >= 1 && anyos <= 2) {
            System.out.println("El/la emplead@ " + nom + " es Desenvolupador Junior L2 " + " Salario base: 18000-22000");
        } else if (anyos >= 3 && anyos <= 5) {
            System.out.println("El/la emplead@ " + nom + " es Desenvolupador Senior L1 " + " Salario base: 22000-28000");
        } else if (anyos > 5 && anyos <= 8) {
            System.out.println("El/la emplead@ " + nom + " es Desenvolupador Senior L2 " + " Salario base: 28000-36000");
        } else if (anyos > 8 ) {
            System.out.println("El/la emplead@ " + nom + " es Analista / Arquitecte " + " Salario base: Salari a convenir en base a rol");
        }
    }
}

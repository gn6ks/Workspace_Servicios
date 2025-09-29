package Bloque1Tareas1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //scanner y formato 3 decimales con df
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("radio de la circunferencia: ");
        double radio = sc.nextDouble();
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + df.format(AreaCircunferencia(radio)));
        System.out.println("Perimetro: " + df.format(PerimetroCircunferencia(radio)));
    }

    public static double AreaCircunferencia(double radio) {
        return Math.PI*(radio * radio);
    }

    public static double PerimetroCircunferencia(double radio) {
        return 2*Math.PI*radio;
    }
}

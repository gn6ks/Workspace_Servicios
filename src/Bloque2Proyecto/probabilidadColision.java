package Bloque2Proyecto;

import java.io.*;
import java.text.DecimalFormat;

public class probabilidadColision {
    public static double calcularProbabilidad(double posicioNEO, double velocitatNEO) {
        double posicioTerra = 1;
        double velocitatTerra = 100;
        for (int i = 0; i < (50 * 365 * 24 * 60 * 60); i++) {
            posicioNEO = posicioNEO + velocitatNEO * i;
            posicioTerra = posicioTerra + velocitatTerra * i;
        }
        double resultat = 100 * Math.random() *
                Math.pow(((posicioNEO - posicioTerra) / (posicioNEO + posicioTerra)), 2);
        return resultat;
    }

    public static void main(String[] args) {
        long puntoInicio = System.currentTimeMillis();
        String linea = args[0];
        //separar string en array de string donde cada posicion tiene los valores que necesito
        String[] datos = linea.split(",");
        String nombreNeo = datos[0];
        double posicionNeo = Double.parseDouble(datos[1]); //paso a double pq se usan decimales para manejar la calculadora
        double velocidadNeo = Double.parseDouble(datos[2]); //paso a double pq se usan decimales para manejar la calculadora

        double resultado = calcularProbabilidad(posicionNeo, velocidadNeo); // calcular probabilidad
        long puntoFin = System.currentTimeMillis();
        long total = puntoFin - puntoInicio;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreNeo))) {
            bw.write(String.valueOf(resultado)); //escribir el resultado en el fichero
            bw.newLine();
            bw.write(String.valueOf(total));
            if (resultado >= 10) {
                System.out.println("El resultado es mayor a 10% de probabiliad");
                DecimalFormat df = new DecimalFormat("#.00");
                System.out.println(nombreNeo + " tiene " + df.format(resultado) + "% de probabilidad de colision");
            } else {
                System.out.println("El resultado es menor a 10% de probabilidad");
                System.out.println(nombreNeo + " se encuentra lejos de colisionar con la tierra :D");
            }
        } catch (Exception e) {
            System.err.println("Error al escribir el fichero para " + nombreNeo);
            e.printStackTrace();
        }

    }
}

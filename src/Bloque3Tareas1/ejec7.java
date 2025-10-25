package Bloque3Tareas1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class ejec7 implements Runnable {
    private String lineaArgumentos;

    public ejec7(String linea) {
        this.lineaArgumentos = linea;
    }

    public double calcularProbabilidad(double posicioNEO, double velocitatNEO) {
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
        String archivoLeer = args[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoLeer));
            String linea;
            while ((linea = br.readLine()) != null) {
                ejec7 e = new ejec7(linea);
                Thread t = new Thread(e);
                t.start();
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String[] datos = lineaArgumentos.split(",");
        String nombreNeo = datos[0];
        double posicionNeo = Double.parseDouble(datos[1]);
        double velocidadNeo = Double.parseDouble(datos[2]);

        double resultado = calcularProbabilidad(posicionNeo, velocidadNeo);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreNeo))) {
            bw.write(String.valueOf(resultado));
            bw.newLine();
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

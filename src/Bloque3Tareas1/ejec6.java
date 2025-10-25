package Bloque3Tareas1;

import java.io.*;
import java.util.Scanner;

public class ejec6 implements Runnable {
    private double velocidad;
    private String nombre;
    static File archivo = new File("meta.txt");

    public ejec6(double velocidadCaragol, String nombreCaragol) {
        this.velocidad = velocidadCaragol;
        this.nombre = nombreCaragol;
    }

    public static Boolean comprobarGanador() {
        return archivo.length() > 0;
    }

    public static void leerArchivo() {
        try (Scanner sc = new Scanner(archivo)) {
            System.out.println(sc.nextLine());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ejec6(5, "pitodani"));
        Thread t2 = new Thread(new ejec6(12, "pitoaymane"));
        Thread t3 = new Thread(new ejec6(0.2, "pitooscar"));
        Thread t4 = new Thread(new ejec6(1.25, "pitopablo"));
        Thread t5 = new Thread(new ejec6(0.75, "pitopaco"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    @Override
    synchronized public void run() {
        double porcentajeCompletado = 0;
        while (porcentajeCompletado < 100 && !comprobarGanador()) {
            porcentajeCompletado += velocidad;
            System.out.println("Porcentaje completado: " + String.format("%.2f", porcentajeCompletado) + "% del caracol: " + nombre);
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                return;
            }
        }
        if (porcentajeCompletado >= 100 && !comprobarGanador()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                bw.write("ganador caracol: " + nombre);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            leerArchivo();
        }
    }
}

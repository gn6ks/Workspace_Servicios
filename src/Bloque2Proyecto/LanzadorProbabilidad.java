package Bloque2Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LanzadorProbabilidad {
    public static void ejecutar(String linea) {
        try {
            String javaHome = System.getProperty("java.home");
            String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
            String classpath = System.getProperty("java.class.path");
            String clase = "Bloque2Proyecto.probabilidadColision";
            List<String> command = new ArrayList<>();
            command.add(javaBin);
            command.add("-cp");
            command.add(classpath);
            command.add(clase);
            command.add(linea);
            ProcessBuilder builder = new ProcessBuilder(command);
            Process process = builder.inheritIO().start(); //heredo la terminal de probabilidadColision para mostrar mensajes
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //pasar el archivo a leer por parametro, hace que el programa dependa del usuario sin cambiar el codigo
        String archivoLeer = args[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoLeer));
            String linea;
            while ((linea = br.readLine()) != null) {
                ejecutar(linea); // Lanzar un proceso por linea
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println("Todos los procesos han terminado.");
//        System.out.println("Tiempo de ejecución: " + (puntoFinalTiempo - puntoPartidaTiempo) + " milisegundos");
//        System.out.println("Tiempo medio de ejecución por proceso: " + ((puntoFinalTiempo - puntoPartidaTiempo) / 24) + " milisegundos");
    }
}
package Bloque2Tareas1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Lanzador2 {
    public static void ejecutar(int num1, int num2, String fichero) {
        try {
            String javaHome = System.getProperty("java.home");
            String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
            String classpath = System.getProperty("java.class.path");
            String clase = "Bloque2Tareas1.Sumador2";
            List<String> command = new ArrayList<>();
            command.add(javaBin);
            command.add("-cp");
            command.add(classpath);
            command.add(clase);
            command.add(String.valueOf(num1));
            command.add(String.valueOf(num2));
            command.add(fichero);
            ProcessBuilder builder = new ProcessBuilder(command);
            //builder.start();
            builder.inheritIO().start();
            //builder.redirectOutput(new File(fichero));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ejecutar(1, 50, "resultado1.txt");
        ejecutar(50, 100, "resultado2.txt");
    }
}

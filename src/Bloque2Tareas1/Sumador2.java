package Bloque2Tareas1;

import java.io.*;

public class Sumador2 {
    public static int suma(int num1, int num2) {
        int res = 0;
        for (int i = num1; i <= num2; i++) {
            res += i;
        }
        return res;
    }

    public static void main(String [] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        Integer resultado = suma(num1, num2);
        String fichero = args[2];
        try {
            File f = new File(fichero);
            FileWriter fw = new FileWriter(fichero);
            f.createNewFile();
            fw.write(String.valueOf(resultado));
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Resultado: " + resultado);
    }
}
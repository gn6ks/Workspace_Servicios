package Bloque2Tareas1;

public class Sumador1 {
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
        System.out.println(suma(num1,num2));
    }
}
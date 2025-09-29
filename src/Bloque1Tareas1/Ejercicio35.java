package Bloque1Tareas1;

public class Ejercicio35 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println(max);
    }
}

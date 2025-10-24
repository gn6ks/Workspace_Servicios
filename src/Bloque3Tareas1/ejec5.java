package Bloque3Tareas1;

public class ejec5 implements Runnable {
    static int alasTotales = 100;
    static int alasConsumidas = 0;

    public static void main(String[] args) {
        ejec5 e = new ejec5();
        for (int i = 0; i <= 30; i++) {
            Thread t = new Thread(e);
            t.setName("Thread " + i);
            t.start();
        } try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("total de alitas consumidas: " + alasConsumidas);
    }

    synchronized public void consumirAla(int alitas, String nombre) {
        if (alitas <= alasTotales) {
            alasTotales -= alitas;
            alasConsumidas += alitas;
            System.out.println(alitas + " alitas consumidas por " + nombre);
        } else {
            System.out.println("no quedan alitas");
        }
    }

    @Override
    public void run() {
        String nombreHilo = Thread.currentThread().getName();
        int alitas = (int) (Math.random() * 10 + 1);
        consumirAla(alitas, nombreHilo);
    }
}

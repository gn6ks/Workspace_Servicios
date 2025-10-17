package Bloque3Tareas1;

public class ejec2 implements Runnable {
    private String nombreHilo;
    private int inicioContador;
    private int limiteContador;

    public ejec2(String nombre, int inicio, int limite) {
        this.nombreHilo = nombre;
        this.inicioContador = inicio;
        this.limiteContador = limite;
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new ejec2("pitoaymane", 0, 100));
        t1.start();
        Thread t2 = new Thread(new ejec2("pitopablo", 100, 200));
        t2.start();
        Thread t3 = new Thread(new ejec2("pitojorge", 200, 300));
        t3.start();
        Thread t4 = new Thread(new ejec2("pitodani", 300, 400));
        t4.start();
        Thread t5 = new Thread(new ejec2("pitosamuel", 400, 500));
        t5.start();
    }

    @Override
    synchronized public void run() {
        for (int i = inicioContador; i <= limiteContador; i++) {
            System.out.println(nombreHilo + ": " + i);
        }
    }
}

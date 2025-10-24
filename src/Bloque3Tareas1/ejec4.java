package Bloque3Tareas1;

public class ejec4 implements Runnable {
    private double velocidad;
    private String nombre;

    public ejec4(double velocidadCaragol, String nombreCaragol) {
        this.velocidad = velocidadCaragol;
        this.nombre = nombreCaragol;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ejec4(1.25, "pitodani"));
        Thread t2 = new Thread(new ejec4(1.25, "pitoaymane"));
        Thread t3 = new Thread(new ejec4(1.25, "pitooscar"));
        Thread t4 = new Thread(new ejec4(1.25, "pitopablo"));
        Thread t5 = new Thread(new ejec4(1.25, "pitopaco"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    @Override
    synchronized public void run() {
        double porcentajeCompletado = 0;
        for (int i = 0; porcentajeCompletado < 100; i++) {
            porcentajeCompletado += velocidad;
            System.out.println("Porcentaje completado: " + String.format("%.2f", porcentajeCompletado) + "% del caracol: " + nombre);
        }
    }
}

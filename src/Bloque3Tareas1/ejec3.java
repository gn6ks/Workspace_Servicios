package Bloque3Tareas1;

public class ejec3 implements Runnable {
    private double velocidad;
    private String nombre;

    public ejec3(double velocidadCaragol, String nombreCaragol) {
        this.velocidad = velocidadCaragol;
        this.nombre = nombreCaragol;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ejec3(5, "pitodani"));
        t1.start();
        Thread t2 = new Thread(new ejec3(12, "pitoaymane"));
        t2.start();
        Thread t3 = new Thread(new ejec3(0.2, "pitooscar"));
        t3.start();
        Thread t4 = new Thread(new ejec3(1.25, "pitopablo"));
        t4.start();
        Thread t5 = new Thread(new ejec3(0.75, "pitopaco"));
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

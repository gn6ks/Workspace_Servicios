package Bloque3Tareas1;

public class ejec1 implements Runnable{
    private int tipo;

    public ejec1(int tipo) {
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ejec1(1));
        t1.start();
        Thread t2 = new Thread(new ejec1(2));
        t2.start();
    }

    @Override
    public void run(){
        if (tipo == 1) {
            for (int i = 0; i < 255; i++) {
                if ((char) i % 2 == 1) {
                    System.out.println("codigo ASCII" + (i) + ":" + (char) i);
                }
            }
        }
        if (tipo == 2) {
            for (int i = 0; i < 255; i++) {
                if ((char) i % 2 == 0) {
                    System.out.println("codigo ASCII" + (i) + ":" + (char) i);
                }
            }
        }
    }
}

package Bloque1Tareas1;

public class Ejercicio31 {
    public static void main(String[] args) {
        App aplicacion = new App();

        System.out.println(aplicacion.sayHello());
    }

    public static class App {
        public static String sayHello() {
            return "Hola Món";
        }
    }
}

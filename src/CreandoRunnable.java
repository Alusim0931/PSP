public class CreandoRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Tarea1Runnable());
        Thread t2 = new Thread(new Tarea2Runnable());

        t1.start();
        t2.start();
    }
}

class Tarea1Runnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola");
        }
    }
}

class Tarea2Runnable implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Adios");
        }
    }
}

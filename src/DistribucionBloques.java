public class DistribucionBloques {
    public static void main(String[] args) {
        int n = 17;
        int numThreads = 4;

        System.out.println("Número de hebras: " + n);
        System.out.println("Número de bloques " + numThreads);
        System.out.println("--------------------------------------");

        int tam = (n + numThreads - 1) / numThreads;

        for (int miId = 0; miId < numThreads; miId++) {
            final int ini = miId * tam;
            final int fin = Math.min(n, (miId + 1) * tam);

            for (int i = ini; i < fin; i++) {
                System.out.println( "Hebra " + miId + " resultado " + i);
            }
        }
    }
}

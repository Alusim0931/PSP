public class DistribuciónCiclica {
    public static void main(String[] args) {

        int nProcesos = 24;
        int numhHebras = 4;
        int miID = 1;


        int contador = 0;
        for(int i = miID;i < nProcesos; i+=numhHebras){
            System.out.println(i + "-");

            contador++;
            if (contador == numhHebras){
                System.out.println(i);
                contador = 0;
            }
        }
    }
}

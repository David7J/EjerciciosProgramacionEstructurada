public class Proyecto_20 {

    public static void main(String[] args) {
        int inicio = (int) System.currentTimeMillis();

        int contador = 0;

        while (contador < 300000000) {
            contador++;

            if (contador % 1000000 == 0) {
                System.out.println("Contador: " + contador);
            }
        }

        int fin = (int) System.currentTimeMillis();
        int tiempoTranscurrido = fin - inicio;

        System.out.println("Tiempo total: " + tiempoTranscurrido + " milisegundos");
    }
}
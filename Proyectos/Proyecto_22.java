import java.util.Scanner;
import java.util.Random;

public class Proyecto_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int numeroAdivinar = random.nextInt(50) + 1;
            int intentos = 0;
            boolean adivinado = false;

            System.out.println("Adivina un número entre 1 y 50.");
            
            while (intentos < 3) {
                System.out.print("Intento #" + (intentos + 1) + ": ");
                int intento = scanner.nextInt();
                
                if (intento < numeroAdivinar) {
                    System.out.println("Demasiado bajo. Intente de nuevo.");
                } else if (intento > numeroAdivinar) {
                    System.out.println("Demasiado alto. Intente de nuevo.");
                } else {
                    System.out.println("¡Felicidades! ¡Adivinó el número!");
                    adivinado = true;
                    break;
                }
                
                intentos++;
            }

            if (!adivinado) {
                System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroAdivinar);
            }

            System.out.print("¿Desea jugar de nuevo? (s/n): ");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }
}

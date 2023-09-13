import java.util.Scanner;
import java.util.Random;

public class Proyecto_26 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Hola! Soy Eliza. ¿En qué puedo ayudarte hoy? (Escribe 'Adiós' para salir)");

        while (true) {
            String input = lector.nextLine();

            if (input.equalsIgnoreCase("Adiós")) {
                System.out.println("¡Adiós! Espero que hayas tenido una buena conversación.");
                break;
            }

            String response = generarRespuesta(input, random);
            System.out.println(response);
        }
    }

    public static String generarRespuesta(String input, Random random) {
        if (input.contains("mi")) {
            String[] palabras = input.split("\\s+");
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].equalsIgnoreCase("mi") && i + 1 < palabras.length) {
                    return "Cuénteme más sobre su " + palabras[i + 1];
                }
            }
        }

        if (input.contains("amor") || input.contains("odio")) {
            return "Parece que tiene fuertes sentimientos al respecto.";
        }

        String[] respuestasAleatorias = {"Continúe", "Dígame más", "Continúe"};
        return respuestasAleatorias[random.nextInt(respuestasAleatorias.length)];
    }
}
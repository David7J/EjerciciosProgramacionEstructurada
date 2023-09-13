import java.util.Scanner;

public class Proyecto_24 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese tres palabras para generar un acrónimo:");
        String input = lector.nextLine();

        String acronimo = generarAcronimo(input);

        if (acronimo != null) {
            System.out.println("El acrónimo es: " + acronimo);
        } else {
            System.out.println("Debe ingresar exactamente tres palabras.");
        }
    }

    public static String generarAcronimo(String input) {
        String[] palabras = input.split(" ");

        if (palabras.length == 3) {
            StringBuilder acronimo = new StringBuilder();
            for (String palabra : palabras) {
                acronimo.append(Character.toUpperCase(palabra.charAt(0)));
            }
            return acronimo.toString();
        } else {
            return null;
        }

    }
}
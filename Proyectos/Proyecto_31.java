import java.util.Scanner;

public class Proyecto_31 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo grande: ");
        long numero = lector.nextLong();

        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
            return;
        }

        System.out.println("Los factores del número " + numero + " son:");

        for (long i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }

        lector.close();
    }
}






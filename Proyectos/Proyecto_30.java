import java.util.Scanner;

public class Proyecto_30 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double hamburguesa = 4.99;
        double papas = 2.49;
        double refresco = 1.99;
        double total = 0.0;

        System.out.println("Bienvenido a McDonald's");
        System.out.println("Menú:");
        System.out.println("1. Hamburguesa con queso - $" + hamburguesa);
        System.out.println("2. Papas fritas - $" + papas);
        System.out.println("3. Refresco - $" + refresco);

        while (true) {
            System.out.print("Ingrese el número del platillo que desea ordenar (o 0 para terminar): ");
            int opcion = lector.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    total += hamburguesa;
                    break;
                case 2:
                    total += papas;
                    break;
                case 3:
                    total += refresco;
                    break;
                default:
                    System.out.println("¡Opción inválida!");
            }
        }

        System.out.println("\nDetalle de la factura:");
        System.out.println("Total a pagar: $" + total);

        lector.close();
    }
}
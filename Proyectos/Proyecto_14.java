import java.util.Scanner;

public class Proyecto_14 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int totalKilometros = 0;
        int totalLitros = 0;

        while (true) {
            System.out.print("Ingrese los kilómetros conducidos (o -1 para salir): ");
            int kilometros = lector.nextInt();

            if (kilometros == -1) {
                break;
            }

            System.out.print("Ingrese los litros de combustible usados: ");
            int litros = lector.nextInt();

            double rendimiento = (double) kilometros / litros;
            System.out.println("Rendimiento del viaje: " + rendimiento + " KPL");

            totalKilometros += kilometros;
            totalLitros += litros;

            double rendimientoTotal = (double) totalKilometros / totalLitros;
            System.out.println("Rendimiento total hasta el momento: " + rendimientoTotal + " KPL");
        }

       lector.close();
    }
}

import java.util.Scanner;

public class Proyecto_19 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double totalRecibos = calcularCargosEstacionamiento(lector);

        System.out.println("Total de recibos del día anterior: C$" + totalRecibos);
    }

    public static double calcularCargosEstacionamiento(Scanner scanner) {
        double cargoMinimo = 2.00;
        double cargoAdicionalPorHora = 0.50;
        double cargoMaximo = 10.00;
        double totalRecibos = 0.0;

        while (true) {
            System.out.print("Ingrese las horas de estacionamiento (-1 para salir): ");
            int horasEstacionado = scanner.nextInt();

            if (horasEstacionado == -1) {
                break;
            }

            if (horasEstacionado <= 3) {
                totalRecibos += cargoMinimo;
            } else if (horasEstacionado <= 24) {
                totalRecibos += Math.min(cargoMaximo, cargoMinimo + (horasEstacionado - 3) * cargoAdicionalPorHora);
            } else {
                totalRecibos += cargoMaximo;
            }
        }

        return totalRecibos;
    }
}
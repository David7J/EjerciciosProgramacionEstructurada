import java.util.Scanner;

public class Proyecto_17 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double salarioBase = 200;
        double porcentajeComision = 0.09;
        double totalVentas = 0;

        System.out.println("Lista de Artículos:");
        System.out.println("1. 239.99");
        System.out.println("2. 129.75");
        System.out.println("3. 99.95");
        System.out.println("4. 350.89");

        while (true) {
            System.out.print("Ingrese el número del artículo vendido (o -1 para terminar): ");
            int numArticulo = lector.nextInt();

            if (numArticulo == -1) {
                break;
            }

            switch (numArticulo) {
                case 1:
                    totalVentas += 239.99;
                    break;
                case 2:
                    totalVentas += 129.75;
                    break;
                case 3:
                    totalVentas += 99.95;
                    break;
                case 4:
                    totalVentas += 350.89;
                    break;
                default:
                    System.out.println("Número de artículo inválido. Por favor, ingrese un número válido.");
            }
        }

        double comision = totalVentas * porcentajeComision;
        double ingresos = salarioBase + comision;
        
        System.out.println("Los ingresos del vendedor son: C$" + ingresos);

        lector.close();
    }
}
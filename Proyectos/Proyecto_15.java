import java.util.Scanner;

public class Proyecto_15 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Empleado " + i);

            System.out.print("Ingrese el número de horas trabajadas: ");
            int horasTrabajadas = lector.nextInt();

            System.out.print("Ingrese la tarifa por hora: ");
            double tarifaPorHora = lector.nextDouble();

            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
            System.out.println("El sueldo bruto del empleado " + i + " es: " + sueldoBruto + " córdobas\n");

            lector.close();
        }
    }

    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHora) {
        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);

        double sueldoBruto = (horasNormales * tarifaPorHora) + (horasExtras * 1.5 * tarifaPorHora);

        return sueldoBruto;
    }
}
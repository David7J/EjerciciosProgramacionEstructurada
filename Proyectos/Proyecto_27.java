import java.util.Scanner;

public class Proyecto_27 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el salario base del empleado en córdobas:");
        double salarioBase = lector.nextDouble();

        System.out.println("Ingrese los años de antigüedad del empleado:");
        int anosAntiguedad = lector.nextInt();

        double salarioBruto = calcularSalarioBruto(salarioBase, anosAntiguedad);
        double impuestoRenta = calcularImpuestoRenta(salarioBruto);
        double salarioNeto = salarioBruto - impuestoRenta;

        System.out.println("Salario bruto: " + salarioBruto + " córdobas");
        System.out.println("Impuesto sobre la renta: " + impuestoRenta + " córdobas");
        System.out.println("Salario neto: " + salarioNeto + " córdobas");
    }

    public static double calcularSalarioBruto(double salarioBase, int anosAntiguedad) {
        double porcentajeAntiguedad;
        if (anosAntiguedad == 1) {
            porcentajeAntiguedad = 0.03;
        } else if (anosAntiguedad >= 2 && anosAntiguedad <= 20) {
            porcentajeAntiguedad = (anosAntiguedad * 2 + 1) / 100.0;
        } else if (anosAntiguedad >= 21 && anosAntiguedad <= 30) {
            porcentajeAntiguedad = 0.5;
        } else {
            porcentajeAntiguedad = 0.6;
        }

        double porcentajeAntiguedad15 = porcentajeAntiguedad + 0.15; 
        return salarioBase + (salarioBase * porcentajeAntiguedad15);
    }

    public static double calcularImpuestoRenta(double salarioBruto) {
        if (salarioBruto <= 100000) {
            return 0;
        } else if (salarioBruto <= 200000) {
            return (salarioBruto - 100000) * 0.15;
        } else if (salarioBruto <= 350000) {
            return 15000 + (salarioBruto - 200000) * 0.2;
        } else if (salarioBruto <= 500000) {
            return 45000 + (salarioBruto - 350000) * 0.25;
        } else {
            return 100000 + (salarioBruto - 500000) * 0.3;
        }
    }
}
import java.util.Scanner;

public class Proyecto_16 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = lector.nextInt();

        System.out.print("Ingrese el saldo al inicio del mes: ");
        int saldoInicial = lector.nextInt();

        System.out.print("Ingrese el total de todos los artículos cargados: ");
        int cargos = lector.nextInt();

        System.out.print("Ingrese el total de todos los créditos aplicados: ");
        int creditos = lector.nextInt();

        System.out.print("Ingrese el límite de crédito permitido: ");
        int limiteCredito = lector.nextInt();

        int nuevoSaldo = saldoInicial + cargos - creditos;

        System.out.println("El nuevo saldo es: " + nuevoSaldo);

        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito.");
        }

        lector.close();
    }
}
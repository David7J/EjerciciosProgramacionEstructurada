import java.util.Scanner;

public class Proyecto_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año entre 1994 y 1999: ");
        int year = scanner.nextInt();

        if (year < 1994 || year > 1999) {
            System.out.println("Año inválido. Debe estar entre 1994 y 1999.");
            return;
        }

        System.out.println("Calendario para el año " + year + ":\n");

        for (int mes = 1; mes <= 12; mes++) {
            System.out.println(obtenerNombreMes(mes));

            int diasEnMes = obtenerDiasEnMes(mes);
            System.out.println("Dom Lun Mar Mie Jue Vie Sab");

            int diaDeLaSemana = obtenerDiaDeLaSemana(year, mes, 1);

            for (int i = 0; i < diaDeLaSemana; i++) {
                System.out.print("    ");
            }

            for (int dia = 1; dia <= diasEnMes; dia++) {
                System.out.printf("%3d ", dia);

                if (++diaDeLaSemana > 6) {
                    diaDeLaSemana = 0;
                    System.out.println();
                }
            }

            System.out.println("\n");
        }
    }

    public static String obtenerNombreMes(int mes) {
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";
        }
    }

    public static int obtenerDiasEnMes(int mes) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28; 
            default:
                return 31;
        }
    }

    public static int obtenerDiaDeLaSemana(int year, int mes, int dia) {
        int a = (14 - mes) / 12;
        int y = year - a;
        int m = mes + 12 * a - 2;
        return (dia + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
    }
}
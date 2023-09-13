import java.util.Scanner;

public class Proyecto_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la conversión:");
        System.out.println("1. Binario a Decimal");
        System.out.println("2. Decimal a Binario");
        System.out.println("3. Octal a Decimal");
        System.out.println("4. Decimal a Octal");
        System.out.println("5. Hexadecimal a Decimal");
        System.out.println("6. Decimal a Hexadecimal");
        
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                binarioADecimal();
                break;
            case 2:
                decimalABinario();
                break;
            case 3:
                octalADecimal();
                break;
            case 4:
                decimalAOctal();
                break;
            case 5:
                hexadecimalADecimal();
                break;
            case 6:
                decimalAHexadecimal();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    
    public static void binarioADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número binario: ");
        String numeroBinario = scanner.nextLine();
        int numeroDecimal = Integer.parseInt(numeroBinario, 2);
        System.out.println("El número decimal es: " + numeroDecimal);
    }

    public static void decimalABinario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número decimal: ");
        int numeroDecimal = scanner.nextInt();
        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        System.out.println("El número binario es: " + numeroBinario);
    }

    public static void octalADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número octal: ");
        String numeroOctal = scanner.nextLine();
        int numeroDecimal = Integer.parseInt(numeroOctal, 8);
        System.out.println("El número decimal es: " + numeroDecimal);
    }

    public static void decimalAOctal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número decimal: ");
        int numeroDecimal = scanner.nextInt();
        String numeroOctal = Integer.toOctalString(numeroDecimal);
        System.out.println("El número octal es: " + numeroOctal);
    }

    public static void hexadecimalADecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número hexadecimal: ");
        String numeroHexadecimal = scanner.nextLine();
        int numeroDecimal = Integer.parseInt(numeroHexadecimal, 16);
        System.out.println("El número decimal es: " + numeroDecimal);
    }

    public static void decimalAHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número decimal: ");
        int numeroDecimal = scanner.nextInt();
        String numeroHexadecimal = Integer.toHexString(numeroDecimal);
        System.out.println("El número hexadecimal es: " + numeroHexadecimal.toUpperCase());
    }
}

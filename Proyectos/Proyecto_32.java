import java.util.Scanner;

public class Proyecto_32 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer número (menor): ");
        int numMenor = lector.nextInt();

        System.out.print("Ingrese el segundo número (mayor): ");
        int numMayor = lector.nextInt();

        if (numMenor >= numMayor) {
            System.out.println("El primer número debe ser menor que el segundo.");
            return;
        }

        System.out.println("Números impares entre " + numMenor + " y " + numMayor + ":");
        for (int i = numMenor; i <= numMayor; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int sumaPares = 0;
        for (int i = numMenor; i <= numMayor; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("La suma de números pares es: " + sumaPares);

        System.out.println("Números y sus cuadrados:");
        for (int i = numMenor; i <= numMayor; i++) {
            System.out.println(i + " - " + (i * i));
        }

        int sumaCuadradosImpares = 0;
        for (int i = numMenor; i <= numMayor; i++) {
            if (i % 2 != 0) {
                sumaCuadradosImpares += (i * i);
            }
        }
        System.out.println("La suma de los cuadrados de números impares es: " + sumaCuadradosImpares);

        System.out.println("Números perfectos:");
        for (int i = numMenor; i <= numMayor; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.println(i);
            }
        }

        System.out.println("Números primos:");
        for (int i = numMenor; i <= numMayor; i++) {
            if (esNumeroPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esNumeroPerfecto(int num) {
        int suma = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }

    public static boolean esNumeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
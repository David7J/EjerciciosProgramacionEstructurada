import java.util.Scanner;

public class Proyecto_18 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Seleccione la figura que desea dibujar:");
        System.out.println("1. Triángulo Rectángulo");
        System.out.println("2. Salir");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la altura del triángulo:");
                int altura = lector.nextInt();
                TrianguloRectangulo(altura);
                break;
            case 2:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
    }

    public static void TrianguloRectangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

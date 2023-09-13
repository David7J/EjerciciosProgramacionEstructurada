import java.util.Scanner;

public class Proyecto_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione el espacio vectorial:");
            System.out.println("1. 2D");
            System.out.println("2. 3D");
            System.out.println("3. Salir");

            int opcionEspacio = scanner.nextInt();

            if (opcionEspacio == 3) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.println("Ingrese las coordenadas del primer vector:");
            double[] vector1 = leerVector(scanner, opcionEspacio);

            System.out.println("Ingrese las coordenadas del segundo vector:");
            double[] vector2 = leerVector(scanner, opcionEspacio);

            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma de vectores");
            System.out.println("2. Resta de vectores");
            System.out.println("3. Opuesto de un vector");
            System.out.println("4. Producto de un escalar por un vector");
            System.out.println("5. Producto punto");
            System.out.println("6. Determinar si son vectores paralelos");
            System.out.println("7. Determinar si son vectores ortogonales");
            System.out.println("8. Proyección de un vector sobre otro vector");
            System.out.println("9. Producto cruz");
            int opcionOperacion = scanner.nextInt();

            switch (opcionOperacion) {
                case 1:
                    double[] suma = sumaVectores(vector1, vector2);
                    imprimirVector(suma);
                    break;
                case 2:
                    double[] resta = restaVectores(vector1, vector2);
                    imprimirVector(resta);
                    break;
                case 3:
                    double[] opuesto = opuestoVector(vector1);
                    imprimirVector(opuesto);
                    break;
                case 4:
                    System.out.print("Ingrese el escalar: ");
                    double escalar = scanner.nextDouble();
                    double[] productoEscalar = productoEscalarVector(vector1, escalar);
                    imprimirVector(productoEscalar);
                    break;
                case 5:
                    double productoPunto = productoPunto(vector1, vector2);
                    System.out.println("El producto punto es: " + productoPunto);
                    break;
                case 6:
                    boolean paralelos = sonParalelos(vector1, vector2);
                    System.out.println("¿Son paralelos?: " + paralelos);
                    break;
                case 7:
                    boolean ortogonales = sonOrtogonales(vector1, vector2);
                    System.out.println("¿Son ortogonales?: " + ortogonales);
                    break;
                case 8:
                    double[] proyeccion = proyeccionVectorial(vector1, vector2);
                    imprimirVector(proyeccion);
                    break;
                case 9:
                    if (opcionEspacio == 2) {
                        System.out.println("El producto cruz solo está definido en 3D.");
                        break;
                    }
                    double[] productoCruz = productoCruz(vector1, vector2);
                    imprimirVector(productoCruz);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.print("¿Desea continuar? (s/n): ");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("s")) {
                System.out.println("Saliendo del programa.");
                break;
            }
        }
    }

    public static double[] leerVector(Scanner scanner, int dimension) {
        double[] vector = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.print("Coordenada " + (i + 1) + ": ");
            vector[i] = scanner.nextDouble();
        }
        return vector;
    }

    public static double[] sumaVectores(double[] vector1, double[] vector2) {
        int dimension = Math.min(vector1.length, vector2.length);
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }
        return resultado;
    }

    public static double[] restaVectores(double[] vector1, double[] vector2) {
        int dimension = Math.min(vector1.length, vector2.length);
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = vector1[i] - vector2[i];
        }
        return resultado;
    }

    public static double[] opuestoVector(double[] vector) {
        int dimension = vector.length;
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = -vector[i];
        }
        return resultado;
    }

    public static double[] productoEscalarVector(double[] vector, double escalar) {
        int dimension = vector.length;
        double[] resultado = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            resultado[i] = escalar * vector[i];
        }
        return resultado;
    }

    public static double productoPunto(double[] vector1, double[] vector2) {
        int dimension = Math.min(vector1.length, vector2.length);
        double resultado = 0;
        for (int i = 0; i < dimension; i++) {
            resultado += vector1[i] * vector2[i];
        }
        return resultado;
    }

    public static boolean sonParalelos(double[] vector1, double[] vector2) {
        double escalar = vector1[0] / vector2[0]; // División para el primer componente
        for (int i = 1; i < vector1.length; i++) {
            if (vector1[i] / vector2[i] != escalar) {
                return false;
            }
        }
        return true;
    }

    public static boolean sonOrtogonales(double[] vector1, double[] vector2) {
        return productoPunto(vector1, vector2) == 0;
    }

    public static double[] proyeccionVectorial(double[] vector1, double[] vector2) {
        double productoPunto = productoPunto(vector1, vector2);
        double magnitudVector2Cuadrado = productoPunto(vector2, vector2);
        double escalar = productoPunto / magnitudVector2Cuadrado;
        return productoEscalarVector(vector2, escalar);
    }

    public static double[] productoCruz(double[] vector1, double[] vector2) {
        if (vector1.length != 3 || vector2.length != 3) {
            throw new IllegalArgumentException("El producto cruz solo está definido en 3D.");
        }

        double[] resultado = new double[3];
        resultado[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        resultado[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        resultado[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
        return resultado;
    }

    public static void imprimirVector(double[] vector) {
        System.out.print("Resultado: [");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

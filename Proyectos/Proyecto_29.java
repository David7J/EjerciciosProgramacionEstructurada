import java.util.Scanner;

public class Proyecto_29 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el tipo de residencia (1: Apartamento, 2: Casa, 3: Dormitorio): ");
        int tipoResidencia = lector.nextInt();

        System.out.println("Ingrese la cantidad de horas en casa durante el día promedio: ");
        int horasEnCasa = lector.nextInt();

        System.out.println("Seleccione una categoría de horas (1-5): ");
        System.out.println("1 - 6 o más");
        System.out.println("2 - 18 o más");
        System.out.println("3 - 10-17");
        System.out.println("4 - 8-9");
        System.out.println("5 - 0-5");
        int categoriaHoras = lector.nextInt();

        String recomendacion = obtenerRecomendacion(tipoResidencia, horasEnCasa, categoriaHoras);

        System.out.println("Recomendación: " + recomendacion);
    }

    public static String obtenerRecomendacion(int tipoResidencia, int horasEnCasa, int categoriaHoras) {
        if (tipoResidencia == 1) { 
            if (horasEnCasa >= 10) {
                return "Gato";
            } else {
                return "Hamster";
            }
        } else if (tipoResidencia == 2) { 
            if (categoriaHoras == 2) {
                return "Cerdo barrigón";
            } else if (categoriaHoras == 3) {
                return "Perro";
            } else {
                return "Serpiente";
            }
        } else if (tipoResidencia == 3) { 
            if (horasEnCasa >= 6) {
                return "Pez";
            } else {
                return "Granja de hormigas";
            }
        }

        return "No se pudo determinar una recomendación.";
    }
}
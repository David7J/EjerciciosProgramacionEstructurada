import java.util.Scanner;

public class Proyecto_25 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una contraseña (debe tener entre 6 y 10 caracteres, al menos una letra y un dígito):");
            String contrasena = lector.nextLine();

            if (validarContrasena(contrasena)) {
                System.out.println("La contraseña es válida.");
                System.out.println("Por favor, confirme la contraseña:");
                String confirmacion = lector.nextLine();

                if (contrasena.equals(confirmacion)) {
                    System.out.println("Contraseña confirmada. ¡Registro exitoso!");
                    break;
                } else {
                    System.out.println("Las contraseñas no coinciden. Intente de nuevo.");
                }
            } else {
                System.out.println("La contraseña no cumple con los requisitos. Intente de nuevo.");
            }
        }
    }

    public static boolean validarContrasena(String contrasena) {
      
        if (contrasena.length() < 6 || contrasena.length() > 10) {
            return false;
        }

        boolean tieneLetra = false;
        boolean tieneDigito = false;

        for (char caracter : contrasena.toCharArray()) {
            if (Character.isLetter(caracter)) {
                tieneLetra = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }

            if (tieneLetra && tieneDigito) {
                return true;
            }
        }
        return false;
    }
}
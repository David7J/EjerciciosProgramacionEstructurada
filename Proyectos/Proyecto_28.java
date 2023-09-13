import java.util.Random;
import java.util.Scanner;

public class Proyecto_28 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner lector = new Scanner(System.in);

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int num3 = random.nextInt(10);

        System.out.println("¡Bienvenido al juego de lotería!");
        System.out.println("Adivina los tres números entre 0 y 9");

        int guess1 = lector.nextInt();
        int guess2 = lector.nextInt();
        int guess3 = lector.nextInt();

        System.out.println("Los números generados son: " + num1 + ", " + num2 + ", " + num3);

        int premio = calcularPremio(num1, num2, num3, guess1, guess2, guess3);
        System.out.println("Premio ganado: C$" + premio);
    }

    public static int calcularPremio(int num1, int num2, int num3, int guess1, int guess2, int guess3) {
        int premio = 0;

        if (num1 == guess1 || num1 == guess2 || num1 == guess3) {
            premio += 100;
        }

        if (num2 == guess1 || num2 == guess2 || num2 == guess3) {
            premio += 100;
        }

        if (num3 == guess1 || num3 == guess2 || num3 == guess3) {
            premio += 100;
        }

        if (num1 == guess1 && num2 == guess2 && num3 == guess3) {
            premio = 1000000;
        } else if (premio == 300) {
            premio = 1000;
        } else if (premio == 200) {
            premio = 10000;
        }
        return premio;
    }
}
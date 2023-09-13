import java.util.Scanner;

public class Proyecto_10 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double A1,A2,A3,A4,A5,B;
        double medidaMuñeca, medidaCintura, medidaCadera, medidaAntebrazo, grasaCorporal,pesoCorporal;
        double porcentajeGrasaCorporal;
        char sexo;

        System.out.println("Digite su sexo (m/f): ");
        sexo = lector.next().charAt(0);

        if(sexo == 'f'){
        System.out.println("Digite su peso en KG: ");
        pesoCorporal = lector.nextDouble();

        System.out.println("Digite la medida de su muñeca en cm (En el punto mas amplio): ");
        medidaMuñeca = lector.nextDouble();

        System.out.println("Digite la medida de su cintura en cm (En el ombligo): ");
        medidaCintura = lector.nextDouble();

        System.out.println("Digite la medida de su cadera en cm (En el punto mas amplio): ");
        medidaCadera = lector.nextDouble();

        System.out.println("Digite la medida de su ante brazo en cm (En el punto mas amplio)");
        medidaAntebrazo = lector.nextDouble();

        A1 = (pesoCorporal*0.732) +8.987;
        A2 = medidaMuñeca/3.140;
        A3 = medidaCintura*0.157;
        A4 = medidaCadera*0.249;
        A5 = medidaAntebrazo*0.434;
        B = A1 + A2 - A3 - A4 + A5;
        grasaCorporal = pesoCorporal - B;
        porcentajeGrasaCorporal = (grasaCorporal*100) /pesoCorporal;

        System.out.println("Su porcentaje de grasa corporal es: " +porcentajeGrasaCorporal);
        }    

        if(sexo =='m'){
        System.out.println("Digite su peso en KG: ");
        pesoCorporal = lector.nextDouble();

        System.out.println("Digite la medida de su cintura en cm (En el ombligo): ");
        medidaCintura = lector.nextDouble();

        A1 = (pesoCorporal*1.082) + 94.42;
        A2 = medidaCintura*4.15;
        B = A1 - A2;
        grasaCorporal = pesoCorporal - B;
        porcentajeGrasaCorporal = (grasaCorporal*100) / pesoCorporal;

        System.out.println("Su porcentaje de grasa corporal es: " +porcentajeGrasaCorporal);
        }

        lector.close();
    }
}

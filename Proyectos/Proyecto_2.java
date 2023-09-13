import java.util.Scanner;

public class Proyecto_2 {

    public static void main(String[] args) throws Exception {
            Scanner lector = new Scanner(System.in);
    
            double lado1, lado2, lado3;
            double comprobacion1, comprobacion2, comprobacion3, sumaLados, hipotenusa;

            System.out.println("Digite el lado 1: ");
            lado1 = lector.nextDouble();

            System.out.println("Digite el lado 2: ");
            lado2 = lector.nextDouble();

            System.out.println("Digite el lado 3: ");
            lado3 = lector.nextDouble();

            comprobacion1 = lado1 + lado2;
            comprobacion2 = lado2 + lado3;
            comprobacion3 = lado1 + lado3;

            sumaLados = Math.pow(lado1,2) + Math.pow(lado2,2);
            hipotenusa = Math.pow(lado3, 2);

            if(comprobacion1 > lado3 && comprobacion2 > lado1 && comprobacion3 > lado2){
                System.out.println("Es un triangulo: ");
            

            System.out.println("::::::::::::::::::::::");

            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Es un triangulo Equilatero");
            }

            if(lado1 != lado2 && lado1 == lado3 || lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado2 != lado1){
                System.out.println("Es un triangulo Isoceles");
            }

            System.out.println("::::::::::::::::::::::");

            if(lado1 != lado2 && lado2 != lado3){
                System.out.println("Es un triangulo Escaleno");
            }

            System.out.println("::::::::::::::::::::::");

            if(sumaLados == hipotenusa){
                System.out.println("Es un triangulo Rectangulo");
            }

            }else{
                System.out.println("No es un triangulo ");
            }

        lector.close();
    }
}


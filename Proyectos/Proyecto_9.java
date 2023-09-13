import java.util.Scanner;

public class Proyecto_9 {

    public static void main(String[] args) throws Exception {
            Scanner lector = new Scanner(System.in);
    
            int num1, num2;

            System.out.println("Ingrese el primer numero entero: ");
            num1 = lector.nextInt();

            System.out.println("Ingrese el segundo numero entero: ");
            num2 = lector.nextInt();
            if(num1 < num2){

                int numero = num1;
                int sumaPares = 0;
                int sumaCuadradosImpares = 0;

                System.out.println("Numeros impares entre: " +  num1  +  " y "  +  num2);
                while(numero <= num2){
                    if(numero % 2 != 0){
                        System.out.println(numero + " ");
                        sumaCuadradosImpares += numero * numero;
                    }else{
                        sumaPares += numero;
                    }

                        System.out.println("El cuadrado de " + numero + " es " + (numero*numero));

                        if(numeroPerfecto(numero)){
                            System.out.println(numero + " es un numero perfecto");
                        }
                        if(numeroPrimo(numero)){
                            System.out.println(numero + " es un numero primo");
                        }
                        numero ++;

                  System.out.println("La suma de los numeros pares es: " +sumaPares);
                  System.out.println("La suma de los cuadrados de los numeros impares es: " +sumaCuadradosImpares);
                }

            }else{
                System.out.println("El primer numero tiene que ser menor que el primero");
            }

      lector.close();
    }

    public static boolean numeroPerfecto(int numero){
        int sumaDivisores = 0;

        for(int i = 1; i <= numero/2; i++){
            if(numero % i == 0){
                sumaDivisores += i;
            }

        }
        return sumaDivisores == numero;
    }
    public static boolean numeroPrimo (int numero){
        if(numero < 2)return false;

        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0) return false;
        }
        return true;
    }

}

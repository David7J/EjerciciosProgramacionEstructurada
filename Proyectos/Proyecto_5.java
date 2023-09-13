import java. util. Scanner;

public class Proyecto_5 {
    public static void main(String[] args) throws Exception {
            Scanner lector = new Scanner(System.in);

            int a, sumaNum, i, digito;
            String digitosCadena;

            System.out.println("Digite un numero entero: ");
            a = lector.nextInt();

            digitosCadena = String.valueOf(a);
            sumaNum = 0;
            
            for(i = 0; i< digitosCadena.length(); i++){
                digito = Character.getNumericValue(digitosCadena.charAt(i));
                sumaNum += digito;
            }

            for(i = 0; i < digitosCadena.length(); i++){
                System.out.println(digitosCadena.charAt(i));

                if(i < digitosCadena.length() - 1){
                    System.out.println(" ");
                }
            }
            System.out.println("La suma de los digitos es: " +sumaNum);
            System.out.println("Los digitos son: " +i);
            
       lector.close();    
    }
}
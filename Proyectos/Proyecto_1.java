import java.util.Scanner;

public class Proyecto_1{

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        char sexo, armas;
        byte edad;
     
        System.out.println("¿Usted porta armas? (s/n)");
        armas = lector.next().charAt(0);
        if(armas == 'n'){
        System.out.println("Siguiente pregunta: ");
        

        System.out.println("Digite su edad: ");
        edad = lector.nextByte();
        if (edad >= 18 && edad > 0){
        System.out.println("Puede ingresar a la disco");


        System.out.println("Digite su sexo (f/m): ");
        sexo = lector.next().charAt(0);
        if (edad > 20 && sexo == 'f' || edad > 20 && sexo == 'm'){
            System.out.println("Usted puede pasar y tomar alcohol");
        }else{
            System.out.println("Usted puede pasar, pero no puede beber bebidas alcohólicas");
        }


        }else{
         System.out.println("Usted no puede ingresar porque es menor de edad ");
        }


        }else{
            System.out.println("No puede pasar con armas");
        }

        lector.close();
    }
}

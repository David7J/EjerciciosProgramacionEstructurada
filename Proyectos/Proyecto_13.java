import java.util.Scanner;

public class Proyecto_13 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double saldoCordoba = 1000;
        double saldoDolar = 200;
        double retiro, deposito, total;
        int opc;
        char dinero;

        System.out.println("Bienvenido al ATM, que transaccion desea realizar:");
        System.out.println("1) Retirar");
        System.out.println("2) Depositar");
        opc = lector.nextInt();

        switch(opc){
            case 1:
                System.out.println("Desea su dinero en dolares o en cordobas? (c =cordobas/d =dolares)");
                dinero = lector.next().charAt(0);

                if(dinero == 'c'){
                System.out.println("Cuanto dinero desea retirar?");
                retiro = lector.nextDouble();

                total = saldoCordoba - retiro;
                if(total > 0){
                    System.out.println("Su saldo quedo de la siguiente manera: " + total);
                }else{
                    System.out.println("No queda saldo en su cuenta, le recomendamos depositar: " + total);
                }
              }
              if(dinero == 'd'){
                System.out.println("Cuanto dinero desea retirar?");
                retiro = lector.nextDouble();

                total = saldoDolar - retiro;
                if(total > 0){
                    System.out.println("Su saldo quedo de la siguiente manera: " + total);
                }else{
                    System.out.println("No queda saldo en su cuenta, le recomendamos depositar: " + total);
                }
              }
            break;


            case 2:
              System.out.println("Desea depositar cordobas o dolares? (c = cordobas/ d = dolares)");
              dinero = lector.next().charAt(0);

              if(dinero == 'c'){
                System.out.println("Cuanto dinero desea depositar?");
                deposito = lector.nextDouble();

                total = saldoCordoba + deposito;
                if(total > 0){
                    System.out.println("Su saldo queda de la siguiente manera: " + total);
                }
              }
              if(dinero == 'd'){
                System.out.println("Cuanto dinero desea depositar?");
                deposito = lector.nextDouble();

                total = saldoDolar + deposito;
                if(total > 0){
                    System.out.println("Su saldo queda de la siguiente manera: " + total);
                }
              }
            break;
            default:
                System.out.println("Solo se puede ingresar 1 o 2");
        }
        lector.close();
    }
}

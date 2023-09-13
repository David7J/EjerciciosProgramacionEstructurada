import java.util.Scanner;

public class Proyecto_7 {
    
    public static void main(String[] args) throws Exception {
            Scanner lector = new Scanner(System.in);

            char hora;
            int numCuenta;
            int servReg = 10;
            int servPrem = 25;

            System.out.println("Digite su numero de cuenta: ");
            numCuenta = lector.nextInt();

            System.out.println("Elija su tipo de servicio: ");
            System.out.println("r) Servicio Regular:  ");
            System.out.println("p) Servicio Premium: ");
            char opc = lector.next().charAt(0);

            switch(opc){
                case 'r':
                    System.out.println("Costo del servicio: " +servReg);
                    System.out.println("Cuantos minutos utilizo el servicio?");
                    int minutos = lector.nextInt();
                    if(minutos > 50){
                        int minExceso = minutos - 50;
                        double costAd = 0.20*minExceso;
                        System.out.println("Costo adicional: " +costAd);
                        System.out.println(" ");
                        System.out.println("Numero de cuenta: " +numCuenta);
                        System.out.println("Tipo de servicio: R");
                        System.out.println("Total de minutos utilizados: " +minutos);
                        System.out.println("Total a pagar: ");
                        System.out.print(costAd+servReg);
                    }else{
                        System.out.println("Solo utilizo 50 minutos o menos, por lo cual el costo es: " +servReg);
                    }
                break;

                case 'p':
                    System.out.println("Costo de servicio: " +servPrem);
                    System.out.println("A que hora del dia utilizo el servicio: (a = dia/p = noche)");
                    hora = lector.next().charAt(0);

                    System.out.println("Cuantos minutos utilizo: ");
                        minutos = lector.nextInt();
                    if(hora == 'a' && minutos > 75 && minutos < 100){
                        int minExceso = minutos - 75;
                        double costAd = 0.10*minExceso;
                        System.out.println("Costo adicional: " +costAd);
                        System.out.println(" ");
                        System.out.println("Numero de cuenta: " +numCuenta);
                        System.out.println("Tipo de servicio: P");
                        System.out.println("Total de minutos utilizados: " +minutos);
                        System.out.println("Total a pagar: ");
                        System.out.println(costAd+servPrem);
                    }else{
                        if(hora == 'a'){
                        System.out.println("Solo utilizo 75 minutos o menos, por lo cual solo paga el servicio: " +servPrem);
                        }
                    }

                    if(hora == 'p' && minutos > 100){
                        int minExceso = minutos - 100;
                        double costAd = 0.05*minExceso;
                        System.out.println("Costo adicional: " +costAd);
                        System.out.println(" ");
                        System.out.println("Numero de cuenta: " +numCuenta);
                        System.out.println("Tipo de servicio: P");
                        System.out.println("Total de minutos utilizados: " +minutos);
                        System.out.println("Total a pagar: ");
                        System.out.print(costAd+servPrem);
                    }else{
                        if(hora == 'p'){
                        System.out.println("Solo utilizo 100 minutos o mneos, por lo cual no hay costo adicional: " +servPrem);
                        }
                    }

                break;
              default:
              System.out.println("Solo se permiten las letras p y r");
            }


      lector.close();      
    }
}

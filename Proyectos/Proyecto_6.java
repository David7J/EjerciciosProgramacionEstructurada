import java.util.Scanner;

public class Proyecto_6 {
   
    public static void main(String[] args) throws Exception {
            Scanner lector = new Scanner(System.in);
    
            int numCuenta, saldo;
            int saldoMin = 500;
            double interes;

            System.out.println("Digite su numero de cuenta: ");
            numCuenta = lector.nextInt();

            System.out.println("Digite su saldo actual (Saldo minimo: 500): ");
            saldo = lector.nextInt();

            System.out.println("Elija su tipo de cuenta: ");
            System.out.println("s) Cuenta de Ahorros:  ");
            System.out.println("c) Cuenta de Cheque: ");
            char opc = lector.next().charAt(0);

            switch(opc){
                case 's':
                    if(saldo >= saldoMin){
                        interes = saldo*0.04;
                    System.out.println("El interes a recibir es del 4%: " + interes);
                    System.out.println(" ");
                     System.out.println("Numero de cuenta: " +numCuenta);
                     System.out.println("Tipo de cuenta: S");
                     System.out.println("Saldo minino 500$");
                     System.out.println("El interes es de: " +interes);
                     System.out.println("Saldo nuevo (con interes): ");
                     System.out.print(saldo-interes);
                    }else{
                        System.out.println(saldo-10);
                        System.out.println(" ");
                     System.out.println("Numero de cuenta: " +numCuenta);
                     System.out.println("Tipo de cuenta: S");
                     System.out.println("Saldo minino 500$");
                     System.out.println("Saldo nuevo (con cargo de 10$): " );
                     System.out.print(saldo-10);
                    }
                     
                break;

                case 'c':
                    if(saldo >= 5500){
                        interes = saldo*0.03;
                        System.out.println("El interes a recibir es del 3%: " +interes);
                        System.out.println(" ");
                        System.out.println("Numero de cuenta: " +numCuenta);
                        System.out.println("Tipo de cuenta: C");
                        System.out.println("Saldo minimo 500$ y sobre exceso de 5000");
                        System.out.println("Saldo nuevo (con interes): ");
                        System.out.print(saldo-interes);
                    }else{
                        if(saldo >= saldoMin){
                        interes = saldo*0.05;
                        System.out.println("El interes sera del 5%: " +interes);
                        System.out.println(" ");
                        System.out.println("Numero de cuenta: " +numCuenta);
                        System.out.println("Tipo de cuenta: C");
                        System.out.println("Saldo minimo 500$ sin sobre exceso");
                        System.out.println("Saldo nuevo (con interes): ");
                        System.out.print(saldo-interes);
                        }
                    }
                    if(saldo < saldoMin){
                        System.out.println(saldo-25);
                        System.out.println(" ");
                        System.out.println("Numero de cuenta: " +numCuenta);
                        System.out.println("Tipo de cuenta: C");
                        System.out.println("Saldo minimo 500$");
                        System.out.println("Saldo nuevo (con cargo de 25$): ");
                        System.out.println(saldo-25);
                    }
                break;
            }

        lector.close();
    }
}

import java.util.Scanner;

public class Proyecto_11 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double montoPrest, pagoMens, intMens, calcTasa;
        double intAnual, totalPago, mensualidad, calculo;      

        System.out.println("Digite el monto del prestamo: ");
        montoPrest = lector.nextDouble();

        System.out.println("Digite el interes anual (En porcentaje): ");
        intAnual = lector.nextDouble();

        System.out.println("Digite su pago mensual: ");
        mensualidad = lector.nextDouble();

        if(mensualidad > intAnual){
        while(montoPrest > 0){
            System.out.println("Se le deducira su pago mensual: ");
            intMens = intAnual/12;
            calculo = intMens*0.01;
            calcTasa = montoPrest*calculo;
            pagoMens = mensualidad - calcTasa;
            totalPago = montoPrest - pagoMens;

            System.out.println("El monto queda de la siguiente forma: " +totalPago);

            montoPrest = totalPago;
            if(totalPago <0){
                System.out.println("::::::::::::::::::::::::::::::::");
                System.out.println("El monto esta por debajo de la tasa, por favor pagar el monto restante");
            }else{
                System.out.println("Su monto ha sido pagado con exito");
            }
        }
    }else{
        System.out.println("El pago es insuficiente, ingrese una cantidad mayor");
    }
        
        lector.close();
    }
}

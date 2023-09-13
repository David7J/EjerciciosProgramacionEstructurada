import java.util.Scanner;

public class Proyecto_12 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numCuenta;
        double canalPr, conexiones;
        double premium1 = 7.50, premium2 = 50;
        double cargo1 = 4.50;
        double servicioBasico1 = 20.50, servicioBasico2 = 75;
        char codigoCliente;
        double cargo2 = 15;

        System.out.println("Digite su numero de cuenta: ");
        numCuenta = lector.nextInt();

        System.out.println("Digite su codigo de cliente: ");
        System.out.println("r) Residencial");
        System.out.println("n) Negocios");
        codigoCliente = lector.next().charAt(0);

        switch(codigoCliente){
            case 'r':
                System.out.println("Cuantos canales premium desea ver?");
                canalPr = lector.nextDouble();
                if(canalPr > 0){
                    System.out.println("Su factura es: ");
                    System.out.println(":::::::::::::::::");
                    System.out.println("Numero de cuenta del cliente: " +numCuenta);
                    System.out.println("Cargo por procesamiento de la factura: " + cargo1);
                    System.out.println("Cargo por servicio basico: " + servicioBasico1);
                    System.out.println("Costo por canales premium: " +premium1*canalPr);
                }else{
                    if(canalPr == 0){
                    System.out.println("Su factura es: ");
                    System.out.println(":::::::::::::::::");
                    System.out.println("Numero de cuenta del cliente: " +numCuenta);
                    System.out.println("Cargo por procesamiento de la factura: " + cargo1);
                    System.out.println("Cargo por servicio basico: " + servicioBasico1);
                    }
                }
            break;
        
            case 'n':
                System.out.println("Cuantos canales premium desea ver?");
                canalPr = lector.nextDouble();

                System.out.println("Cuantas conexiones uso?");
                conexiones = lector.nextDouble();
                if(canalPr > 0 && conexiones > 0 || conexiones <= 10){
                    System.out.println("Su factura es: ");
                    System.out.println(":::::::::::::::::");
                    System.out.println("Numero de cuenta del cliente: " +numCuenta);
                    System.out.println("Cargo por procesamiento de la factura: " + cargo2);
                    System.out.println("Cargo por servicio basico: " + servicioBasico2);
                    System.out.println("Costo por canales premium: " +premium2*canalPr);
                }else{
                    if(canalPr == 0 && conexiones > 0 || conexiones <= 10){
                    System.out.println("Su factura es: ");
                    System.out.println(":::::::::::::::::");
                    System.out.println("Numero de cuenta del cliente: " +numCuenta);
                    System.out.println("Cargo por procesamiento de la factura: " + cargo2);
                    System.out.println("Cargo por servicio basico: " + servicioBasico2);
                    }
                }
                if(canalPr > 0 && conexiones > 10){
                    double calcC = canalPr -10;
                    System.out.println("Su factura es: ");
                    System.out.println(":::::::::::::::::");
                    System.out.println("Numero de cuenta del cliente: " +numCuenta);
                    System.out.println("Cargo por procesamiento de la factura: " + cargo2);
                    System.out.println("Cargo por servicio basico: " + servicioBasico2);
                    System.out.println("Costo por mas de 10 conexiones: " +calcC*5);
                    System.out.println("Costo por canales premium: " +premium2*canalPr); 
                }else{
                    if(canalPr == 0 && conexiones > 10){
                    double calcC = canalPr -10;
                    System.out.println("Su factura es: ");
                    System.out.println(":::::::::::::::::");
                    System.out.println("Numero de cuenta del cliente: " +numCuenta);
                    System.out.println("Cargo por procesamiento de la factura: " + cargo2);
                    System.out.println("Cargo por servicio basico: " + servicioBasico2);
                    System.out.println("Costo por mas de 10 conexiones: " +calcC*5);
                    }
                }
            break;
            default:
            System.out.println("Solo se puede ingresar r o n");
        }
        
        lector.close();
    }
}


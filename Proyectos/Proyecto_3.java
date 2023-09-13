import java.util.Scanner;

public class Proyecto_3 {
    
    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

        int contenedor, rosquillas, rosquillasSobrantes, cajasSobrantes;
        int cajaRosquillas;
        
        System.out.println("Ingrese la cantidad de rosquillas disponibles");
        rosquillas = lector.nextInt();

        cajaRosquillas = rosquillas / 24;
        rosquillasSobrantes = rosquillas % 24;
        contenedor = cajaRosquillas / 75;
        cajasSobrantes = cajaRosquillas % 75;

        if(rosquillas > 0){
            System.out.println("Cajas de rosquillas: " + cajaRosquillas);
            System.out.println("Rosquillas sobrantes: " + rosquillasSobrantes);
            System.out.println("Contenedores: " + contenedor);
            System.out.println("Cajas sobrantes: " + cajasSobrantes);
        }
        
        lector.close();
    }
}

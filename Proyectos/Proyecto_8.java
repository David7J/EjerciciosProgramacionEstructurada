import java.util.Scanner;

public class Proyecto_8 {

    public static void main(String[] args) throws Exception {
            Scanner lector = new Scanner(System.in);
    
            double pulgAnch, pulgLong, costoTotal, costoPint, costoCarton, costoVidrio, costoCoronas;
            double marcReg = 0.15;
            double marcLuj = 0.25;
            char pintar;
            double carton = 0.02, vidrio = 0.07;
            int coronas;

            System.out.println("Que tipo de marco desea:");
            System.out.println("1) Regular");
            System.out.println("2) Lujoso");
            int opc = lector.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Costo del marco regular: " +marcReg);
                    System.out.println("Con cuantas pulgadas de ancho lo desea (0.15 por pulgada)");
                    pulgAnch = lector.nextDouble();

                    System.out.println("Con cuantas pulgadas de largo lo desea (0.15 por pulgada)");
                    pulgLong = lector.nextDouble();

                    System.out.println("Desea pintar el marco? (0.10 por pulgada) (s/n)");
                    pintar = lector.next().charAt(0);

                    System.out.println("Cuantas coronas desea que lleve su marco?");
                    coronas = lector.nextInt();

                    if(pintar == 's'){
                        System.out.println("El costo del marco es: ");
                        costoPint = (pulgAnch*0.10) + (pulgLong*0.10);
                        costoCarton = (pulgAnch*carton) + (pulgLong*carton);
                        costoVidrio = (pulgAnch*vidrio) + (pulgLong*vidrio);
                        costoCoronas = coronas*0.35;
                        costoTotal = marcReg + costoPint + costoCarton + costoVidrio + costoCoronas;

                        System.out.println("Longitud del marco: " + pulgLong);
                        System.out.println("Anchura del marco: " + pulgAnch);
                        System.out.println("Tipo de marco: Regular");
                        System.out.println("Costo por pintar el marco: " + costoPint);
                        System.out.println("Coronas: " + coronas);
                        System.out.println("El costo total es de: " + costoTotal);

                    }else{
                        costoCarton = (pulgAnch*carton) + (pulgLong*carton);
                        costoVidrio = (pulgAnch*vidrio) + (pulgLong*vidrio);
                        costoCoronas = coronas*0.35;
                        costoTotal = marcReg + costoCarton + costoVidrio + costoCoronas;

                        System.out.println("Longitud del marco: " + pulgLong);
                        System.out.println("Anchura del marco: " + pulgAnch);
                        System.out.println("Tipo de marco: Regular");
                        System.out.println("Coronas: " + coronas);
                        System.out.println("El costo total es de: " + costoTotal);
                    }

                break;

                case 2:
                     System.out.println("Costo del marco regular: " +marcLuj);
                    System.out.println("Con cuantas pulgadas de ancho lo desea (0.15 por pulgada)");
                    pulgAnch = lector.nextDouble();

                    System.out.println("Con cuantas pulgadas de largo lo desea (0.15 por pulgada)");
                    pulgLong = lector.nextDouble();

                    System.out.println("Desea pintar el marco? (0.10 por pulgada) (s/n)");
                    pintar = lector.next().charAt(0);

                    System.out.println("Cuantas coronas desea que lleve su marco?");
                    coronas = lector.nextInt();

                    if(pintar == 's'){
                        System.out.println("El costo del marco es: ");
                        costoPint = (pulgAnch*0.10) + (pulgLong*0.10);
                        costoCarton = (pulgAnch*carton) + (pulgLong*carton);
                        costoVidrio = (pulgAnch*vidrio) + (pulgLong*vidrio);
                        costoCoronas = coronas*0.35;
                        costoTotal = marcLuj + costoPint + costoCarton + costoVidrio + costoCoronas;

                        System.out.println("Longitud del marco: " + pulgLong);
                        System.out.println("Anchura del marco: " + pulgAnch);
                        System.out.println("Tipo de marco: Regular");
                        System.out.println("Costo por pintar el marco: " + costoPint);
                        System.out.println("Coronas: " + coronas);
                        System.out.println("El costo total es de: " + costoTotal);
                    }else{
                        costoCarton = (pulgAnch*carton) + (pulgLong*carton);
                        costoVidrio = (pulgAnch*vidrio) + (pulgLong*vidrio);
                        costoCoronas = coronas*0.35;
                        costoTotal = marcLuj + costoCarton + costoVidrio + costoCoronas;

                        System.out.println("Longitud del marco: " + pulgLong);
                        System.out.println("Anchura del marco: " + pulgAnch);
                        System.out.println("Tipo de marco: Regular");
                        System.out.println("Coronas: " + coronas);
                        System.out.println("El costo total es de: " + costoTotal);
                    }
                break;
                 default:
                   System.out.println("Solo se puede ingresar 1 o 2");
            }

      lector.close();
    }         
}
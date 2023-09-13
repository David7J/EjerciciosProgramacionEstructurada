import java. util. Scanner;

public class Proyecto_4 {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double a,b,c,x;
        double sumaRaiz,sumaRaizN,discriminante,ecuacion;

        System.out.println("Digite el valor de a: ");
        a = lector.nextDouble();

        System.out.println("Digite el valor de b:");
        b = lector.nextDouble();

        System.out.println("Digite el valor de c:");
        c = lector.nextDouble();

        System.out.println("Digite el valor de x:");
        x = lector.nextDouble();

        sumaRaiz = -b + Math.sqrt(Math.pow(b,2) - 4*(a)*c)/2*a;
        sumaRaizN = -b - Math.sqrt(Math.pow(b,2) - 4*(a)*c)/2*a;

        ecuacion = a * (Math.pow(x,2) + b*(x) + c);
        discriminante = Math.pow(b,2) - 4*a*c; 

        if (discriminante == 0){
            System.out.println("La ecuacion tiene una sola raiz (repetida) " + discriminante);
        }

        if(discriminante > 0){
            System.out.println("La ecuacion tiene dos raices reales " + discriminante);
        }

        if(discriminante < 0){
            System.out.println("La ecuacion tiene dos raices complejas " + discriminante);
        }

        System.out.println("El resultado de la suma de la raiz positiva es: " + sumaRaiz);
        System.out.println("El resultado de la suma de la raiz negativa es: " + sumaRaizN);
        System.out.println("El resultado de la ecuacion cuadratica es: " + ecuacion);
        
        lector.close();
    }
}
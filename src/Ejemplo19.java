import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        int horas;
        double precioHora;
        double salarioBruto;
        double impuestos;

        System.out.println("Introduce las horas y el precio:");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();
        precioHora = sc.nextDouble();
        if (horas <= 35){
            salarioBruto = precioHora * horas;
        }else {
            /*
                Si hace más de 35, las primeras 35 son a precio normal
                Las que faltan por cobrar son a precio normal * 1,5
             */
            salarioBruto = precioHora * 35;
            salarioBruto = salarioBruto + (horas - 35) * precioHora * 1.5;
        }

        if (salarioBruto <= 500){
            impuestos = 0;
        }else if (salarioBruto <= 900){
            impuestos = (salarioBruto - 500 ) * 0.25;
        }else{
            impuestos = (400 * 0.25) + (salarioBruto - 900) * 0.45;
        }
    }
}

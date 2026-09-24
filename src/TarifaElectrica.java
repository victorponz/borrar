import java.util.Scanner;

public class TarifaElectrica {
    public static void main(String[] args) {
        double consumo;
        double importe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el consumo en Kwh");
        consumo = sc.nextDouble();

        if (consumo <= 100){
            importe = consumo * 0.1;
        }else if (consumo <= 300){
            // Los primeros cien se pagan a 0.1;
            // Los restantes se pagan a 0.15
            importe = 100 * 0.1 + (consumo - 100) * 0.15;
        } else{
            importe = 100 * 0.1 + 200 * 0.15 + (consumo - 300) * 0.20;
        }
        System.out.println("El importe es: " + importe);
    }

}

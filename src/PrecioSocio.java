import java.util.Scanner;

public class PrecioSocio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe;
        System.out.println("Ingrese el importe");
        importe = sc.nextDouble();
        double descuento = 0;
        double importeFinal;
        System.out.println("¿Eres socio? (si/no)");
        String socio = sc.next();
        if (socio.equals("si")){
            if (importe > 100){
                descuento = 0.15;
            }else if (importe > 50){
                descuento = 0.1;
            }
        }else{
            if (importe > 50){
                descuento = 0.05;
            }
        }
        importeFinal = importe - (importe * descuento);
        System.out.println("El importe es: " + importeFinal);
    }
}

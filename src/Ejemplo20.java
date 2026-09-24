import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        double precio, descuento;
        Scanner sc = new Scanner(System.in);
        precio = sc.nextDouble();
        if (precio < 6 ) {
            descuento = 0;
        } else if (precio < 60){
            descuento = precio * 0.05;
        } else {
            descuento = precio * 0.10;
        }
        System.out.println("El precio es: " + (precio - descuento));
    }
}

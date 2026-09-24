import java.util.Scanner;

public class Ejemplo7b {
    public static void main(String[] args) {
        double precio, precioRebajado;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();

        System.out.print("Ingrese el precio rebajado: ");
        precioRebajado = sc.nextDouble();

        System.out.println("El descuento del precio es: " + (precio - precioRebajado)/precio * 100);
    }
}

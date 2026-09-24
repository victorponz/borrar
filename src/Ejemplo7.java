import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        // DATOS
        int radio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio = sc.nextInt();

        // ALGORITMO
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        // SALIDA
        System.out.println("El area del radio es: " + area);
        System.out.println("El perimetro del radio es: " + perimetro);
    }
}

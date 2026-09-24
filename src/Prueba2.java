import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
        int num1;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("El número " + num1 + " es mayor que cero");
        } else if (num1 < 0) {
            System.out.println("El número " + num1 + " es menor que cero");
        } else {
            System.out.println("El número es cero");
        }
    }
}

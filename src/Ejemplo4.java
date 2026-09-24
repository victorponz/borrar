import java.util.Scanner;
public class Ejemplo4 {
    public static void main (String argv[]) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("La edad es: " + edad);
    }
}

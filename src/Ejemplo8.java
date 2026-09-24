import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("El edad es mayor de 18");
        } else{
            System.out.println("El edad es menor de 18");
        }
    }
}

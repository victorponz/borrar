import java.util.Scanner;

public class ScannerDos {
    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        nombre = sc.nextLine();
        System.out.println("Bienvenido/a " + nombre);
    }
}

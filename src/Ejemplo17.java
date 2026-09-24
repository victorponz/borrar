import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese el mes: ");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                break;
            case 2:
                System.out.println("El mes tiene 28 días");
                break;
            default:
                System.out.println("El mes tiene 30 días");
        }

    }
}

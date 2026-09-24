import java.util.Scanner;

public class Ejemplo15 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce el numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;


        }
    }
}

import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Intrododuce dos números");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        } else{
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
        }
    }
}

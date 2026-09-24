import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Introduce dos números");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num2 + " > " + num1);
        }else{
            System.out.println(num1 + " > " + num2);
        }
    }
}

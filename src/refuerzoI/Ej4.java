package refuerzoI;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2;
        if (n % 10 == 0){
            System.out.println("El número es múltiplo de 10");
            System.out.println("Introduce otro número ");
            n2 = sc.nextInt();
            if (n2 % 10 == 0){
                System.out.println("El número es múltiplo de 10");
            }
        }

    }

}

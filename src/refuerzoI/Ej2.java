package refuerzoI;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        System.out.println("Introduce un número ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
}

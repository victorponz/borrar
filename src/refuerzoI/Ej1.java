package refuerzoI;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        System.out.println("Introduce un número  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * 2 + " " + n * 3);
    }
}

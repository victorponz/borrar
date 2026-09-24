package refuerzoI;

import java.util.Scanner;

/**
 * Crea un programa en java que pida al usuario un número entero y responda si es múltiplo de 2 o de 3.
 */
public class Ej7 {
    public static void main(String[] args) {
        int n;
        System.out.println("Introduce un número:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if  ((n % 2 == 0) || (n % 3 == 0)){
            System.out.printf("El número %d es múltiplo de 2 o de 3", n);
        }
    }
}

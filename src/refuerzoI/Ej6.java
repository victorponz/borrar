package refuerzoI;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario dos números enteros. Si el segundo no es cero, mostrará el
 * resultado de dividir el primero entre el segundo. Por el contrario, si el segundo número es cero,
 * escribirá "Error: No se puede dividir entre cero"
 */
public class Ej6 {
    public static void main(String[] args) {
        int n, m;
        System.out.println("Introduce dos números");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        if ( m != 0){
            n = sc.nextInt();
            System.out.printf("El resultado de dividir %d entre %d es %d", n, m, (n/m));
        }else{
            System.out.println("Error: No se puede dividir entre cero");
        }

    }
}

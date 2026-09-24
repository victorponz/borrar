package refuerzoI;

import java.util.Scanner;

/**
 * Crea un programa que multiplique dos números enteros de la siguiente forma: pedirá al usuario un
 * primer número entero. Si el número que se que teclee es 0, escribirá en pantalla "El producto de 0 por
 * cualquier número es 0". Si se ha tecleado un número distinto de cero, se pedirá al usuario un segundo
 * número y se mostrará el producto de ambos
 */
public class Ej5 {
    public static void main(String[] args) {
        int n, m;
        System.out.println("Introduce dos números");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == 0){
            System.out.println("El producto de 0 por cualquier número es 0");
        }else{
            m = sc.nextInt();
            //System.out.println("El producto de " + n + " * " + " es " + n*m);
            System.out.printf("El producto de %d * %d es %d", n, m, n*m);
        }


    }
}

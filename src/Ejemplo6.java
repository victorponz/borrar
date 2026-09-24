import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {

        // DATOS
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();

        // ALGORITMO
        int suma =  num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        // IMPRIMIR

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }

}

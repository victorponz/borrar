import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        String operacion;
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números");
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println("Introduce la operación a realizar (+, -, *, /):");
        operacion = sc.next();

        switch (operacion) {
            /* Fíjate que usamos dobles comillas " porque es de tipo String */
            case "+":
                //System.out.printf("El resultado de sumar %d y %d es %d", n, m, n+m);
                System.out.println("El resultado de sumar " + n  + " " + m + " es " + (n+m));
                break;
            case "-":
                System.out.println("El resultado de restar " + n  + " " + m + " es " + (n-m));
                break;
            case "*":
                System.out.println("El resultado de multiplicar " + n  + " " + m + " es " + (n*m));
                break;
            case "/":
                System.out.println("El resultado de dividir " + n  + " " + m + " es " + (n/m));
                break;
        }
    }
}

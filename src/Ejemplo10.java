import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        if (numero >=0 ){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
    }
}

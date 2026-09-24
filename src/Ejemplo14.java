import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {
        int nota;

        System.out.println("Introduce una nota: ");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();
        if (nota < 3){
            System.out.println("Muy deficiente");
        }else if (nota < 5) {
            System.out.println("Deficiente");
        }else if (nota < 7) {
            System.out.println("Bien");
        }else if (nota < 9) {
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }

    }
}

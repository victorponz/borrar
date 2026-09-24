import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        int hora;
        int minuto;
        int segundo;
        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();
        minuto = sc.nextInt();
        segundo = sc.nextInt();

        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
        }
        System.out.println(hora + " : " + minuto + " : " + segundo);

    }
}

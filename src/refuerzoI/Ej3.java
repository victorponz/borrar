package refuerzoI;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Introduce dos números ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        if (n % n2 == 0){
            System.out.println("Son múltiplos");
        }else{
            System.out.println("No son múltiplos");
        }
    }
}

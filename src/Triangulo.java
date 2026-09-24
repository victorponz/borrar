import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        System.out.println("Introduce 3 lados");
        Scanner input = new Scanner(System.in);
        lado1 = input.nextDouble();
        lado2 = input.nextDouble();
        lado3 = input.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("EQUILÁTERO");
            }else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("ISÓSCELES");
            }else{
                System.out.println("ESCALENO");
            }
        }else {
            System.out.println("IMPOSIBLE");
        }

    }
}

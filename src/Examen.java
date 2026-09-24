import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String practicas;
        System.out.println("Introduce la nota:");
        double nota = sc.nextDouble();
        System.out.println("Ha hecho las prácticas (si/no)");
        practicas = sc.next();
        if (nota < 5){
            System.out.println("Suspenso");
        }else if(practicas.equals("no")){
            System.out.println("Suspenso por prácticas no entregadas");
        }else if(nota < 7){
            System.out.println("Aprobado");
        }else if (nota < 9 ){
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }
    }
}

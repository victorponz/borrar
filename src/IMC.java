import java.util.Scanner;

/* Pide al usuario su peso (kg) y altura (m).
Calcula el Índice de Masa Corporal (IMC = peso / altura²) y muestra si está en “Bajo peso” (<18.5),
“Normal” (18.5-24.9), “Sobrepeso” (25-29.9) o “Obesidad” (≥30).
 */
public class IMC {
    public static void main(String[] args) {
        double peso, altura, imc;
        System.out.println("Introduce el peso y la altura");
        Scanner sc = new Scanner(System.in);
        peso = sc.nextDouble();
        altura = sc.nextDouble();

        imc = peso/(altura*altura);
        if (imc < 18.5){
            System.out.println("Bajo peso");
        }else if(imc < 25){
            System.out.println("Normal");
        }else if(imc < 30){
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidad");
        }

    }
}

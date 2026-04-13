import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade: ");
        int vel = sc.nextInt();

        if (vel > 80) {
            int excesso = vel - 80;
            double multa = excesso * 50;

            System.out.println("Excedeu: " + excesso + " Km/h");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Dentro do limite!");
        }
    }
}
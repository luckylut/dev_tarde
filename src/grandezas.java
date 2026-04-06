import java.util.Scanner;

public class grandezas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("=== CÁLCULO DE GRANDEZAS ELÉTRICAS ===");
        System.out.println("1 - Tensão (U = R * I)");
        System.out.println("2 - Resistência (R = U / I)");
        System.out.println("3 - Corrente (I = U / R)");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");

        int op = sc.nextInt();

        double R, U, I;

        switch (op) {
            case 1:
                System.out.print("Digite a Resistência (Ohms): ");
                R = sc.nextDouble();

                System.out.print("Digite a Corrente (Amperes): ");
                I = sc.nextDouble();

                double tensao = R * I;
                System.out.printf("Tensão: %.2f V\n", tensao);
                break;

            case 2:
                System.out.print("Digite a Tensão (Volts): ");
                U = sc.nextDouble();

                System.out.print("Digite a Corrente (Amperes): ");
                I = sc.nextDouble();

                if (I != 0) {
                    double resistencia = U / I;
                    System.out.printf("Resistência: %.2f Ohms\n", resistencia);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            case 3:
                System.out.print("Digite a Tensão (Volts): ");
                U = sc.nextDouble();

                System.out.print("Digite a Resistência (Ohms): ");
                R = sc.nextDouble();

                if (R != 0) {
                    double corrente = U / R;
                    System.out.printf("Corrente: %.2f A\n", corrente);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            case 4:
                System.out.println("Encerrando o programa...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
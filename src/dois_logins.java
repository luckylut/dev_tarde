import java.util.Scanner;

public class dois_logins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o usuário: ");
        String user = sc.next();

        System.out.print("Digite a senha: ");
        String senha = sc.next();

        // Processamento
        boolean loginValido =
                (user.equals("atila") && senha.equals("12345")) ||
                        (user.equals("olivi") && senha.equals("54321"));

        // Saída
        System.out.println("\n=== RESULTADO ===");
        if (loginValido) {
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Usuário e senha não conferem.");
        }

        sc.close();
    }
}
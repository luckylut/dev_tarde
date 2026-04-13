import java.util.Scanner;

public class validar_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine().trim();

        System.out.println("\n=== RESULTADO ===");

        if (texto.isEmpty()) {
            System.out.println("Dado inválido");
        } else if (texto.length() < 3) {
            System.out.println("Texto muito curto");
        } else if (!texto.matches("[a-zA-Z ]+")) {
            System.out.println("Use apenas letras");
        } else {
            System.out.println("Texto válido: " + texto);
        }

        sc.close();
    }
}
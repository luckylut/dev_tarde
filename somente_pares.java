public class somente_pares {
    public static void main(String[] args) {

        System.out.println("=== NÚMEROS PARES DE 1 A 100 ===\n");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
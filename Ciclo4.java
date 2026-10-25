public class Ciclo4 {
    public static void main(String[] args) {
        System.out.println("=== Números entre 1 y 100 divisibles por 3 y por 5 ===");
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

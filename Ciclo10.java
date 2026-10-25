import java.util.Scanner;

public class Ciclo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Contador de números impares ===");
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
            System.out.println("Números impares del 1 al " + n + ":");
            int i = 1;
            do {
                System.out.println(i);
                i += 2;
            } while (i <= n);
        }
        sc.close();
    }
}

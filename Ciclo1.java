import java.util.Scanner;

public class Ciclo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Factorial de un número ===");
        System.out.print("Ingresa un número entero (0 o mayor): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: el factorial no está definido para números negativos.");
        } else if (n > 20) {
            System.out.println("Error: el número es demasiado grande (máximo 20).");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Ciclo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Conteo de números ===");
        System.out.print("¿Cuántos números vas a ingresar? ");
        int cantidad = sc.nextInt();

        int mayores = 0, menores = 0, iguales = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Número " + i + ": ");
            double numero = sc.nextDouble();
            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }

        System.out.println("Números mayores que 0: " + mayores);
        System.out.println("Números menores que 0: " + menores);
        System.out.println("Números iguales a 0: " + iguales);
        sc.close();
    }
}

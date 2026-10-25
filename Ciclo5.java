import java.util.Scanner;

public class Ciclo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Contador de dígitos ===");
        System.out.print("Ingresa un número entero: ");
        long numero = sc.nextLong();

        long copia = Math.abs(numero);
        int digitos = 0;
        if (copia == 0) {
            digitos = 1;
        }
        while (copia > 0) {
            copia = copia / 10;
            digitos++;
        }

        System.out.println("El número " + numero + " tiene " + digitos + " dígito(s).");
        sc.close();
    }
}

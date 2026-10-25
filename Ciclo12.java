import java.util.Scanner;

public class Ciclo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Secuencia aritmética ===");
        System.out.print("Primer número: ");
        double primero = sc.nextDouble();
        System.out.print("Diferencia: ");
        double diferencia = sc.nextDouble();
        System.out.print("Número máximo: ");
        double maximo = sc.nextDouble();

        if (diferencia <= 0) {
            System.out.println("Error: la diferencia debe ser mayor que 0.");
        } else if (primero > maximo) {
            System.out.println("Error: el primer número no puede ser mayor que el máximo.");
        } else {
            System.out.println("Secuencia:");
            double termino = primero;
            do {
                System.out.println(termino);
                termino += diferencia;
            } while (termino <= maximo);
        }
        sc.close();
    }
}

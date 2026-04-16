import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese número: ");
            double a = sc.nextDouble();

            System.out.print("Ingrese otro número: ");
            double b = sc.nextDouble();

            double resultado = CalculadoraBasica.dividir(a, b);
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida");
        }
    }
}

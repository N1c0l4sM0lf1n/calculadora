public class CalculadoraBasica {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static double mayor(double a, double b) {
        return Math.max(a, b);
    }

    public static double menor(double a, double b) {
        return Math.min(a, b);
    }

    public static double potencia(double base, double exp) {
        return Math.pow(base, exp);
    }

    public static double porcentaje(double numero, double porcentaje) {
        return numero * porcentaje / 100;
    }
}

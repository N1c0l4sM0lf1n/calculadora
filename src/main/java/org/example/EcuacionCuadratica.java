public class EcuacionCuadratica {

    public static double[] resolver(double a, double b, double c) {
        double discriminante = b*b - 4*a*c;

        if (discriminante < 0) {
            throw new ArithmeticException("No tiene soluciones reales");
        }

        double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2*a);

        return new double[]{x1, x2};
    }
}

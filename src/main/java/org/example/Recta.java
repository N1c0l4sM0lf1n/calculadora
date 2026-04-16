public class Recta {

    public static double[] calcular(double x1, double y1,
                                    double x2, double y2) {

        if (x1 == x2) {
            throw new ArithmeticException("Recta vertical (pendiente indefinida)");
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }
}

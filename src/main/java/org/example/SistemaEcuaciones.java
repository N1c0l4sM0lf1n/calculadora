public class SistemaEcuaciones {

    public static double[] resolver(double A, double B, double C,
                                    double D, double E, double F) {

        double det = A*E - B*D;

        if (det == 0) {
            throw new ArithmeticException("Sistema sin solución única");
        }

        double x = (C*E - B*F) / det;
        double y = (A*F - C*D) / det;

        return new double[]{x, y};
    }
}

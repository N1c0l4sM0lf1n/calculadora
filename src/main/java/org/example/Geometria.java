public class Geometria {

    public static double areaCirculo(double r) {
        return Math.PI * r * r;
    }

    public static double perimetroCirculo(double r) {
        return 2 * Math.PI * r;
    }

    public static double volumenEsfera(double r) {
        return (4.0/3.0) * Math.PI * Math.pow(r,3);
    }

    // Puedes seguir con cuadrado, rectángulo, cubo, cono...
}

package juanlopez.pruebafiguras_interfaz;

public class TrianguloRectangulo {

    public static double calcularArea(double base, double altura) {
        return (base * altura / 2);
    }

    public static double calcularPerimetro(double base, double altura) {
        double hipotenusa = Math.pow(base * base + altura * altura, 0.5);
        return (base + altura + hipotenusa);
    }

    public static String determinarTipoTriangulo(double base, double altura) {
        double hipotenusa = Math.pow(base * base + altura * altura, 0.5);
        String tipo;
        if ((base == altura) && (base == hipotenusa) && (altura == hipotenusa)) {
            tipo = ("Es un triángulo equilátero");
        } else if ((base != altura) && (base != hipotenusa) && (altura != hipotenusa)) {
            tipo = ("Es un triángulo escaleno");
        } else {
            tipo = ("Es un triángulo isósceles");
        }
        return tipo;
    }

}

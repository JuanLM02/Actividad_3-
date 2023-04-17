package juanlopez.pruebafiguras_interfaz;

public class Rectangulo {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return (2 * base) + (2 * altura);
    }
}

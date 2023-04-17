
package juanlopez.pruebafiguras_interfaz;

public class Circulo {
    
    public static double calcularArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double calcularPerimetro(double r) {
        return 2 * Math.PI * r;
    }
}

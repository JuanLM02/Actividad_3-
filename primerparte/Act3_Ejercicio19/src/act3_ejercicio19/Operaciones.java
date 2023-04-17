
package act3_ejercicio19;

public class Operaciones {

    public static double calcular_perimetro(double l) {
        double perimet;
        perimet = (3 * l);
        return perimet;
    }

    public static double calcular_Area(double l) {
        double area = Math.sqrt(3) / 4 * (Math.pow(l, 2));
        return area;
    }

    public static double calcular_Altura(double l) {
        double b, alto;
        b = (l / 2);
        alto = Math.sqrt((Math.pow(l, 2)) - (Math.pow(b, 2)));
        return alto;
    }
}

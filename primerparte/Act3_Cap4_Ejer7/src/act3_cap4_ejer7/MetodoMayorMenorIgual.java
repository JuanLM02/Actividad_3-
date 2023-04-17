package act3_cap4_ejer7;

public class MetodoMayorMenorIgual {

    public static String mayor_menor_igual(double a, double b) {
        String result;
        if (a > b) {
            result = ("A ES MAYOR QUE B");
        } else if (b == a) {
            result = ("A ES IGUAL A B");
        } else {
            result = ("A ES MENOR QUE B");
        }
        return result;
    }
}

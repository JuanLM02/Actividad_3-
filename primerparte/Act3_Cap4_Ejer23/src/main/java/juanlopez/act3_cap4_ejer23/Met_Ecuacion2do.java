package juanlopez.act3_cap4_ejer23;

public class Met_Ecuacion2do {

    public static String result(double a, double b, double c) {
        String result;
        float discri = (float) ((Math.pow(b, 2)) - (4 * a * c));
        float discriRaiz = (float) Math.sqrt(discri);
        float x1 = (float) ((-1 * b + discriRaiz) / (2 * a));
        float x2 = (float) ((-1 * b - discriRaiz) / (2 * a));

        if (discri < 0) {
            result = ("ecuación no posee soluciones reales");
        } else {
            result = ("las soluciones son: x1= " + x1 + " x2= " + x2);
        }
        return result;
    }

    public static double discrimante(double a, double b, double c) {
        double discri = ((Math.pow(b, 2)) - (4 * a * c));

        //System.out.println(discri +" discrimiante");
        return discri;

    }

    public static double discrimant_Raiz(double a, double b, double c) {
        double discri = ((Math.pow(b, 2)) - (4 * a * c));
        double discriRaiz = (double) Math.sqrt(discri);

        //System.out.println(discriRaiz +" discrimianteraiz");
        return discriRaiz;
    }
}

package actividad_3_juanlopez;

public class SalarioNeto_SalarioBruto {

    public static double Calcular_SalNeto(double h) {
        double reten, sal_bru, fuent_reten, neto;
        double valor_h = 5000; //Valor de cada hora trabajada

        reten = (float) (0.125); //porcentaje de retencion en la fuente
        sal_bru = h * valor_h;
        fuent_reten = sal_bru * reten;
        neto = sal_bru - fuent_reten;
        return neto;

    }

    public static double Calcular_SalBruto(double h) {
        double sal_bru;
        double valor_h = 5000;
        sal_bru = h * valor_h;

        return sal_bru;
    }
}

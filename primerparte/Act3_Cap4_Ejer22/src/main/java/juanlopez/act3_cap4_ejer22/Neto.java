package juanlopez.act3_cap4_ejer22;

public class Neto {

    public static String result_neto(double h, double valor_h, String nombre) {
        double neto = h*valor_h;
        String Result;
        if (neto>450000){
            Result = (nombre+" $ "+ neto);
        }
        else{
            Result = (nombre);
        }
        return Result;
    }
}

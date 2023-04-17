package act3_cap4_ejer10;

/**
 *
 * @author juanc
 */
public class PatrimonioMayor {

    public static double patrimonio_mayor(double p, double e) {
        double PAGMAT = 50000;
        if ((p > 2000000) && (e > 3)) {
            PAGMAT = (PAGMAT + 0.03 * p);
        }
        return PAGMAT;
    }
}

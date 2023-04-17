/*
 Ejercicio resuelto Nº 10
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los 
siguientes datos: 
• Número de inscripción 
• Nombres 
• Patrimonio. 
• Estrato social. 
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio 
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3% 
sobre el patrimonio. Hacer un algoritmo que muestre: 
• Número de inscripción. 
• Nombres. 
• Pago de matrícula. 
 */
package act3_cap4_ejer10;


public class Act3_Cap4_Ejer10 {
 /*
    
    NI: Número de inscripción.
    NOM: Nombres.
    PAT: Patrimonio.
    EST: Estrato social.
    PAGMAT: Pago por matrícula.
    
    Algoritmo
INICIO
 LEA: NI, NOM, PAT, ES
 PAGMAT = 50000
 SI (PAT > 2000000) ∧ (ES > 3) ENTONCES
 PAGMAT = PAGMAT + 0.03 * PAT
 FIN_SI
 ESCRIBA: “EL ESTUDIANTE CON NUMERO DE INSCRIPCION”, NI,
 “Y NOMBRE”, NOM, “DEBE PAGAR: $”, PAGMAT
FIN_INICIO 
    
    PAGMAT = 50000;
        if ((PAT > 2000000) && (ES > 3)) {
            PAGMAT = (float) (PAGMAT + 0.03 * PAT);
        }
         */
    public static void main(String[] args) {
        VentanaCap4Ejer10 ventana = new VentanaCap4Ejer10();
        ventana.setVisible(true);
    }
    
}

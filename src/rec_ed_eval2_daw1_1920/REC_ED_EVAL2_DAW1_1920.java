package rec_ed_eval2_daw1_1920;

/**
 *
 * @author Mario
 */
public class REC_ED_EVAL2_DAW1_1920 {

    /**
     * @param args argumentos
     */
    public static void main(String[] args) {
        Deposito combustible, deposito1 = null;
        try {
            //FuelTank(double tankMax, double tankLevel)
            deposito1 = new Deposito("deposito1", 40.0, 0.0);
            DepositoException.validarDeposito(deposito1);
            combustible = new Deposito(deposito1);
            combustible.consumir(50.0);
            DepositoException.validarDeposito(combustible);
            Deposito deposito2 = new Deposito("deposito1", 40.0, 0.0);
        } catch (DepositoException ex) {
            System.out.println("Se produjo FuelTankException: "+ex.getMessage());
        }
        System.out.println("El deposito con  " + deposito1.getMaximo() + " litros ha sido creado.");
        System.out.println("La cantidad del deposito es de " + deposito1.getNivelActual() + " litros.");
        deposito1.consumir(50);
        System.out.println("Se han consumido 50L del deposito.");
        System.out.println("La cantidad del deposito ahora es de " + deposito1.getNivelActual() + " litros.");
        deposito1.rellenar(2);
        System.out.println("Se rellena el deposito con 2L.");
        System.out.println("La cantidad del deposito es de " + deposito1.getNivelActual() + " litros.");
        System.out.println("¿Está lleno el deposito?"+deposito1.estaLleno());
        System.out.println("¿Está vacio el deposito?"+deposito1.estaVacio());
        System.out.println("Vaciamos el deposito.");
        deposito1.vaciar();
        System.out.println("¿Está vacio el deposito ahora?"+deposito1.estaVacio());
        System.out.println("Llenamos el deposito.");
        deposito1.llenarHastaMax();
        System.out.println("¿Está lleno el deposito ahora?"+deposito1.estaLleno());
    }

}

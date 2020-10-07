package rec_ed_eval2_daw1_1920;

/**
 *
 * @author Mario
 */
public class DepositoException extends Exception {

    /**
     * *
     * DepositoException es el constructor
     *
     * @param msj mensaje de exception
     */
    public DepositoException(String msj) {
        super(msj);
    }

    /**
     *
     * @param d Deposito
     * @return <code>true</code> si el deposito es valido <code>false</code> si
     * no
     */
    public static boolean validarDeposito(Deposito d) {
        return validarMaximo(d.getMaximo()) && validarNivelActual(d.getNivelActual()) && (d.getNivelActual() <= d.getMaximo());
    }

    /**
     *
     * @param maximo
     * @return <code>true</code> si el maximo es valido <code>false</code> si no
     */
    public static boolean validarMaximo(double maximo) {
        return maximo > 0.0;
    }

    /**
     *
     * @param nivelActual
     * @return <code>true</code> si el nivel actual es valido <code>false</code>
     * si no
     */
    public static boolean validarNivelActual(double nivelActual) {
        return nivelActual >= 0.0;
    }

    /**
     *
     * @param nombre
     * @return <code>true</code> si el nombre es valido <code>false</code> si no
     */
    public static boolean validarNombre(String nombre) {
        if (nombre != null) {
            if (nombre.length() > 20) {
                return false;
            }
            return true;
        }
        return false;
    }

}

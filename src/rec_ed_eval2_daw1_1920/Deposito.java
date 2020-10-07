package rec_ed_eval2_daw1_1920;

/**
 * Esta clase sirve comparar el nivel de los depósitos.
 *
 * @author Mario
 */
public class Deposito {

    private double maximo;
    private double nivelActual;
    private String nombre;
       
    public Deposito(Deposito d) {
        if (DepositoException.validarDeposito(d)) {
            this.maximo = d.getMaximo();
            this.nivelActual = d.getNivelActual();
            this.nombre = d.getNombre();
        }
    }

    /**
     * *
     * Deposito es el constructor
     *
     * @param nombre nombre para el deposito. NO puede ser vacio ni superar los
     * 20 caracteres.
     * @param maximo nivel máximo del deposito. NO puede ser menor o igual a 0 y
     * ha de ser de tipo double
     * @param nivelActual actual del deposito. NO puede ser menor a 0 y ha de ser de
     * tipo double
     * @throws DepositoException si el deposito NO es válido
     */
    public Deposito(String nombre, double maximo, double nivelActual) throws DepositoException {
        
        if (DepositoException.validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            throw new DepositoException("El valor para el nombre NO puede ser vacio ni superar los 20 caracteres");
        }
        if (DepositoException.validarMaximo(maximo)) {
            this.maximo = maximo;
        } else {
            throw new DepositoException("El valor para el maximo del deposito debe ser > 0.0");
        }
        if (DepositoException.validarNivelActual(nivelActual)) {
            this.nivelActual = nivelActual;
        } else {
            throw new DepositoException("El valor para el nivel actual del depósito debe ser >= 0.0");
        }

    }

    /**
     * getMaximo()
     *
     * @return Devuelve el nivel máximo del depósito
     */
    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    /**
     * getNivelActual()
     *
     * @return Devuelve el nivel actual del depósito
     */
    public double getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(double nivelActual) {
        this.nivelActual = nivelActual;
    }

    /**
     * getNombre()
     *
     * @return Devuelve el nombre del depósito
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * estaVacio()
     *
     * @return 	<code>true</code> si el deposito esta vacio <code>false</code> en
     * otro caso.
     */
    public boolean estaVacio() {
        return nivelActual == 0;
    }

    /**
     * estaLleno()
     *
     * @return 	<code>true</code> si el deposito está lleno <code>false</code>
     * otro caso.
     */
    public boolean estaLleno() {
        return nivelActual == maximo;
    }

    /**
     * rellenar(): anyadir cantidad al deposito
     *
     * @param cantidad cantidad en litros anyadida al deposito
     */
    public void rellenar(double cantidad) {
        nivelActual = nivelActual + cantidad;
    }

    /**
     * consumir(): quitar cantidad del deposito
     *
     * @param cantidad cantidad en litros gastados
     */
    public void consumir(double cantidad) {
        nivelActual = nivelActual - cantidad;
    }

    /**
     * llenarHastaMax(): llena el deposito hasta su máximo
     */
    public void llenarHastaMax() {
        nivelActual = maximo;
    }

    /**
     * vaciar: vacia por completo el deposito
     */
    public void vaciar() {
        nivelActual = 0;
    }

}

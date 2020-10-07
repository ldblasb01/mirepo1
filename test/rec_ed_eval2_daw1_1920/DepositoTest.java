/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rec_ed_eval2_daw1_1920;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario
 */
public class DepositoTest {
    
    public DepositoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMaximo method, of class Deposito.
     */
    @Test
    public void testGetMaximo() {
        try {
            System.out.println("getMaximo");
            Deposito instance = new Deposito("deposito1", -100.0, 0.0);
            double expResult = -100.0;
            double result = instance.getMaximo();
            assertEquals(expResult, result, 0.0);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }

    /**
     * Test of getNivelActual method, of class Deposito.
     */
    @Test
    public void testGetNivelActual() {
        try {
            System.out.println("getNivelActual");
            Deposito instance = new Deposito("deposito1", 100.0, -19520.0);
            double expResult = -19520.0;
            double result = instance.getNivelActual();
            assertEquals(expResult, result, 0.0);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }

    /**
     * Test of getNombre method, of class Deposito.
     */
    @Test
    public void testGetNombre() {
        try {
            System.out.println("getNombre");
            Deposito instance = new Deposito("drfj", 100.0, 0.0);
            String expResult = "deposito13fawer23";
            String result = instance.getNombre();
            assertEquals(expResult, result, 0.0);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }

    /**
     * Test of estaVacio method, of class Deposito.
     */
    @Test
    public void testEstaVacio() {
        try {
            System.out.println("isEmpty1");
            Deposito instance = new Deposito("deposito1", 100.0, 100.0);
            boolean expResult = false;
            boolean result = instance.estaVacio();
            assertEquals(expResult, result);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }

    /**
     * Test of estaLleno method, of class Deposito.
     */
    @Test
    public void testEstaLleno() {
        try {
            System.out.println("isFull1");
            Deposito instance = new Deposito("deposito1", 100.0, 0.0);
            boolean expResult = false;
            boolean result = instance.estaLleno();
            assertEquals(expResult, result);
        } catch (DepositoException ex) {
            System.out.println("DepositoFuelTankException:" + ex.getMessage());
        }
    }

    /**
     * Test of rellenar method, of class Deposito.
     */
    @Test
    public void testRellenar() {
        try {
            System.out.println("rellenar");
            double cantidad = 2.0;
            Deposito instance = new Deposito("deposito1", 100.0, 50.0);
            instance.rellenar(cantidad);
            double expResult = 52.0;
            double result = instance.getNivelActual();
            assertEquals(expResult, result, 0.0001);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }

    /**
     * Test of consumir method, of class Deposito.
     */
    @Test
    public void testConsumir() {
        try {
            System.out.println("consumir");
            double cantidad = 2.0;
            Deposito instance = new Deposito("deposito1", 100.0, 50.0);
            instance.consumir(cantidad);
            double expResult = 48.0;
            double result = instance.getNivelActual();
            assertEquals(expResult, result, 0.0001);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }

    /**
     * Test of llenarHastaMax method, of class Deposito.
     */
    @Test
    public void testLlenarHastaMax() {
        try {
            System.out.println("llenarHastaMax");
            Deposito instance = new Deposito("deposito1", 100.0, 0.0);
            instance.llenarHastaMax();
            double expResult = 100.0;
            double result = instance.getNivelActual();
            assertEquals(expResult, result, 0.0001);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }

    /**
     * Test of vaciar method, of class Deposito.
     */
    @Test
    public void testVaciar() {
        try {
            System.out.println("vaciar");
            Deposito instance = new Deposito("deposito1", 100.0, 50.0);
            instance.vaciar();
            double expResult = 0.0;
            double result = instance.getNivelActual();
            assertEquals(expResult, result, 0.0001);
        } catch (DepositoException ex) {
            System.out.println("DepositoException:" + ex.getMessage());
        }
    }
    
    /**
     * Test of main method, of class REC_ED_EVAL2_DAW1_1920.
     */
    @Test
    public void testREC_ED_EVAL2_DAW1_1920() {
        String[] args = null;
        REC_ED_EVAL2_DAW1_1920.main(args);
    }
    
}

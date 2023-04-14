/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardshark_uabc_1182701;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sgarc
 */
public class CartaTest {
    
    public CartaTest() {
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
     * Test of getValor method, of class Carta.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Carta instance = new Carta();
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setValor method, of class Carta.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        int valor = 0;
        Carta instance = new Carta();
        instance.setValor(valor);
        
    }

    /**
     * Test of getFigura method, of class Carta.
     */
    @Test
    public void testGetFigura() {
        System.out.println("getFigura");
        Carta instance = new Carta();
        String expResult = "Corazon";
        String result = instance.getFigura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFigura method, of class Carta.
     */
    @Test
    public void testSetFigura() {
        System.out.println("setFigura");
        String figura = "";
        Carta instance = new Carta();
        instance.setFigura(figura);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Carta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Carta instance = new Carta(0,"Corazon");
        String expResult = "0 Corazon";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

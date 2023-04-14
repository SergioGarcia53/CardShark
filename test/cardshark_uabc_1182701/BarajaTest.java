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
public class BarajaTest {
    
    public BarajaTest() {
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
     * Test of toString method, of class Baraja.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Baraja instance = new Baraja();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSize method, of class Baraja.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Baraja instance = new Baraja();
        int expResult = 52;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCarta method, of class Baraja.
     */
    @Test
    public void testGetCarta() {
        System.out.println("getCarta");
        int n = 0;
        Baraja instance = new Baraja();
        Carta expResult= instance.getCarta(n);
        Carta result = instance.getCarta(n);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of removerCarta method, of class Baraja.
     */
    @Test
    public void testRemoverCarta() {
        System.out.println("removerCarta");
        int n = 0;
        Baraja instance = new Baraja();
        instance.removerCarta(n);
        
    }
    
}

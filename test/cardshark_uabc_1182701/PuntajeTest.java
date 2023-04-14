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
public class PuntajeTest {
    
    public PuntajeTest() {
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
     * Test of actualizarPuntos method, of class Puntaje.
     */
    @Test
    public void testActualizarPuntos() {
        System.out.println("actualizarPuntos");
        Puntaje instance = new Puntaje();
        instance.actualizarPuntos();
     
    }

    /**
     * Test of removerPuntos method, of class Puntaje.
     */
    @Test
    public void testRemoverPuntos() {
        System.out.println("removerPuntos");
        Puntaje instance = new Puntaje();
        instance.removerPuntos();
       
    }

    /**
     * Test of toString method, of class Puntaje.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Puntaje instance = new Puntaje();
        String expResult = "0";
        String result = instance.toString();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getPuntos method, of class Puntaje.
     */
    @Test
    public void testGetPuntos() {
        System.out.println("getPuntos");
        Puntaje instance = new Puntaje();
        int expResult = 0;
        int result = instance.getPuntos();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPuntos method, of class Puntaje.
     */
    @Test
    public void testSetPuntos() {
        System.out.println("setPuntos");
        int puntos = 0;
        Puntaje instance = new Puntaje();
        instance.setPuntos(puntos);
       
    }
    
}

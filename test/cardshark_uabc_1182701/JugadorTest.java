/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cardshark_uabc_1182701;

import java.util.ArrayList;
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
public class JugadorTest {
    
    public JugadorTest() {
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
     * Test of getJugador method, of class Jugador.
     */
    @Test
    public void testGetJugador() {
        System.out.println("getJugador");
        Jugador instance = new Jugador();
        ArrayList<Carta> expResult = new ArrayList<Carta>();
        ArrayList<Carta> result = instance.getJugador();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setJugador method, of class Jugador.
     */
    @Test
    public void testSetJugador() {
        System.out.println("setJugador");
        ArrayList<Carta> jugador = null;
        Jugador instance = new Jugador();
        instance.setJugador(jugador);
        
    }

    /**
     * Test of repartirCartas method, of class Jugador.
     */
    @Test
    public void testRepartirCartas_int_Baraja() {
        System.out.println("repartirCartas");
        int n = 0;
        Baraja Mazo = new Baraja();
        Jugador instance = new Jugador();
        instance.repartirCartas(n, Mazo);
        
    }

    /**
     * Test of cartasDado method, of class Jugador.
     */
    @Test
    public void testCartasDado() {
        System.out.println("cartasDado");
        int dado = 0;
        Baraja Mazo = null;
        Jugador instance = new Jugador();
        instance.cartasDado(dado, Mazo);
      
    }

    /**
     * Test of repartirCartas method, of class Jugador.
     */
    @Test
    public void testRepartirCartas_Baraja() {
        System.out.println("repartirCartas");
        Baraja Mazo = new Baraja();
        Jugador instance = new Jugador();
        int n=5;
        instance.repartirCartas(n,Mazo);
        
    }

    /**
     * Test of mostrarCartas method, of class Jugador.
     */
    @Test
    public void testMostrarCartas() {
        System.out.println("mostrarCartas");
        Jugador instance = new Jugador();
        instance.mostrarCartas();
       
    }

    /**
     * Test of escogerCarta method, of class Jugador.
     */
    @Test
    public void testEscogerCarta() {
        System.out.println("escogerCarta");
        int n = 0;
        Baraja Mazo=new Baraja();
        Jugador instance = new Jugador();
        instance.repartirCartas(Mazo);
        Carta result = instance.escogerCarta(n);
        Carta expResult = instance.escogerCarta(0);
        
        assertEquals(expResult, result);
      
    }

    /**
     * Test of removerCarta method, of class Jugador.
     */
    @Test
    public void testRemoverCarta() {
        System.out.println("removerCarta");
        int n = 0;
        Baraja Mazo=new Baraja();
        Jugador instance = new Jugador();
        instance.repartirCartas(Mazo);
        instance.removerCarta(n);
        
    }

    /**
     * Test of estaVacio method, of class Jugador.
     */
    @Test
    public void testEstaVacio() {
        System.out.println("estaVacio");
        Jugador instance = new Jugador();
        boolean expResult = true;
        boolean result = instance.estaVacio();
        assertEquals(expResult, result);
        
    }
    
}

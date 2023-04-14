
package cardshark_uabc_1182701;

import java.util.Scanner;
import java.util.Random;

public class CardShark_UABC_1182701 {
    public static void main(String[] args) 
    {
    Baraja Mazo=new Baraja();
    Carta cartaJ1=new Carta();
    Carta cartaJ2=new Carta();
    Carta cartaJ3=new Carta();
    Carta cartaJ4=new Carta();
    Carta cartaMayor=new Carta();
    Random rmd=new Random();
    Puntaje P1=new Puntaje();
    Puntaje P2=new Puntaje();
    Puntaje P3=new Puntaje();
    Puntaje P4=new Puntaje();
    Puntaje Pmayor=new Puntaje();
    Scanner teclado=new Scanner(System.in);
      int n,ronda=1; 
    Jugador j1=new Jugador();
    Jugador j2=new Jugador();
    Jugador j3=new Jugador();
    Jugador j4=new Jugador();
        j1.repartirCartas(Mazo);
        j2.repartirCartas(Mazo);
        j3.repartirCartas(Mazo);
        j4.repartirCartas(Mazo);
        
        do{
        j1.mostrarCartas();
        System.out.println("\nJ1 que carta desea tirar: ");
        n=teclado.nextInt();
        cartaJ1=j1.escogerCarta(n-1);
        
        
        j2.mostrarCartas();
        System.out.println("\nJ2 que carta desea tirar: ");
        n=teclado.nextInt();
        cartaJ2=j2.escogerCarta(n-1);
        
        
        j3.mostrarCartas();
        System.out.println("\nJ3 que carta desea tirar: ");
        n=teclado.nextInt();
        cartaJ3=j3.escogerCarta(n-1);
        
        
        j4.mostrarCartas();
        System.out.println("\nJ4 que carta desea tirar: ");
        n=teclado.nextInt();
        cartaJ4=j4.escogerCarta(n-1);
        
        
        cartaMayor=cartaJ1;
        if(cartaJ2.getValor()>=cartaMayor.getValor())
        {
           cartaMayor=cartaJ2; 
        }
        if(cartaJ3.getValor()>=cartaMayor.getValor())
        {
           cartaMayor=cartaJ3; 
        }
        if(cartaJ4.getValor()>=cartaMayor.getValor())
        {
           cartaMayor=cartaJ4; 
        }
            
        if(cartaJ1.getValor()>=cartaMayor.getValor() && cartaJ2.getValor()<cartaMayor.getValor() && cartaJ3.getValor()<cartaMayor.getValor() && cartaJ4.getValor()<cartaMayor.getValor())
        {
         P1.actualizarPuntos();
        }
         if(cartaJ2.getValor()>=cartaMayor.getValor() && cartaJ1.getValor()<cartaMayor.getValor() && cartaJ3.getValor()<cartaMayor.getValor() && cartaJ4.getValor()<cartaMayor.getValor())
        {
         P2.actualizarPuntos();
        }
         if(cartaJ3.getValor()>=cartaMayor.getValor() && cartaJ2.getValor()<cartaMayor.getValor() && cartaJ1.getValor()<cartaMayor.getValor() && cartaJ4.getValor()<cartaMayor.getValor())
        {
         P3.actualizarPuntos();
        }
         if(cartaJ4.getValor()>=cartaMayor.getValor() && cartaJ2.getValor()<cartaMayor.getValor() && cartaJ3.getValor()<cartaMayor.getValor() && cartaJ1.getValor()<cartaMayor.getValor())
        {
         P4.actualizarPuntos();
        }
            System.out.println("\n\n PUNTAJES\nJ1: "+P1.toString()+"\tJ2: "+P2.toString()+"\tJ3: "+P3.toString()+"\tJ4: "+P4.toString()+"\n");
            j1.removerCarta(n-1);
            j2.removerCarta(n-1);
            j3.removerCarta(n-1);
            j4.removerCarta(n-1);
           if(j1.estaVacio()==true) 
           {
               int dado=rmd.nextInt(5)+1;
               j1.cartasDado(dado, Mazo);
               P1.removerPuntos();
           }
           if(j2.estaVacio()==true) 
           {
               int dado=rmd.nextInt(5)+1;
               j2.cartasDado(dado, Mazo);
               P2.removerPuntos();
           }
           if(j3.estaVacio()==true) 
           {
               int dado=rmd.nextInt(5)+1;
               j3.cartasDado(dado, Mazo);
               P3.removerPuntos();
           }
           if(j4.estaVacio()==true) 
           {
               int dado=rmd.nextInt(5)+1;
               j4.cartasDado(dado, Mazo);
               P4.removerPuntos();
           }
            
            ronda++;
        }while(ronda!=10);
        Pmayor=P1;
        if(P1.getPuntos()>=Pmayor.getPuntos())
        {
           Pmayor=P1; 
        }
        if(P2.getPuntos()>=Pmayor.getPuntos())
        {
           Pmayor=P2; 
        }
        if(P3.getPuntos()>=Pmayor.getPuntos())
        {
           Pmayor=P3; 
        }
        if(P4.getPuntos()>=Pmayor.getPuntos())
        {
           Pmayor=P4; 
        }
        
        if(P1.getPuntos()>=Pmayor.getPuntos())
        {
            System.out.println("\nGANO J1!!!!!!!\nGRACIAS POR JUGAR");  
        }
        if(P2.getPuntos()>=Pmayor.getPuntos())
        {
            System.out.println("\nGANO J2!!!!!!!\nGRACIAS POR JUGAR");  
        }
        if(P3.getPuntos()>=Pmayor.getPuntos())
        {
            System.out.println("\nGANO J3!!!!!!!\nGRACIAS POR JUGAR");  
        }
        if(P4.getPuntos()>=Pmayor.getPuntos())
        {
            System.out.println("\nGANO J4!!!!!!!\nGRACIAS POR JUGAR");  
        }
        
    }
  
    }
      
    
    


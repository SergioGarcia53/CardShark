/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardshark_uabc_1182701;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author sgarc
 */
public class Jugador 
{
private ArrayList<Carta> jugador=new ArrayList<Carta>();   

    public ArrayList<Carta> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Carta> jugador) {
        this.jugador = jugador;
    }

    public Jugador() 
    {
       ArrayList<Carta> jugador=new ArrayList<Carta>(); 
    }

    public void repartirCartas(int n, Baraja Mazo)
    {
     jugador.add(Mazo.getCarta(n));
     Mazo.removerCarta(n);
        
    }
    
    public void cartasDado(int dado, Baraja Mazo)
    {
        Random rmd=new Random(); 
       for( int i=1;i<=dado;i++)
            {
            int n1=rmd.nextInt(Mazo.getSize());
            repartirCartas(n1,Mazo);   
            }   
    }
    
    
    public void repartirCartas(Baraja Mazo)
    {
        Random rmd=new Random();
      for(int j=1;j<=5;j++)
        {
         int n=rmd.nextInt(Mazo.getSize());
         repartirCartas(n,Mazo);    
        }
        int dado=rmd.nextInt(5)+1;
        cartasDado(dado,Mazo);  
    }
    
    public void mostrarCartas()
    {
        int i;
        for(i=0;i<=jugador.size()-1;i++)
        {
            System.out.println("["+(i+1)+"]  "+jugador.get(i).toString());
        }
    
    }
   
     public Carta escogerCarta(int n)
     {
       return jugador.get(n);  
     }
     
     public void removerCarta(int n)
     {
         jugador.remove(n);
     }
     
     public boolean estaVacio()
     {
         return jugador.isEmpty();
     }
}

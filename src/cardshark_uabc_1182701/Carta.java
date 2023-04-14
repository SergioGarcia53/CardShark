/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardshark_uabc_1182701;


public class Carta
{
    private int valor;
    private String figura;

    public Carta(int valor, String figura) 
    {
        this.valor = valor;
        this.figura = figura;
    }
    
    public Carta() 
    {
        this.valor = 0;
        this.figura = "Corazon";
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    @Override
    public String toString() 
    {
        if(valor==1)
        {
         return "A "+figura+"";   
        }
        else if(valor==11)
        {
         return "J "+figura+"";   
        }
        else if(valor==12)
        {
         return "Q "+figura+"";   
        }
        else if(valor==13)
        {
         return "K "+figura+"";   
        }
        else{
        return valor+" "+figura+"";
        }
    }
    
    
    
    
    
    
}

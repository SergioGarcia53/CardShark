
package cardshark_uabc_1182701;

import java.util.ArrayList;
import java.util.Collections;


public class Baraja 
{
    private ArrayList<Carta> Mazo=new ArrayList<Carta>();

    public Baraja() 
    {
        
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=13;j++)
            {
                if(i==1)
                {
                Carta carta = new Carta(j,"Corazon");
                Mazo.add(carta); 
                }
                else if(i==2)
                {
                Carta carta = new Carta(j,"Diamante");
                Mazo.add(carta); 
                }
                else if(i==3)
                {
                Carta carta = new Carta(j,"Trebol");
                Mazo.add(carta); 
                }
                else if(i==4)
                {
                Carta carta = new Carta(j,"Pica");
                Mazo.add(carta); 
                }
            }
        
        }
        Collections.shuffle(Mazo);
       Mazo.toString();
    }

    @Override
    public String toString() {
        return Mazo + "\n";
    }
    
    public int getSize()
    {
        return Mazo.size();
    }
    
    public Carta getCarta(int n)
    {
       return Mazo.get(n);
    }
    
    public void removerCarta(int n)
    {
        Mazo.remove(n);
    }
    
}

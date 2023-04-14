/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardshark_uabc_1182701;

/**
 *
 * @author sgarc
 */
public class Puntaje {
 private int puntos;

    public Puntaje() 
    {
        puntos = 0;
    }
    
    public void actualizarPuntos()
    {
        this.puntos=this.puntos+2;
    }
    
    public void removerPuntos()
    {
        this.puntos=this.puntos-3;
    }

    @Override
    public String toString() {
        return "" + puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
 
   
 
 
}

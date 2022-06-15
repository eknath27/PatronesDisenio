/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Eknath Villegas
 */
public class CajaEuros
{
    private double euros = 0;
   
    public CajaEuros() {
    }
   
    public double getTotalEuros()
    {
        return this.euros;
    }
    
     public void sacarEuros( double euros )
    {
        this.euros -= euros;
    }
    
     public void ingresarEuros( double euros )
    {
        this.euros += euros;
    }
}

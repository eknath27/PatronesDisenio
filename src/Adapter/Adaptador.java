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
public class Adaptador extends CajaEuros implements IAdaptador
{
    public Adaptador() {
    }
   
    @Override
     public void sacarPesetas( double pesetas )
    {
        double euros = pesetas / 166.386;
         this.sacarEuros( euros );
    }
   
    @Override
     public void ingresarPesetas( double pesetas )
    {
        double euros = pesetas / 166.386;
         this.ingresarEuros( euros );
    }
}

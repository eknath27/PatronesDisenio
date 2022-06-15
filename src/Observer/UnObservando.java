/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Eknath Villegas
 */
public class UnObservando extends Observando
{
    private int numero = 0;
    
    public UnObservando() {
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
        
         notificarObservadores();
    }
}

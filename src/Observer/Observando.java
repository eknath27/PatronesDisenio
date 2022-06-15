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
import java.util.ArrayList;
 public abstract class Observando
{
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    
    public Observando() {
    }
  
     public void agregarObservador(IObservador o) {
      observadores.add(o);
    }
    
     public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }
   
     public void notificarObservadores()
    {
        
         for (IObservador obj : observadores) {
             obj.observadoActualizado();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Eknath Villegas
 */
public class EstadoNaranja extends EstadoSemaforo
{
     public EstadoNaranja( Semaforo objSemaforo ) {
         this.objSemaforo = objSemaforo;
    }
   
    @Override
     public void mostrar() {
        System.out.println("Alerta naranja");
    }
}
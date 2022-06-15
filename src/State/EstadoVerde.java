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
public class EstadoVerde extends EstadoSemaforo
{
     public EstadoVerde( Semaforo objSemaforo ) {
         this.objSemaforo = objSemaforo;
    }
   
    @Override
     public void mostrar() {
        System.out.println("No estamos en alerta");
    }
}

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
public class Semaforo
{
    private EstadoSemaforo objEstadoSemaforo;
   
    public Semaforo() {
         this.objEstadoSemaforo = new EstadoVerde(this);
    }
   
    public void setEstado( EstadoSemaforo objEstadoSemaforo ) {
        this.objEstadoSemaforo = objEstadoSemaforo;
    }
 
    public void mostrarAviso() {
        this.objEstadoSemaforo.mostrar();
    }
}
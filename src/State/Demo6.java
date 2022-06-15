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
public class Demo6
{
       public static void main(String[] args)
    {
         Semaforo objSemaforo = new Semaforo();
        // Muestra el aviso por defecto (verde, no hay alerta)
        objSemaforo.mostrarAviso();
         objSemaforo.setEstado( new EstadoNaranja(objSemaforo) );
         objSemaforo.mostrarAviso();
        objSemaforo.setEstado( new EstadoRojo(objSemaforo) );
        objSemaforo.mostrarAviso();
    }
}

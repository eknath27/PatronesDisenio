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
public class Demo5 {
    public static void main(String[] args)
    {
       
         UnObservando objObservado = new UnObservando();
        
         new UnObservador( objObservado );
         new UnObservador( objObservado );
         new UnObservador( objObservado );
         objObservado.setNumero(55);
    }
}

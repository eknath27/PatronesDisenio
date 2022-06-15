/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Eknath Villegas
 */
import Factory.Boton;
import Factory.BotonWindows;


public class DialogoWindows extends Dialogo {

    

    @Override
    public Boton createButton() {
        return new BotonWindows();
    }
}

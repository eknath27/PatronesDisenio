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


public abstract class Dialogo {

    public void renderWindow() {
      

        Boton okButton = createButton();
        okButton.render();
    }

   
    public abstract Boton createButton();
}
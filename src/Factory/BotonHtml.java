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
public class BotonHtml implements Boton {

    public void render() {
        System.out.println("<boton>Test Boton</boton>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Boton says - 'Hola Mundo!'");
    }
}

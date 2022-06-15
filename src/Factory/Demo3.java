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
import Factory.Dialogo;
import Factory.Dialogohtml;
import Factory.DialogoWindows;

/**
 * Demo class. Everything comes together here.
 */
public class Demo3 {
    private static Dialogo dialogo;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialogo = new DialogoWindows();
        } else {
            dialogo = new Dialogohtml();
        }
    }

  
    static void runBusinessLogic() {
        dialogo.renderWindow();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Eknath Villegas
 */
public class Navegador {
    private String ruta;

    public Navegador() {
        this.ruta = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public Navegador(String manualRoute) {
        this.ruta = manualRoute;
    }

    public String getRuta() {
        return ruta;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Eknath Villegas
 */
public final class Singleton {
    private static Singleton instancia;
    public String valor;

    private Singleton(String valor) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }

    public static Singleton getInstance(String value) {
        if (instancia == null) {
            instancia = new Singleton(value);
        }
        return instancia;
    }
}

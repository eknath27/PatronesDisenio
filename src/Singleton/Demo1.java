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
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Si se tiene el mismo valor se reutiliza un Singleton" + "\n" +
                "Si se tienen valores diferentes se utilizan dos Singleton" + "\n\n" +
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.valor);
        System.out.println(anotherSingleton.valor);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Eknath Villegas
 */
public class Multiplicar implements IAritmetica
{
    public Multiplicar() {
    }
    
    @Override
     public int realizarOperacion(int a, int b)
    {
        return a * b;
    }
}

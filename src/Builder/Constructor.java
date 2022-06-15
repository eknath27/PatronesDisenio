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
import Builder.TipoCarro;
import Builder.Motor;
import Builder.Navegador;
import Builder.Transmision;
import Builder.Computadora;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Constructor {
    void setTipoCarro(TipoCarro tipo);
    void setAsientos(int asientos);
    void setMotor(Motor motor);
    void setTransmision(Transmision transmision);
    void setComputadora(Computadora computadora);
    void setNavegador(Navegador navegador);
}
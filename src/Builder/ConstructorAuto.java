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
import Builder.Carro;
import Builder.TipoCarro;
import Builder.Motor;
import Builder.Navegador;
import Builder.Transmision;
import Builder.Computadora;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class ConstructorAuto implements Constructor {
    private TipoCarro tipo;
    private int asientos;
    private Motor motor;
    private Transmision transmision;
    private Computadora computadora;
    private Navegador navegador;

    public void setTipoCarro(TipoCarro tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void setNavegador(Navegador navegador) {
        this.navegador = navegador;
    }

    public Carro getResult() {
        return new Carro(tipo, asientos, motor, transmision, computadora, navegador);
    }
}

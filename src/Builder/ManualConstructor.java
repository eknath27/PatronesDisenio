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
import Builder.Manual;
import Builder.TipoCarro;
import Builder.Motor;
import Builder.Navegador;
import Builder.Transmision;
import Builder.Computadora;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class ManualConstructor implements Constructor{
    private TipoCarro tipo;
    private int asientos;
    private Motor motor;
    private Transmision transmision;
    private Computadora computadora;
    private Navegador navegador;

    @Override
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public void setTipoCarro(TipoCarro tipo) {
        this.tipo = tipo;
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

    public Manual getResult() {
        return new Manual(tipo, asientos, motor, transmision, computadora, navegador);
    }
}
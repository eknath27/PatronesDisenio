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
import Builder.Motor;
import Builder.Navegador;
import Builder.Transmision;
import Builder.Computadora;


public class Carro {
    private final TipoCarro tipo;
    private final int asientos;
    private final Motor motor;
    private final Transmision transmision;
    private final Computadora computadora;
    private final Navegador navegador;
    private double gasolina = 0;

    public Carro(TipoCarro tipo, int asientos, Motor motor, Transmision transmision,
               Computadora computadora, Navegador navegador) {
        this.tipo = tipo;
        this.asientos = asientos;
        this.motor = motor;
        this.transmision = transmision;
        this.computadora = computadora;
        if (this.computadora != null) {
            this.computadora.setCarro(this);
        }
        this.navegador = navegador;
    }

    public TipoCarro getTipoCarro() {
        return tipo;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public int getAsientos() {
        return asientos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public Navegador getNavegador() {
        return navegador;
    }
}
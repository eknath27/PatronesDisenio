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


public class Manual {
    private final TipoCarro tipo;
    private final int asientos;
    private final Motor motor;
    private final Transmision transmision;
    private final Computadora computadora;
    private final Navegador navegador;

    public Manual(TipoCarro tipo, int asientos, Motor motor, Transmision transmision,
               Computadora computadora, Navegador navegador) {
        this.tipo = tipo;
        this.asientos = asientos;
        this.motor = motor;
        this.transmision = transmision;
        this.computadora = computadora;
        this.navegador = navegador;
    }

    public String print() {
        String info = "";
        info += "Tipo de Carro: " + tipo + "\n";
        info += "Numero de Asientos: " + asientos + "\n";
        info += "-Cilindraje del Motor: " + motor.getCilindraje() + "; -Kilometraje: " + motor.getKilometraje() + "\n";
        info += "Transmision: " + transmision + "\n";
        if (this.computadora != null) {
            info += "Computadora: Funciona" + "\n";
        } else {
            info += "Computadora: N/A" + "\n";
        }
        if (this.navegador != null) {
            info += "Navegador: Funciona" + "\n";
        } else {
            info += "Navegador: N/A" + "\n";
        }
        return info;
    }
}

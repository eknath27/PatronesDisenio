/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;
import Builder.Carro;
/**
 *
 * @author Eknath Villegas
 */
public class Computadora {

    private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void showNivelGasolina() {
        System.out.println("Nivel de Gasolina " + carro.getGasolina());
    }

    public void showEstado() {
        if (this.carro.getMotor().isStarted()) {
            System.out.println("El carro esta encendido");
        } else {
            System.out.println("El carro NO esta encendido");
        }
    }
}

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
import Builder.Constructor;
import Builder.TipoCarro;
import Builder.Motor;
import Builder.Navegador;
import Builder.Transmision;
import Builder.Computadora;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Constructor constructor) {
        constructor.setTipoCarro(TipoCarro.SPORTS_CAR);
        constructor.setAsientos(2);
        constructor.setMotor(new Motor(3.0, 0));
        constructor.setTransmision(Transmision.SEMI_AUTOMATICA);
        constructor.setComputadora(new Computadora());
        constructor.setNavegador(new Navegador());
    }

    public void constructCityCar(Constructor constructor) {
        constructor.setTipoCarro(TipoCarro.CITY_CAR);
        constructor.setAsientos(2);
        constructor.setMotor(new Motor(1.2, 0));
        constructor.setTransmision(Transmision.AUTOMATICA);
        constructor.setComputadora(new Computadora());
        constructor.setNavegador(new Navegador());
    }

    public void constructSUV(Constructor constructor) {
        constructor.setTipoCarro(TipoCarro.SUV);
        constructor.setAsientos(4);
        constructor.setMotor(new Motor(2.5, 0));
        constructor.setTransmision(Transmision.MANUAL);
        constructor.setNavegador(new Navegador());
    }
}
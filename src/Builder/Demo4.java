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
import Builder.ConstructorAuto;
import Builder.ManualConstructor;
import Builder.Carro;
import Builder.Manual;
import Builder.Director;


public class Demo4 {

    public static void main(String[] args) {
        Director director = new Director();


        ConstructorAuto constructor = new ConstructorAuto();
        director.constructSportsCar(constructor);


        Carro carro = constructor.getResult();
        System.out.println("Tipo de Carro:\n" + carro.getTipoCarro());


        ManualConstructor manualconstructor = new ManualConstructor();


        director.constructSportsCar(manualconstructor);
        Manual carManual = manualconstructor.getResult();
        System.out.println("\nManual del Constructor:\n" + carManual.print());
    }

}

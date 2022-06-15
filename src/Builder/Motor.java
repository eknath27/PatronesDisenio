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
public class Motor {
    private final double cilindraje;
    private double kilometraje;
    private boolean started;

    public Motor(double cilindraje, double kilometraje) {
        this.cilindraje = cilindraje;
        this.kilometraje = kilometraje;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.kilometraje += kilometraje;
        } else {
            System.err.println("No puede avanzar, primero debe encender el auto!");
        }
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public double getKilometraje() {
        return kilometraje;
    }
}
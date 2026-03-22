
package com.mycompany.proyecto_1;

public abstract class Aereo extends Vehiculos {
    
    protected double altitudMaxima;

    protected Aereo(String tipoVehiculo, String tipoMotor, double carga, double distancia, double altitudMaxima) {
        super(tipoVehiculo, tipoMotor, carga, distancia);
        this.altitudMaxima = altitudMaxima;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }
    
}

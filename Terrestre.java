
package com.mycompany.proyecto_1;

public abstract class Terrestre extends Vehiculos{
    
    protected int numeroRuedas;

    protected Terrestre(String tipoVehiculo, String tipoMotor, double carga, double distancia, int numeroRuedas) {
        super(tipoVehiculo, tipoMotor, carga, distancia);
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
    
}

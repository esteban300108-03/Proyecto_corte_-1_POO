package com.mycompany.proyecto_1;

public abstract class Vehiculos {

    private String tipovehiculo;
    private String tipomotor;
    private double carga;
    private double distancia;

    protected Vehiculos() {}
    //constructores
    protected Vehiculos(String tipovehiculo, String tipomotor, double carga, double distancia) {
        this.tipovehiculo = tipovehiculo;
        this.tipomotor = tipomotor;
        this.carga = carga;
        this.distancia = distancia;
    }

    // Getters
    public String getTipovehiculo() { return tipovehiculo; }
    public String getTipomotor() { return tipomotor; }
    public double getCarga() { return carga; }
    public double getDistancia() { return distancia; }

    // Setters
    public void setTipovehiculo(String tipovehiculo) { this.tipovehiculo = tipovehiculo; }
    public void setTipomotor(String tipomotor) { this.tipomotor = tipomotor; }
    public void setCarga(double carga) { this.carga = carga; }
    public void setDistancia(double distancia) { this.distancia = distancia; }

    protected abstract double calcularViaje();
    protected abstract double calcularTiempo();
    protected abstract double validarPeso();
    protected abstract double calcularHuellaEcologica();
}


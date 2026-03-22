
package com.mycompany.proyecto_1;

public class Dron extends Aereo{

    public Dron(String tipoVehiculo, String tipoMotor, double carga, double distancia, double altitudMaxima) {
        super(tipoVehiculo, tipoMotor, carga, distancia, 120);
    }
    
    @Override
    protected double validarPeso() {
        if (getCarga() <= 20) {
        return 1;
    } else {
        return 0;
    }
    }
    @Override
    protected double calcularViaje() {
         double costoPorKm=0;
         double costoPorKg=100;
         
         switch (getTipomotor()) {
            case "electrico" -> costoPorKm = 100;
            case "gasolina" -> costoPorKm = 180;
            default -> {
                System.out.println("Tipo de motor no registrado para el vehiculo, se usara un costo por KM predefinido de 200 por km");
                costoPorKm=200;
            }
        }
         double costoViaje =(getDistancia() * costoPorKm) + (getCarga() * costoPorKg);
         return costoViaje; 
    }

    @Override
    protected double calcularTiempo() {
        double velocidadpromedio=95;
        double tiempoviaje = getDistancia()/velocidadpromedio;
        return tiempoviaje;
    }
    @Override
    protected double calcularHuellaEcologica() {
        double factor = 0;

        switch (getTipomotor()) {
            case "electrico" -> factor = 0.02;
            case "gasolina" -> factor = 0.40;
            default -> System.out.println("Tipo de motor no registrado");
        }
        return getDistancia() * factor;
    }
    
    
}

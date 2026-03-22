
package com.mycompany.proyecto_1;


public class Moto extends Terrestre{

    public Moto(String tipoVehiculo, String tipoMotor, double carga, double distancia, int numeroRuedas) {
        super(tipoVehiculo, tipoMotor, carga, distancia, 2);
    }
    
    @Override
    protected double validarPeso() {
        if (getCarga() <= 100) {
        return 1;
    } else {
        return 0;
    }
    }
    @Override
    protected double calcularViaje() {
         double costoPorKm=0;
         double costoPorKg=60;
         
         switch (getTipomotor()) {
            case "hibrido" -> costoPorKm = 120;
            case "electrico" -> costoPorKm = 60;
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
        double velocidadpromedio=80;
        double tiempoviaje = getDistancia()/velocidadpromedio;
        return tiempoviaje;
    }
    @Override
    protected double calcularHuellaEcologica() {
        double factor = 0;

        switch (getTipomotor()) {
            case "electrico" -> factor = 0.05;
            case "hibrido" -> factor = 0.20;
            case "gasolina" -> factor = 0.70;
            default -> System.out.println("Tipo de motor no registrado");
        }
        return getDistancia() * factor;
    }
    

    
    
    
}

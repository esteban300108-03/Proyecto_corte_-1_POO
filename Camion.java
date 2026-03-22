
package com.mycompany.proyecto_1;

public class Camion extends Terrestre{

    public Camion(String tipoVehiculo, String tipoMotor, double carga, double distancia, int numeroRuedas) {
        super(tipoVehiculo, tipoMotor, carga, distancia, 6);
    }
    
    @Override
    protected double validarPeso() {
        if (getCarga() <= 10000) {
        return 1;
    } else {
        return 0;
    }
    }
    @Override
    protected double calcularViaje() {
         double costoPorKm=0;
         double costoPorKg=20;
         
         switch (getTipomotor()) {
            case "hibrido" -> costoPorKm = 150;
            case "electrico" -> costoPorKm = 120;
            case "gasolina" -> costoPorKm = 280;
            case "diesel" -> costoPorKm = 200;
            case "gas" -> costoPorKm = 160;
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
        double velocidadpromedio=60;
        double tiempoviaje = getDistancia()/velocidadpromedio;
        return tiempoviaje;
    }
    @Override
    protected double calcularHuellaEcologica() {
        double factor = 0;

        switch (getTipomotor()) {
            case "electrico" -> factor = 0.30;
            case "hibrido" -> factor = 0.60;
            case "gas" -> factor = 1.00;
            case "gasolina" -> factor = 1.20;
            case "diesel" -> factor = 1.50;
            default -> System.out.println("Tipo de motor no registrado");
        }
        return getDistancia() * factor;
    }
    


    
}

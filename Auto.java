
package com.mycompany.proyecto_1;


public class Auto extends Terrestre {  

    public Auto(String tipoVehiculo, String tipoMotor, double carga, double distancia, int numeroRuedas) {
        super(tipoVehiculo, tipoMotor, carga, distancia, 4);
    }

    @Override
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    @Override
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = 4;
    }
    
    
    @Override
    protected double validarPeso() {
        if (getCarga() <= 500) {
        return 1;
    } else {
        return 0;
    }
    }
    
    @Override
    protected double calcularViaje() {
        
         double costoPorKm=0;
         double costoPorKg=40;

        switch (getTipomotor()) {
            case "hibrido" -> costoPorKm = 120;
            case "electrico" -> costoPorKm = 80;
            case "gasolina" -> costoPorKm = 250;
            case "diesel" -> costoPorKm = 220;
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
        double velocidadpromedio=70;
        double tiempoviaje = getDistancia()/velocidadpromedio;
        return tiempoviaje;
    }

    @Override
    protected double calcularHuellaEcologica() {
        double factor = 0;

        switch (getTipomotor()) {
            case "electrico" -> factor = 0.10;
            case "hibrido" -> factor = 0.25;
            case "gas" -> factor = 0.70;
            case "gasolina" -> factor = 0.90;
            case "diesel" -> factor = 1.00;
            default -> System.out.println("Tipo de motor no registrado");
        }
        return getDistancia() * factor;
    }
    
}

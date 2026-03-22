package com.mycompany.proyecto_1;

public class Reporte {

    // Metodo que genera un reporte comparativo de todos los vehiculos
    public static void generarComparativo(Vehiculos[] lista) {

        // Inicializar con el primer vehículo
        double mejorCosto = lista[0].calcularViaje();
        String mejorVehiculo = lista[0].getTipovehiculo();

        double menorHuella = lista[0].calcularHuellaEcologica();
        String vehiculoEcologico = lista[0].getTipovehiculo();

        double menorTiempo = lista[0].calcularTiempo();
        String vehiculoRapido = lista[0].getTipovehiculo();

        System.out.println("\n===== REPORTE COMPARATIVO =====");

        // Recorrer todos los vehiculos
        for (Vehiculos v : lista) {

            System.out.println("\n--- " + v.getTipovehiculo() + " ---");
           
            switch (v) {
                case Terrestre t -> System.out.println("Numero de ruedas: " + t.getNumeroRuedas());
                case Aereo a -> System.out.println("Altitud maxima: " + a.getAltitudMaxima() + " Metros");
                default -> {
                }
            }
            // Validar si el vehiculo puede transportar la carga
            if (v.validarPeso() == 1) {

                // Calcular costo del viaje
                double costo = v.calcularViaje();

                // Calcular tiempo del viaje
                double tiempo = v.calcularTiempo();

                // Calcular huella ecologica
                double huella = v.calcularHuellaEcologica();

                // Mostrar resultados individuales
                System.out.println("Costo: $" + costo);
                System.out.println("Tiempo: " + tiempo + " horas");
                System.out.println("Huella: " + huella + " kg CO2");

                // Comparar costo para encontrar el mas economico
                if (costo < mejorCosto) {
                    mejorCosto = costo;
                    mejorVehiculo = v.getTipovehiculo();
                }

                // Comparar huella para encontrar el mas ecologico
                if (huella < menorHuella) {
                    menorHuella = huella;
                    vehiculoEcologico = v.getTipovehiculo();
                }

                // Comparar tiempo para encontrar el mas rapido
                if (tiempo < menorTiempo) {
                    menorTiempo = tiempo;
                    vehiculoRapido = v.getTipovehiculo();
                }

            } else {
                // Mensaje si la carga no es valida
                System.out.println("Carga no permitida");
            }
        }

        // ================= RESULTADOS FINALES =================

        System.out.println("\nMAS ECONOMICO:");
        System.out.println("Vehiculo mas economico: " + mejorVehiculo);
        System.out.println("Costo: $" + mejorCosto);

        System.out.println("\nMAS ECOLOGICO:");
        System.out.println("Vehiculo: " + vehiculoEcologico);
        System.out.println("Huella: " + menorHuella + " kg CO2");

        System.out.println("\nMAS RAPIDO:");
        System.out.println("Vehiculo: " + vehiculoRapido);
        System.out.println("Tiempo: " + menorTiempo + " Horas");
    }
}

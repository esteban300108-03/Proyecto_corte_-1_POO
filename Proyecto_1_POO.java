package com.mycompany.proyecto_1;

import java.util.Scanner;

public class Proyecto_1_POO{

    public static void main(String[] args) {

        // 🔹 Se crea el Scanner para leer datos desde consola
        Scanner sc = new Scanner(System.in);

        // 🔹 Título del sistema
        System.out.println("===== SISTEMA DE VEHICULOS =====");

        // 🔹 Menú de selección de vehículo
        System.out.println("Seleccione el tipo de vehiculo:");
        System.out.println("1. Auto");
        System.out.println("2. Moto");
        System.out.println("3. Camion");
        System.out.println("4. Dron");

        // 🔹 Lectura de la opción elegida
        System.out.println("Ingresa una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpia el buffer para evitar errores con nextLine()

        // 🔹 Información de tipos de motor permitidos
        System.out.println("===Tipos de motor establecidos para cada vehiculo: ===");
        System.out.println("Auto: 1.Electrico, 2.hibrido, 3.gasolina, 4.diesel, 5.gas");
        System.out.println("Moto: 1.Electrico, 2.hibrido y 3.gasolina");
        System.out.println("Camion: 1.Electrico, 2.hibrido, 3.gasolina, 4.diesel, 5.gas");
        System.out.println("Dron: 1.Electrico y 3.gasolina");

        // 🔹 Solicita el tipo de motor
        int opcionMotor;
        String motor;

        do {
            System.out.println("Seleccione el tipo de motor:");
            System.out.println("1. Electrico");
            System.out.println("2. Hibrido");
            System.out.println("3. Gasolina");
            System.out.println("4. Diesel");
            System.out.println("5. Gas");
            System.out.print("Ingrese un tipo de motor: ");
                
            opcionMotor = sc.nextInt();
            sc.nextLine();

            switch (opcionMotor) {
                case 1 -> motor = "electrico";
                case 2 -> motor = "hibrido";
                case 3 -> motor = "gasolina";
                case 4 -> motor = "diesel";
                case 5 -> motor = "gas";
                default -> {
                    motor = "";
                    System.out.println("Opcion invalida, intente nuevamente.\n");
                }
            }
        // 🔹 Valida que la opción esté dentro del rango permitido (1–5); de lo contrario, repite el ciclo, || es un or logico        
        } while (opcionMotor < 1 || opcionMotor > 5);

        // 🔹 Solicita la carga del vehículo
        System.out.print("Ingrese cuanta carga (kg): ");
        double carga = sc.nextDouble();

        // 🔹 Solicita la distancia del viaje
        System.out.print("Ingrese la distancia (km): ");
        double distancia = sc.nextDouble();

        // 🔹 Encabezado de resultados
        System.out.println("\n===== RESULTADOS=====\n");

        // 🔹 Se crean todos los objetos (aplicando polimorfismo)
        Auto auto = new Auto("Auto", motor, carga, distancia, 4);
        Moto moto = new Moto("Moto", motor, carga, distancia, 2);
        Camion camion = new Camion("Camion", motor, carga, distancia, 6);
        Dron dron = new Dron("Dron", motor, carga, distancia, 120);

        // 🔹 Se muestra solo el vehículo seleccionado por el usuario
        switch (opcion) {
            case 1 -> mostrarResultados(auto);
            case 2 -> mostrarResultados(moto);
            case 3 -> mostrarResultados(camion);
            case 4 -> mostrarResultados(dron);
            default -> System.out.println("Opcion invalida");
        }

        // 🔹 Limpia buffer antes de volver a usar nextLine()
        sc.nextLine();

        // 🔹 Pregunta al usuario si desea ver el reporte comparativo
        System.out.println("\nDesea ver el reporte comparativo? (si/no): ");
        String respuesta = sc.nextLine();

        // 🔹 Si el usuario responde "si", se genera el reporte
        if (respuesta.equalsIgnoreCase("si")) {
            Vehiculos[] lista = {auto, moto, camion, dron}; // Arreglo polimórfico
            Reporte.generarComparativo(lista); // Llamado al método del reporte
        } else {
            // 🔹 Si no desea verlo, el programa finaliza
            System.out.println("Programa finalizado sin mostrar el reporte.");
        }

        // 🔹 Se cierra el Scanner (buena práctica)
        sc.close();
    }

    // 🔹 Método que muestra los resultados de cualquier tipo de vehículo
    public static void mostrarResultados(Vehiculos v) {

        // 🔹 Información general del vehículo
        System.out.println("Tipo Vehiculo: " + v.getTipovehiculo());
        System.out.println("Tipo Motor: " + v.getTipomotor());
        System.out.println("Carga: " + v.getCarga() + " kg");
        System.out.println("Distancia: " + v.getDistancia() + " km");

        // 🔹 Se usa pattern matching para diferenciar tipo de vehículo
        switch (v) {
            case Terrestre t -> 
                System.out.println("Numero de ruedas: " + t.getNumeroRuedas());
            case Aereo a -> 
                System.out.println("Altitud maxima: " + a.getAltitudMaxima() + " Metros");
            default -> {
            }
        }

        // 🔹 Se valida si la carga es permitida
        if (v.validarPeso() == 1) {

            // 🔹 Se calculan los valores del viaje
            double costo = v.calcularViaje();
            double tiempo = v.calcularTiempo();
            double huella = v.calcularHuellaEcologica();

            // 🔹 Se muestran los resultados
            System.out.println("Costo del viaje: $" + costo);
            System.out.println("Tiempo estimado: " + tiempo + " horas");
            System.out.println("Huella ecologica: " + huella + " kg CO2");

        } else {
            // 🔹 Mensaje en caso de sobrepeso
            System.out.println("La carga excede el limite permitido");
        }
    }
}


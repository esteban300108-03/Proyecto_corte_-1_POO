# 🚚 Simulador de Envíos con Vehículos (POO)

## 📖 Descripción del proyecto

Este proyecto consiste en el desarrollo de un sistema que simula el costo y el tiempo de envío de paquetes utilizando diferentes tipos de vehículos.

El sistema permite comparar distintos medios de transporte (terrestres y aéreos) teniendo en cuenta el peso maximo que puede cargar el vehiculo, su velocidad promedio y el costo por kilómetro.

---

## 🎯 Objetivos

### Objetivo general

Desarrollar un sistema orientado a objetos que implemente herencia y clases abstractas para modelar diferentes tipos de vehículos.

### Objetivos específicos

* Implementar una clase abstracta base con atributos y métodos comunes.
* Definir métodos abstractos que sean implementados por las subclases.
* Crear diferentes tipos de vehículos con comportamientos específicos.
* Calcular el costo y tiempo de envío de mercancías.

---

## 🏗️ Estructura del proyecto

El sistema está compuesto por las siguientes clases:

* **Vehiculo (abstracta):**
  Clase base que contiene atributos comunes como tipo de vehiculo, tipo de motor, carga y distancia.

* **Terrestre (abstracta):**
  Hereda los atributos de la clase abstracta Vehiculo y representa los vehículos que se desplazan por tierra ademas posee el atributo propio: numero de              ruedas.

* **Aereo (abstracta):**
  Hereda los atributos de la clase abstracta Vehiculo y representa los vehículos que se desplazan por aire ademas posee el atributo propio: altura maxima.

* **Auto:**
  Vehículo terrestre con menor capacidad de carga.

* **Moto:**
  Vehículo terrestre rápido pero con poca capacidad.

* **Camion:**
  Vehículo terrestre con alta capacidad de carga.

* **Dron:**
  Vehículo aéreo utilizado para entregas rápidas de baja carga.

---

## ⚙️ Funcionalidades

El sistema permite:

* ✅ Calcular el costo total de envío según distancia y carga.
* ✅ Calcular el tiempo estimado de entrega.
* ✅ Validar que la carga no supere la capacidad del vehículo.
* ✅ Comparar resultados entre diferentes tipos de vehículos.

---

## ▶️ Cómo ejecutar el programa

1. Abrir el proyecto en Visual Studio Code o cualquier IDE de Java.
2. Compilar los archivos `.java`.
3. Ejecutar la clase principal `Proyecto_1_POO` donde se encuentra el Main.


---

## 🧪 Ejemplo de uso

El usuario selecciona:

* Tipo de vehiculo
* Tipo de motor 
* Cantidad de carga (Kg)
* Distancia (Km)

El sistema:

* Calcula el costo para el vehiculo seleccionado con su tipo de motor
* Calcula el tiempo estimado de entrega 
* Pregunta si desea ver la comparativa y si la respuesta es positiva muestra una comparación entre Auto, Moto, Camión y Dron con el tipo de motor seleccionado 


---

## 👨‍💻 Autores

* Airann Estiben Yepes Barrera 
* Esteban Enrique Gonzalez Guzman


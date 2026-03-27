/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

public class Furgoneta extends Vehiculo {

    private int capacidadPasajeros;

    public Furgoneta(String placa, String modelo, double combustible, int capacidadPasajeros) {
        super(placa, modelo, combustible);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public double calcularAutonomia() {
        return combustible * 12;
    }

    @Override
    public void mostrarInfoGeneral() {
        super.mostrarInfoGeneral();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tipo1;

public class Camion extends Vehiculo {

    private double pesoCarga;

    public Camion(String placa, String modelo, double combustible, double pesoCarga) {
        super(placa, modelo, combustible);
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularAutonomia() {
        return combustible * (10 / (1 + pesoCarga));
    }

    @Override
    public void mostrarInfoGeneral() {
        super.mostrarInfoGeneral();
        System.out.println("Peso de carga: " + pesoCarga + " toneladas");
    }

    public void asignarRuta() {
        System.out.println("Ruta asignada pero sin destino especifico aun.");
    }

    public void asignarRuta(String destino) {
        System.out.println("Ruta asignada con destino a: " + destino);
    }

    public void asignarRuta(String destino, double distanciaKm) {
        System.out.println("Ruta asignada a: " + destino);
        System.out.println("Distancia total: " + distanciaKm + " km");
        System.out.println("Preparando logistica pesada.");
    }
}

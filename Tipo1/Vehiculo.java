/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tipo1;

public abstract class Vehiculo {

    protected String placa;
    protected String modelo;
    protected double combustible;

    public Vehiculo(String placa, String modelo, double combustible) {
        this.placa = placa;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public void mostrarInfoGeneral() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Combustible: " + combustible + " L");
    }

    public abstract double calcularAutonomia();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

import java.util.ArrayList;

public class PruebaFlota {

    public static void main(String[] args) {

        ArrayList<Vehiculo> flota = new ArrayList<>();

        Camion c1 = new Camion("DRR487", "Iveco", 25,15);
        Camion c2 = new Camion("FWT321", "Mercedez", 35, 20);

        Furgoneta f1 = new Furgoneta("HLP234", "for", 12, 10);
        Furgoneta f2 = new Furgoneta("RLK708", "nizan", 10, 7);

        flota.add(c1);
        flota.add(c2);
        flota.add(f1);
        flota.add(f2);

        System.out.println("=== TRANSPORTE ===");

        for (Vehiculo v : flota) {
            v.mostrarInfoGeneral();
            System.out.println("Autonomia: " + v.calcularAutonomia());
            System.out.println("-------------------");
        }

        System.out.println("=== RUTA CAMIONES ===");

        for (Vehiculo v : flota) {
            if (v instanceof Camion) {
                Camion c = (Camion) v;

                c.asignarRuta();
                c.asignarRuta("ibague");
                c.asignarRuta("manizales", 173);

                System.out.println("-------------------");
            }
        }
    }
}


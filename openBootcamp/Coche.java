package com.openBootcamp;

public class Coche {
    public static void main(String[] args) {
        MiCoche micoche = new MiCoche();
        micoche.PonerPuerta();
        micoche.PonerPuerta();
        System.out.println(micoche.puertas);
    }


    public static int suma(int a, int b ) {
        return a + b;
    }
}

class MiCoche{

    public int puertas = 2;

    public void PonerPuerta(){
        this.puertas++;
    }
}


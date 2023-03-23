package Examen.Ej1_Adapter;

import java.util.Random;

public class CarDiesel implements  ICarGas{
    private int tanque = 0;
    @Override
    public void llenarGas() {
        System.out.println("Llenando tanque con DIESEL");
        tanque = new Random().nextInt(99)+1;
    }

    @Override
    public int getEstadoCombustible() {
        return tanque;
    }
}

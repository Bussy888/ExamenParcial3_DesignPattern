package Examen.Ej1_Adapter;

import java.util.Random;

public class CarGasolina implements  ICarGas{
    private int tanque = 0;
    @Override
    public void llenarGas() {
        tanque = new Random().nextInt(50);
    }

    @Override
    public int getEstadoCombustible() {
        return tanque;
    }
}

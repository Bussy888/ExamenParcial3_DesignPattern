package Examen.Ej1_Adapter;

import java.util.Random;

public class CarGasEspecial implements  ICarGas{
    private int tanque = 0;
    @Override
    public void llenarGas() {
        System.out.println("Llenando tanque con GASOLINA ESPECIAL");
        tanque = new Random().nextInt(99)+1;
    }

    @Override
    public int getEstadoCombustible() {
        return tanque;
    }
}

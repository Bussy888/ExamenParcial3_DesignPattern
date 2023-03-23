package Examen.Ej1_Adapter;

import java.util.Random;

public class CarElectric implements ICarElectrico{
    private int bateria = 0;
    @Override
    public void cargar() {
        System.out.println("Llenando BATERIA");
        int n = new Random().nextInt(100);
        if(n%2==0){
            bateria = n;
        }else {
            bateria = n+1;
        }
    }

    @Override
    public int getEstadoDeElectricidad() {
        return bateria/10 +1;
    }
}

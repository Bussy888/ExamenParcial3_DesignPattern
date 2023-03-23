package Examen.Ej1_Adapter;

public class CarAdapter implements ICarGas{
    private CarElectric carElectric;

    public CarAdapter(CarElectric carElectric) {
        this.carElectric = carElectric;
    }

    @Override
    public void llenarGas() {
        carElectric.cargar();
    }

    @Override
    public int getEstadoCombustible() {
        return carElectric.getEstadoDeElectricidad();
    }
}

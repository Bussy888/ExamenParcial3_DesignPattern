package Examen.Ej1_Adapter;

public class Client {
    public static void main(String[] args) {
        CarAdapter electric = new CarAdapter(new CarElectric());
        CarGasolina gasolina = new CarGasolina();
        CarDiesel diesel = new CarDiesel();
        CarGasEspecial gasEspecial = new CarGasEspecial();

        electric.llenarGas();
        System.out.println(electric.getEstadoCombustible());
        System.out.println();

        gasolina.llenarGas();
        System.out.println(gasolina.getEstadoCombustible());
        System.out.println();

        gasEspecial.llenarGas();
        System.out.println(gasEspecial.getEstadoCombustible());
        System.out.println();

        diesel.llenarGas();
        System.out.println(diesel.getEstadoCombustible());
        System.out.println();
    }
}

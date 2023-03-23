package Examen.Ej3_Bridge;

public abstract class Paquete {
    protected double precio;
    protected String nombre;
    protected double peso;
    protected IEnvioPaquete envio;

    public Paquete(double precio, String nombre, double peso, IEnvioPaquete envio) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
        this.envio = envio;
    }

    public double calcularCostoTotal() {
        double costoEnvio = envio.calcularCostoEnvio(precio);
        return precio + costoEnvio;
    }

    public abstract void enviar();
}

package Examen.Ej3_Bridge;

public class EnvioMar implements IEnvioPaquete {
    public double calcularCostoEnvio(double precio) {
        return precio * 0.25;
    }
}

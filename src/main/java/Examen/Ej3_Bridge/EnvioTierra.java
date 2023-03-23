package Examen.Ej3_Bridge;

public class EnvioTierra implements IEnvioPaquete {
    public double calcularCostoEnvio(double precio) {
        return precio * 0.05;
    }
}

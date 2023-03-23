package Examen.Ej3_Bridge;

public class EnvioAire implements IEnvioPaquete {
    public double calcularCostoEnvio(double precio) {
        return precio * 0.1;
    }
}


package Examen.Ej3_Bridge;

public class Client {
    public static void main(String[] args) {
        IEnvioPaquete aire = new EnvioAire();
        IEnvioPaquete tierra = new EnvioTierra();
        IEnvioPaquete mar = new EnvioMar();

        Paquete paquete1 = new EmpresaSRL(100, "Juguetes", 200, aire);
        Paquete paquete2 = new EmpresaSA(5000, "Autos", 10000, tierra);
        Paquete paquete3 = new EmpresaSRL(300, "Instrumentos", 450, mar);

        paquete1.enviar();
        System.out.println();
        paquete2.enviar();
        System.out.println();
        paquete3.enviar();
    }
}

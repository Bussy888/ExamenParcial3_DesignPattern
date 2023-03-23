package Examen.Ej3_Bridge;

public class EmpresaSA extends Paquete {
    public EmpresaSA(double precio, String nombre, double peso, IEnvioPaquete envio) {
        super(precio, nombre, peso, envio);
    }

    public void enviar() {
        System.out.println("Enviando paquete de la empresa SA por " + envio.getClass().getSimpleName());
        System.out.println("Nombre del paquete: " + nombre);
        System.out.println("Peso del paquete: " + peso + " kg");
        System.out.println("Precio del paquete: $" + precio);
        System.out.println("Costo de envío: $" + envio.calcularCostoEnvio(precio));
        System.out.println("Costo total: $" + calcularCostoTotal());
    }
}

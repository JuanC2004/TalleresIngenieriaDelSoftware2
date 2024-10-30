package Pregunta3;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("123445", "Juan", "juan@gmail.com");
        Factura facturaFisica = new FacturaFisica("Soy factura Fisica", 20000, cliente);
        Factura facturaElectronica = new FacturaElectronica("7890", "Soy factura electronica", 30000, cliente);
        System.out.println("FACTURA ELECTRONICA: ");
        System.out.println(facturaElectronica.getCodigo());
        System.out.println("FACTURA FISICA");
        System.out.println(facturaFisica.getCodigo());
    }
}

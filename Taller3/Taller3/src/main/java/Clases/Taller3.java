/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package  Clases;

/**
 *
 * @author juanc
 */
public class Taller3 {

    public static void main(String[] args) {
        Envio envioEstandar = new EnvioEstandar();
        Envio envioExpress = new EnvioExpress();
        Envio envioInternacional = new EnvioInternacional();
    
        double peso = 10;
        double distancia = 50;
        
        System.out.println("Costo del envuio estandar: "+envioEstandar.calcularCosto(peso, distancia));
        System.out.println("Costo del envio express: "+envioExpress.calcularCosto(peso, distancia));
        System.out.println("Costo del envio internacional: "+envioInternacional.calcularCosto(peso, distancia));
    }
}

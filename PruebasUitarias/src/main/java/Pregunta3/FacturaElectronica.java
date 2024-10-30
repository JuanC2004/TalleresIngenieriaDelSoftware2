/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author juanc
 */
public class FacturaElectronica extends Factura {
    private String numeroElectronico;

    public FacturaElectronica(String numeroElectronico, String codigo, double total, Cliente cliente) {
        super(codigo, total, cliente);
        this.numeroElectronico = numeroElectronico;
    }

    /**
     * @return the numeroElectronico
     */
    public String getNumeroElectronico() {
        return numeroElectronico;
    }

    /**
     * @param numeroElectronico the numeroElectronico to set
     */
    public void setNumeroElectronico(String numeroElectronico) {
        this.numeroElectronico = numeroElectronico;
    }

    
}

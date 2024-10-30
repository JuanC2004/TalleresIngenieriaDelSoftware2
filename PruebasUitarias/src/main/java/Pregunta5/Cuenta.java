/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta5;

/**
 *
 * @author juanc
 */
public class Cuenta {
    private String titula;
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String titula, String numeroCuenta, double saldo) {
        this.titula = titula;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    /**
     * @return the titula
     */
    public String getTitula() {
        return titula;
    }

    /**
     * @param titula the titula to set
     */
    public void setTitula(String titula) {
        this.titula = titula;
    }

    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

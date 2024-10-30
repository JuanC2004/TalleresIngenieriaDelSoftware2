/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta5;

import java.util.List;

/**
 *
 * @author juanc
 */
public class Banco {
    List<Cuenta> cuentas;
    
    public Banco(){}
    
    public List<Cuenta> getCuentas(){
        return cuentas;
    }
    public void setCuentas(List<Cuenta> cuentas){
        this.cuentas = cuentas;
    }
    
    public void depositar(String numeroCuenta, double cantidad){
        if (cantidad <= 0){
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
        for (Cuenta cuenta: cuentas){
            if(cuenta.getNumeroCuenta().equals(numeroCuenta)){
                double saldo = cuenta.getSaldo() + cantidad;
                cuenta.setSaldo(saldo);
                return;
            }
        }
        throw new IllegalArgumentException("NO EXISTE EL NUMERO DE CUENTA");
    }
    
    public void retirar(String numeroCuenta, double cantidad){
        if(cantidad <= 0){
            throw new IllegalArgumentException("LA CANTIDAD DEBE SER MAYOR A 0");
        }
        for (Cuenta cuenta:cuentas){
            if(cuenta.getNumeroCuenta().equals(numeroCuenta)){
                if (cantidad > cuenta.getSaldo()){
                    throw new IllegalArgumentException("FONDOS INSUFUCIENTES");
                }
                double saldo = cuenta.getSaldo() - cantidad;
                cuenta.setSaldo(saldo);
                return;
            }
        }
        throw new IllegalArgumentException("NO EXISTE EL NUMERO DE CUENTA");
    }
    public boolean existeCuenta(String titular){
        for (Cuenta cuenta:cuentas){
            if(cuenta.getTitula().equals(titular)){
                return true;
            }
        }
        return false;
    }
}

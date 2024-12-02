/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto5;

/**
 *
 * @author juanc
 */
public class Punto5 {

    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();

        Invoker invoker = new Invoker();

        Command encenderComputador = new EncenderComputadorCommand(computador);
        invoker.setCommand(encenderComputador);
        invoker.executeCommand();

        Command reiniciarComputador = new ReiniciarComputadorCommand(computador);
        invoker.setCommand(reiniciarComputador);
        invoker.executeCommand();

        Command encenderCelular = new EncenderCelularCommand(celular);
        invoker.setCommand(encenderCelular);
        invoker.executeCommand();

        Command reiniciarCelular = new ReiniciarCelularCommand(celular);
        invoker.setCommand(reiniciarCelular);
        invoker.executeCommand();
    }
}

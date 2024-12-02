/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto5;

/**
 *
 * @author juanc
 */
public class ReiniciarCelularCommand implements Command{
    private Celular celular;
    
    public ReiniciarCelularCommand(Celular celular){
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.reiniciar();
    }
}

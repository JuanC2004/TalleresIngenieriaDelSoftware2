/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto5;

/**
 *
 * @author juanc
 */
public class SuspenderCelularCommand implements Command{
    private Celular celular;
    
    public SuspenderCelularCommand(Celular celular){
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.suspender();
    }
}

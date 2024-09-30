/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller8_dip;

/**
 *
 * @author juanc
 */
public class EmailYahooImpl implements IEmail{

    @Override
    public void enviarEmail(Email email) {
        Yahoo YEmail = (Yahoo) email;
        System.out.println("ENVIANDO EMAIL POR YAHOO");
    }
    
}

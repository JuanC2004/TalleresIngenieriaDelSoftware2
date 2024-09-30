/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller8_dip;

/**
 *
 * @author juanc
 */
public class Taller8_DIP {

    public static void main(String[] args) {
        IEmail servicioEmail = new EmailGmailImpl("", "", "", "");
        Sistema sistema = new Sistema(servicioEmail);
    }
}

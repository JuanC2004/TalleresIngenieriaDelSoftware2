/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller17_singleton;

/**
 *
 * @author juanc
 */
public class Taller17_Singleton {

    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        
        System.out.println("Theme inicial: " + settings.getConfiguracion("theme"));
        System.out.println("Lenguage incial: " + settings.getConfiguracion("language"));
        
        settings.setConfiguracion("theme", "dark");
        settings.setConfiguracion("language", "es");
        
        System.out.println("theme actualizado: " + settings.getConfiguracion("theme"));
        System.out.println("Language actualizado: " + settings.getConfiguracion("language"));
    }
}

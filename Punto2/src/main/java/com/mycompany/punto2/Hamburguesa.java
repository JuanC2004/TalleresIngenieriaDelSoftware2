/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.punto2;

/**
 *
 * @author juanc
 */
public class Hamburguesa {
    String tipoTomate;
    String tipoCarne;
    String tipoQueso;
    String tipoPan;
    
    Hamburguesa(Builder builder){
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }
    
    @Override
     public String toString(){
       return "Hamburguesa{" + "Tomate= "+tipoTomate+ " Carne: " +tipoCarne+", queso "+tipoQueso+", pan=" +tipoPan+ "}";
   }
}

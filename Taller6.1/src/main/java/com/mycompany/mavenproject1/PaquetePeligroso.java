/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author juanc
 */
public class PaquetePeligroso extends Paquete implements IPaquetePeligroso {
    private String etiquetasPeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(String etiquetasPeligro, boolean embalajeEspecial, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    /**
     * @return the etiquetasPeligro
     */
    public String getEtiquetasPeligro() {
        return etiquetasPeligro;
    }

    /**
     * @param etiquetasPeligro the etiquetasPeligro to set
     */
    public void setEtiquetasPeligro(String etiquetasPeligro) {
        this.etiquetasPeligro = etiquetasPeligro;
    }

    /**
     * @return the embalajeEspecial
     */
    public boolean isEmbalajeEspecial() {
        return embalajeEspecial;
    }

    /**
     * @param embalajeEspecial the embalajeEspecial to set
     */
    public void setEmbalajeEspecial(boolean embalajeEspecial) {
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Se verifica el contenido del paquete peligroso");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        System.out.println("Se asegura el paquete peligroso");
    }
    
    
}

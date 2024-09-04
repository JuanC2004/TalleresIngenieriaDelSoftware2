/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller7_3;

import java.util.Date;

/**
 *
 * @author juanc
 */
public class Orden {
    private Date fecha;
    private String lugarOrigen;
    private String lugarDestino;

    public Orden(Date fecha, String lugarOrigen, String lugarDestino) {
        this.fecha = fecha;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * @param lugarOrigen the lugarOrigen to set
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * @return the lugarDestino
     */
    public String getLugarDestino() {
        return lugarDestino;
    }

    /**
     * @param lugarDestino the lugarDestino to set
     */
    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }
    
    
    
}

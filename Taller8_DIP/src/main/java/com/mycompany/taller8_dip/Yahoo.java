/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller8_dip;

/**
 *
 * @author juanc
 */
public class Yahoo extends Email {
    private String file;

    public Yahoo(String file, String to, String subject, String body) {
        super(to, subject, body);
        this.file = file;
    }

    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }
    
    
}

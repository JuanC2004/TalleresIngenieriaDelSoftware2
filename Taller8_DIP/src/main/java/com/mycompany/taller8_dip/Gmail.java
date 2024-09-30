/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller8_dip;

/**
 *
 * @author juanc
 */
public class Gmail extends Email{
    private String image;

    public Gmail(String image, String to, String subject, String body) {
        super(to, subject, body);
        this.image = image;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    
}

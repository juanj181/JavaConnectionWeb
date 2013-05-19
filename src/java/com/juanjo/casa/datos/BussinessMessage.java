/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

/**
 *
 * @author Administrador
 */
public class BussinessMessage {

    private String fieldName;
    private String message;

    public BussinessMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    /**
     * @return the fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.negocio;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author JuanJo
 */
public class Pelicula {
    
    private int idPelicula;
    @NotNull
    @Size(min = 3, max = 50)
    private String titulo;
    private List<Libro> libros;

    /**
     * @return the idPelicula
     */
    public int getIdPelicula() {
        return idPelicula;
    }

    /**
     * @param idPelicula the idPelicula to set
     */
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }


    
}

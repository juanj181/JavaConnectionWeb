/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import com.juanjo.casa.negocio.Pelicula;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanJo
 */
public interface PeliculaDAO {
    Pelicula create();
    void insert(Pelicula pelicula) throws BussinessException;
    Pelicula get(int idPelicula) throws BussinessException;
    void update(Pelicula pelicula) throws BussinessException;
    void delete(int idPelicula) throws BussinessException;
    List<Pelicula> find(Map<String,Object> filter) throws BussinessException; 
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;
import com.juanjo.casa.negocio.Libro;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JuanJo
 */
public interface LibroDAO {
    Libro create();
    void insert(Libro libro);
    Libro get(int idLibro);
    void update(Libro libro);
    void delete (int idLibro);
    List<Libro> find(Map<String, Object> filter);
    
}

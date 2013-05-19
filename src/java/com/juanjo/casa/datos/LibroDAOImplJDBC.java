
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import com.juanjo.casa.negocio.Libro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrador
 */
public class LibroDAOImplJDBC implements LibroDAO  {

    @Override
    public void insert(Libro libro) {
        try {
            String sql = "INSERT INTO Libro (idLibro,titulo) VALUES (?,?)";


            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,libro.getIdLibro() );
            preparedStatement.setString(2,libro.getTitulo() );

            preparedStatement.executeUpdate();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    @Override
    public void delete(int idLibro) {
        try {
            String sql = "DELETE FROM Libro WHERE IdLibro=?";


            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,idLibro);

            preparedStatement.executeUpdate();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }    
    

    private Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/conexiona";
            String user = "root";
            String password = "root";
            String driver = "com.mysql.jdbc.Driver";


            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);

            return connection;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }    

    @Override
    public Libro create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Libro get(int idLibro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Libro> find(Map<String, Object> filter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import com.juanjo.casa.negocio.Pelicula;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrador
 */
public class PeliculaDAOImplJDBC implements PeliculaDAO  {

    @Override
    public void insert(Pelicula pelicula) {
        try {
            String sql = "INSERT INTO Pelicula (idPelicula,titulo) VALUES (?,?)";


            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,pelicula.getIdPelicula() );
            preparedStatement.setString(2,pelicula.getTitulo() );

            preparedStatement.executeUpdate();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    @Override
    public void delete(int idPelicula) {
        try {
            String sql = "DELETE FROM Pelicula WHERE IdPelicula=?";


            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,idPelicula);

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
    public Pelicula create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pelicula get(int idPelicula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pelicula> find(Map<String, Object> filter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanjo.casa.datos;

import com.juanjo.casa.negocio.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.ConstraintViolation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Administrador
 */
public class PeliculaDAOImplHibernate implements PeliculaDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Pelicula create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insert(Pelicula pelicula) throws BussinessException{
        try{
        Session session = getSession();
        session.beginTransaction();
        
        session.save(pelicula); //<|--- Aqui guardamos el objeto en la base de datos.
        
        session.getTransaction().commit();
        session.close();
        }catch (javax.validation.ConstraintViolationException cve) {
            List<BussinessMessage> bussinessMessages=new ArrayList<BussinessMessage>();
            
            for(ConstraintViolation constraintViolation: cve.getConstraintViolations() ) {
                BussinessMessage bussinessMessage=new BussinessMessage(constraintViolation.getPropertyPath().toString(), constraintViolation.getMessage());
                bussinessMessages.add(bussinessMessage);
            }
            
            BussinessException bussinessException=new BussinessException(bussinessMessages);
            throw bussinessException;
        }catch (org.hibernate.exception.ConstraintViolationException cve) {
            List<BussinessMessage> bussinessMessages=new ArrayList<BussinessMessage>();
            
            BussinessMessage bussinessMessage=new BussinessMessage(null, cve.getMessage());
            bussinessMessages.add(bussinessMessage);
            
            
            BussinessException bussinessException=new BussinessException(bussinessMessages);
            throw bussinessException;
        }

    }

    @Override
    public Pelicula get(int idPelicula) {
        Session session = getSession();
        session.beginTransaction();
        Pelicula pelicula = (Pelicula)session.get(Pelicula.class,idPelicula);
        session.getTransaction().commit();
        session.close();
        return pelicula;
        
    }

    @Override
    public void update(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int idPelicula) {
    Pelicula pelicula = get(idPelicula);
    Session session = getSession();
    session.beginTransaction();
    session.delete(pelicula);
    session.getTransaction().commit();
    session.close();
    }

    @Override
    public List<Pelicula> find(Map<String, Object> filtro) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Session getSession() {
        Session session = sessionFactory.openSession();
        return session;
    }
}

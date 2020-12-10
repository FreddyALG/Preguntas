/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sigmove.facade;

import edu.sigmove.entity.Producto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Freddy
 */
@Stateless
public class ProductoFacade extends AbstractFacade<Producto> implements ProductoFacadeLocal {

    @PersistenceContext(unitName = "Sigmove1.5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoFacade() {
        super(Producto.class);
    }

    @Override
    public List<Producto> listaProdutosporcategoria(int fk_categoria) {
        try {
            Query qt = em.createQuery("SELECT p FROM Producto p WHERE p.idcategoria.idcategoria = :fk_categoria");
            qt.setParameter("fk_categoria", fk_categoria);
            return qt.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
    
    
}

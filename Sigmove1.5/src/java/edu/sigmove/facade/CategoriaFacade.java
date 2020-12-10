/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sigmove.facade;

import edu.sigmove.entity.Categoria;
import edu.sigmove.entity.Producto;
import java.util.ArrayList;
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
public class CategoriaFacade extends AbstractFacade<Categoria> implements CategoriaFacadeLocal {

    @PersistenceContext(unitName = "Sigmove1.5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaFacade() {
        super(Categoria.class);
    }

    @Override
    public int catidadProductoCategoria( int categoria){
        try {
            Query qt = em.createNativeQuery("SELECT COUNT(*) FROM producto WHERE Idcategoria = ?1");
            qt.setParameter(1, categoria);
            return ((Number)qt.getSingleResult()).intValue();
        } catch (Exception e) {
            return 0;
        }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sigmove.facade;

import edu.sigmove.entity.Proveedores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Freddy
 */
@Stateless
public class ProveedoresFacade extends AbstractFacade<Proveedores> implements ProveedoresFacadeLocal {

    @PersistenceContext(unitName = "Sigmove4.1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @Override
    public boolean removerProveedor(int id){
        boolean retorno = false;
        
        try{
            Query pv = em.createQuery("DELETE FROM Proveedores p WHERE p.idproveedor = :idproveedor");
            pv.setParameter("idproveedor", id);
            int salida = pv.executeUpdate();
            return true;
        }catch(Exception f){
            return retorno;
        }
    }

    public ProveedoresFacade() {
        super(Proveedores.class);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linosoft.controlador;

import com.linosoft.linosoftweb.Cargo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ciro
 */
@Stateless
public class CargoFacade extends AbstractFacade<Cargo> {
    @PersistenceContext(unitName = "com.linosoft_linosoftWeb_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CargoFacade() {
        super(Cargo.class);
    }
    
}

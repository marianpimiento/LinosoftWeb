/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linosoft.controlador;

import com.linosoft.linosoftweb.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ciro
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {
    @PersistenceContext(unitName = "com.linosoft_linosoftWeb_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
//    public List<Usuario> validarUsuario(String ingreso, String clave){
    public List<Usuario> validarUsuario(String usu, String cla ){
        EntityManager em = getEntityManager();
        Query q = em.createNamedQuery("Usuario.login").setParameter("usuario", usu ).setParameter("contrasena", cla);
        return q.getResultList();
    }
    
}

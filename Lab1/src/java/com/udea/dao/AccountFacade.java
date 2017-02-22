/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.modelo.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ?
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "Lab1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    

    public AccountFacade() {
        super(Account.class);
    }

    @Override
    public boolean checkLogin(String u, String p) {
        
        Query q = em.createQuery("select a from Account a");
        q.setParameter("u", u);
        q.setParameter("p", p);
        
        return q.getResultList().size()>0;
    }
    
}

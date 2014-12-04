/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import java.util.List;

/**
 *
 * @author jurandir.pereira
 * @param <T>
 */
public abstract class Service<T> {

    protected DAO dao;
    protected SimpleEntityManager simpleEntityManager;

    public Service(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        this.dao = this.createrDAO();
    }

    public abstract DAO createrDAO();

    public abstract void save(T obj);
    
    public abstract T saveReturn(T obj);
    
    public abstract List<T> findAll();
}

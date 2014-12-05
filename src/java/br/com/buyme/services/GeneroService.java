/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import br.com.buyme.daos.GeneroDAO;
import br.com.buyme.entidades.Genero;
import java.util.List;

/**
 *
 * @author jurandir.pereira
 */
public class GeneroService extends Service<Genero> {

    public GeneroService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new GeneroDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public Genero getById(long id) {
        Genero genero = null;
        try {
            simpleEntityManager.beginTransaction();
            genero = (Genero) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return genero;
    }

    @Override
    public void save(Genero genero) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(genero);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public Genero saveReturn(Genero genero) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(genero);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return genero;
    }

    @Override
    public void update(Genero genero) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(genero);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public void delete(Genero genero) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(genero);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public List<Genero> findAll() {
        return dao.findAll();
    }

}

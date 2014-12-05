/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.ColaboradorDAO;
import br.com.buyme.daos.DAO;
import br.com.buyme.entidades.Colaborador;
import java.util.List;

/**
 *
 * @author jurandir.pereira
 */
public class ColaboradorService extends Service<Colaborador> {

    public ColaboradorService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new ColaboradorDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public Colaborador getById(long id) {
        Colaborador colaborador = null;
        try {
            simpleEntityManager.beginTransaction();
            colaborador = (Colaborador) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return colaborador;
    }

    @Override
    public void save(Colaborador colaborador) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(colaborador);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public Colaborador saveReturn(Colaborador colaborador) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(colaborador);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return colaborador;
    }

    @Override
    public List<Colaborador> findAll() {
        return dao.findAllColaboradores();
    }

    @Override
    public void update(Colaborador colaborador) {
        try {
            simpleEntityManager.beginTransaction();
            dao.update(colaborador);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public void delete(Colaborador colaborador) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(colaborador);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.ArquivoDAO;
import br.com.buyme.daos.DAO;
import br.com.buyme.entidades.Arquivo;
import java.util.List;

/**
 *
 * @author Di
 */
public class ArquivoService extends Service<Arquivo> {

    public ArquivoService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new ArquivoDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public Arquivo getById(long id) {
        Arquivo arquivo = null;
        try {
            simpleEntityManager.beginTransaction();
            arquivo = (Arquivo) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return arquivo;
    }

    @Override
    public void save(Arquivo arquivo) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(arquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public Arquivo saveReturn(Arquivo arquivo) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(arquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return arquivo;
    }

    @Override
    public void update(Arquivo arquivo) {
 try {
            simpleEntityManager.beginTransaction();
            dao.update(arquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }  
    }

    @Override
    public void delete(Arquivo arquivo) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(arquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public List<Arquivo> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

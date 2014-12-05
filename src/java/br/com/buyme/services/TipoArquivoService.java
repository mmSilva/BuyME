/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import br.com.buyme.daos.TipoArquivoDAO;
import br.com.buyme.entidades.TipoArquivo;
import java.util.List;

/**
 *
 * @author Di
 */
public class TipoArquivoService extends Service<TipoArquivo> {

    public TipoArquivoService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new TipoArquivoDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public TipoArquivo getById(long id) {
        TipoArquivo tipoArquivo = null;
        try {
            simpleEntityManager.beginTransaction();
            tipoArquivo = (TipoArquivo) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return tipoArquivo;
    }

    @Override
    public void save(TipoArquivo tipoArquivo) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(tipoArquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public TipoArquivo saveReturn(TipoArquivo tipoArquivo) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(tipoArquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return tipoArquivo;
    }

    @Override
    public void update(TipoArquivo tipoArquivo) {
         try {
            simpleEntityManager.beginTransaction();
            dao.update(tipoArquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public void delete(TipoArquivo tipoArquivo) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(tipoArquivo);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public List<TipoArquivo> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

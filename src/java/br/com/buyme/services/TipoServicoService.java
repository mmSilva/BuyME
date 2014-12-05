/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import br.com.buyme.daos.TipoServicoDAO;
import br.com.buyme.entidades.TipoServico;
import java.util.List;

/**
 *
 * @author Di
 */
public class TipoServicoService extends Service<TipoServico> {

    public TipoServicoService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new TipoServicoDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public TipoServico getById(long id) {
        TipoServico tipoServico = null;
        try {
            simpleEntityManager.beginTransaction();
            tipoServico = (TipoServico) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return tipoServico;
    }

    @Override
    public void save(TipoServico tipoServico) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(tipoServico);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public TipoServico saveReturn(TipoServico tipoServico) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(tipoServico);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return tipoServico;
    }

    @Override
    public void update(TipoServico tipoServico) {
         try {
            simpleEntityManager.beginTransaction();
            dao.update(tipoServico);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public void delete(TipoServico tipoServico) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(tipoServico);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public List<TipoServico> findAll() {
         return dao.findAll();
    }

}

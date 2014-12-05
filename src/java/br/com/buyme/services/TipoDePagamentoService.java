/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import br.com.buyme.daos.TipoDePagamentoDAO;
import br.com.buyme.entidades.TipoDePagamento;
import br.com.buyme.entidades.TipoServico;
import java.util.List;

/**
 *
 * @author Di
 */
public class TipoDePagamentoService extends Service<TipoDePagamento> {
    
    public TipoDePagamentoService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }
    
    @Override
    public DAO createrDAO() {
        return new TipoDePagamentoDAO(simpleEntityManager.getEntityManager());
    }
    
    @Override
    public TipoDePagamento getById(long id) {
        TipoDePagamento tipoDePagamento = null;
        try {
            simpleEntityManager.beginTransaction();
            tipoDePagamento = (TipoDePagamento) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return tipoDePagamento;
    }
    
    @Override
    public void save(TipoDePagamento tipoDePagamento) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(tipoDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    @Override
    public TipoDePagamento saveReturn(TipoDePagamento tipoDePagamento) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(tipoDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return tipoDePagamento;
    }
    
    @Override
    public void update(TipoDePagamento tipoDePagamento) {
         try {
            simpleEntityManager.beginTransaction();
            dao.update(tipoDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    @Override
    public void delete(TipoDePagamento tipoDePagamento) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(tipoDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }
    
    @Override
    public List<TipoDePagamento> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

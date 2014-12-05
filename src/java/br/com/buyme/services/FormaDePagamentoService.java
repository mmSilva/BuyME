/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import br.com.buyme.daos.FormaDePagamentoDAO;
import br.com.buyme.entidades.FormaDePagamento;
import java.util.List;

/**
 *
 * @author Di
 */
public class FormaDePagamentoService extends Service<FormaDePagamento> {

    public FormaDePagamentoService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new FormaDePagamentoDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public FormaDePagamento getById(long id) {
        FormaDePagamento formaDePagamento = null;
        try {
            simpleEntityManager.beginTransaction();
            formaDePagamento = (FormaDePagamento) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return formaDePagamento;
    }

    @Override
    public void save(FormaDePagamento formaDePagamento) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(formaDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public FormaDePagamento saveReturn(FormaDePagamento formaDePagamento) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(formaDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return formaDePagamento;
    }

    @Override
    public void update(FormaDePagamento formaDePagamento){
        try{
            simpleEntityManager.beginTransaction();
            dao.update(formaDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public void delete(FormaDePagamento formaDePagamento) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(formaDePagamento);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public List<FormaDePagamento> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

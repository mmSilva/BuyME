/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.ClienteDAO;
import br.com.buyme.daos.DAO;
import br.com.buyme.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Di
 */
public class ClienteService extends Service<Cliente> {

    public ClienteService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new ClienteDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public Cliente getById(long id) {
        Cliente cliente = null;
        try {
            simpleEntityManager.beginTransaction();
            cliente = (Cliente) dao.getById(id);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return cliente;
    }

    @Override
    public void save(Cliente cliente) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(cliente);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public Cliente saveReturn(Cliente cliente) {
       try {
            simpleEntityManager.beginTransaction();
            dao.save(cliente);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return cliente;
    }

    @Override
    public void update(Cliente cliente) {
         try {
            simpleEntityManager.beginTransaction();
            dao.update(cliente);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public void delete(Cliente cliente) {
        try {
            simpleEntityManager.beginTransaction();
            dao.delete(cliente);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public List<Cliente> findAll() {
         return dao.findAll();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import br.com.buyme.daos.TelefoneDAO;
import br.com.buyme.entidades.Telefone;
import java.util.List;

/**
 *
 * @author jurandir.pereira
 */
public class TelefoneService extends Service<Telefone> {

    public TelefoneService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new TelefoneDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public void save(Telefone telefone) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(telefone);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public Telefone saveReturn(Telefone telefone) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(telefone);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return telefone;
    }

    @Override
    public List<Telefone> findAll() {
        return dao.findAll();
    }

}

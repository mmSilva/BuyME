/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import br.com.buyme.daos.EnderecoDAO;
import br.com.buyme.entidades.Endereco;
import java.util.List;

/**
 *
 * @author jurandir.pereira
 */
public class EnderecoService extends Service<Endereco> {

    public EnderecoService(SimpleEntityManager simpleEntityManager) {
        super(simpleEntityManager);
    }

    @Override
    public DAO createrDAO() {
        return new EnderecoDAO(simpleEntityManager.getEntityManager());
    }

    @Override
    public void save(Endereco endereco) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(endereco);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
    }

    @Override
    public Endereco saveReturn(Endereco endereco) {
        try {
            simpleEntityManager.beginTransaction();
            dao.save(endereco);
            simpleEntityManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            simpleEntityManager.rollBack();
        }
        return endereco;
    }

    @Override
    public List<Endereco> findAll() {
        return dao.findAll();
    }

}

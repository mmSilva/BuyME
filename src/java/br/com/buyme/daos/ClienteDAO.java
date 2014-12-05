/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.daos;

import br.com.buyme.entidades.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * @author Di
 */
public class ClienteDAO extends DAO<Long, Cliente> {

    public ClienteDAO(EntityManager entityManager) {
        super(entityManager);
    }

}

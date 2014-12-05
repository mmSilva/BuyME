/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.daos;

import br.com.buyme.entidades.Arquivo;
import javax.persistence.EntityManager;

/**
 *
 * @author Di
 */
public class ArquivoDAO extends DAO<Long, Arquivo> {

    public ArquivoDAO(EntityManager entityManager) {
        super(entityManager);
    }

}

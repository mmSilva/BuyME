/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.daos;

import br.com.buyme.entidades.TipoArquivo;
import javax.persistence.EntityManager;

/**
 *
 * @author Di
 */
public class TipoArquivoDAO extends DAO<Long, TipoArquivo> {

    public TipoArquivoDAO(EntityManager entityManager) {
        super(entityManager);
    }

}

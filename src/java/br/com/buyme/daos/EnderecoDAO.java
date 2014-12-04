/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.daos;

import br.com.buyme.entidades.Endereco;
import javax.persistence.EntityManager;

/**
 *
 * @author jurandir.pereira
 */
public class EnderecoDAO extends DAO<Long, Endereco> {
    
    public EnderecoDAO(EntityManager entityManager) {
        super(entityManager);
    }
}

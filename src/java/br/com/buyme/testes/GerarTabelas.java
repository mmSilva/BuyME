/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.testes;

import br.com.buyme.aspects.Banco;
import br.com.buyme.aspects.SimpleEntityManager;

/**
 *
 * @author jurandir.pereira
 */
public class GerarTabelas {

    public static void main(String[] args) {
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager((String) Banco.MySQL.getBanco());
    }
}

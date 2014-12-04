/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.testes;

import br.com.buyme.aspects.Banco;
import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.entidades.Colaborador;
import br.com.buyme.services.ColaboradorService;

/**
 *
 * @author jurandir.pereira
 */
public class ColaboradorTeste {

    public static void main(String[] args) {
        
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager((String) Banco.MySQL.getBanco());
        
        ColaboradorService colaboradorService = new ColaboradorService(simpleEntityManager);
        
        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Jurandir P. A. Santos");
        colaborador.setApelido("HunterD.");
        colaboradorService.save(colaborador);
        simpleEntityManager.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.testes;

import br.com.buyme.aspects.Banco;
import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.entidades.Colaborador;
import br.com.buyme.entidades.Endereco;
import br.com.buyme.entidades.Genero;
import br.com.buyme.services.ColaboradorService;
import br.com.buyme.services.EnderecoService;
import br.com.buyme.services.GeneroService;
import br.com.buyme.services.Service;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 *
 * @author jurandir.pereira
 */
public class ColaboradorTeste {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        SimpleEntityManager simpleEntityManager = new SimpleEntityManager((String) Banco.Postgres.getBanco());

        ColaboradorService colaboradorService = new ColaboradorService(simpleEntityManager);

        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Jurandir P. A. Santos");
        colaborador.setApelido("HunterD.");

        // cadastro de colaborador;
        colaboradorService.save(colaborador);

        // atualizar dados colaborador;
        colaborador.setSenha(Service.convertPasswordMD5("123456"));
        colaboradorService.update(colaborador);

        // busca de colaborador;
        Colaborador colaborador2 = colaboradorService.getById(1);
        System.out.println(colaborador2.getNome());

        // operacoes diversificadas
        Colaborador colaborador3 = new Colaborador();
        colaborador3.setNome("Jonas A.");
        colaborador3.setApelido("Drogadinha");
        colaborador3.setSenha(Service.convertPasswordMD5("123456"));
        
        Genero genero = Genero.OUTROS;
        
        GeneroService generoService = new GeneroService(simpleEntityManager);
        generoService.save(genero);
        
        colaborador3.setGenero(genero);
        
        EnderecoService enderecoService = new EnderecoService(simpleEntityManager);
                
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Av. General Hilton Mendes Barbosa");
        enderecoService.save(endereco);
        
        colaborador3.addEndereco(endereco);
        colaboradorService.save(colaborador3);
        
        // consultar todos os colaboradores;
        List<Colaborador> colaboradores = null;
        colaboradores = colaboradorService.findAll();

        for (Colaborador colaborador4 : colaboradores) {
            System.out.println(colaborador4.getNome());
        }
        simpleEntityManager.close();
    }
}

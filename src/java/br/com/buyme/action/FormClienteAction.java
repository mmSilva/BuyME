/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.action;

import br.com.buyme.aspects.Banco;
import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.entidades.Cliente;
import br.com.buyme.entidades.Colaborador;
import br.com.buyme.services.ClienteService;
import br.com.buyme.services.ColaboradorService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabyuu
 */
public class FormClienteAction {

    private Cliente cliente;
    private static List<Colaborador> colaboradores = new ArrayList<Colaborador>();

    public FormClienteAction() {
        cliente = new Cliente();
    }

    public String cadastrar() {
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager((String) Banco.Postgres.getBanco());

        ClienteService clienteService = new ClienteService(simpleEntityManager);
        clienteService.save(this.cliente);
        return "main";
    }

    public List<Colaborador> listaDeColaboradores() {
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager((String) Banco.Postgres.getBanco());

        ColaboradorService colaboradorService = new ColaboradorService(simpleEntityManager);
        colaboradores = colaboradorService.findAll();

        return this.colaboradores;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Colaborador> getColaboradores() {
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager((String) Banco.Postgres.getBanco());

        ColaboradorService colaboradorService = new ColaboradorService(simpleEntityManager);
        colaboradores = colaboradorService.findAll();
        System.out.println("colaboradores.size(): " + colaboradores.size());
        System.out.println("colaboradores.size(): " + colaboradores.size());
        System.out.println("colaboradores.size(): " + colaboradores.size());
        System.out.println("colaboradores.size(): " + colaboradores.size());
        System.out.println("colaboradores.size(): " + colaboradores.size());
        
        return this.colaboradores;
    }

    public void setColaboradores(List<Colaborador> colaboradores) {
        this.colaboradores = colaboradores;
    }
}

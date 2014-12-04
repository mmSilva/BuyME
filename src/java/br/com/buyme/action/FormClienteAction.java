/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.action;

import br.com.buyme.entidades.Cliente;

/**
 *
 * @author fabyuu
 */
public class FormClienteAction {
    private Cliente cliente;

    public FormClienteAction() {
        cliente = new Cliente();
    }
    
    public void cadastrar(){
        System.out.println("cadastrar");
        //ClienteService clienteService = new ClienteService();
        //clienteService.create(cliente);
        //return "main";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}

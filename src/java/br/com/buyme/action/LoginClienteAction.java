/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.action;
import br.com.buyme.entidades.Cliente;
import javax.faces.context.FacesContext;

/**
 *
 * @author fabyuu
 */
public class LoginClienteAction {
    private Cliente cliente;

    public LoginClienteAction() {
        cliente = new Cliente();
    }
    
    public void logar(){
        FacesContext context = FacesContext.getCurrentInstance();
        //ColaboradorService colaboradorService = new ColaboradorService(colaborador);
        //colaboradorService.findById();
        //return "main";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.action;

import br.com.buyme.entidades.Colaborador;
import br.com.buyme.services.ColaboradorService;
import javax.faces.context.FacesContext;

/**
 *
 * @author fabyuu
 */
public class LoginColaboradorAction {
    private Colaborador colaborador;

    public LoginColaboradorAction() {
        colaborador = new Colaborador();
    }
    
    public void logar(){
        FacesContext context = FacesContext.getCurrentInstance();
        //ColaboradorService colaboradorService = new ColaboradorService(colaborador);
        //colaboradorService.findById();
        //return "main";
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
    
}

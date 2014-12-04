/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.action;

import br.com.buyme.entidades.Colaborador;

/**
 *
 * @author fabyuu
 */
public class FormColaboradorAction {
    private Colaborador colaborador;

    public FormColaboradorAction() {
        colaborador = new Colaborador();
    }
    
    public void cadastrar(){
        //ColaboradorService colaboradorService = new ColaboradorService();
        //colaborador.create(colaborador);
        //return "main";
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
    
    
}

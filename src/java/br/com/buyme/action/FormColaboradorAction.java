/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.action;

import br.com.buyme.aspects.Banco;
import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.entidades.Colaborador;
import br.com.buyme.services.ColaboradorService;
import javax.faces.context.FacesContext;

/**
 *
 * @author fabyuu
 */
public class FormColaboradorAction {

    private Colaborador colaborador;
    private static int idColaborador;

    public FormColaboradorAction() {
        colaborador = new Colaborador();
    }

    public String cadastrar() {
        FacesContext context = FacesContext.getCurrentInstance();
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager((String) Banco.Postgres.getBanco());

        ColaboradorService colaboradorService = new ColaboradorService(simpleEntityManager);
        colaboradorService.save(this.colaborador);
//        simpleEntityManager.close();
        System.out.println("entrou");
        return "main";
    }
    
    public String Editar(){
        
        
        return "main";
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public static int getIdColaborador() {
        return idColaborador;
    }

    public static void setIdColaborador(int idColaborador) {
        FormColaboradorAction.idColaborador = idColaborador;
    }
    
    

}

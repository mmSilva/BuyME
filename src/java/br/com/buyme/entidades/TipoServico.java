/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jurandir.pereira
 */
@Entity
public enum TipoServico {

    GRUPO(0, "GRUPO");

    @Id
    private long tipo_servico_id;
    private String tipoServico;

    private TipoServico(long tipo_servico_id, String tipoServico) {
        this.tipo_servico_id = tipo_servico_id;
        this.tipoServico = tipoServico;
    }

    /**
     * @return the tipo_servico_id
     */
    public long getTipo_servico_id() {
        return tipo_servico_id;
    }

    /**
     * @param tipo_servico_id the tipo_servico_id to set
     */
    public void setTipo_servico_id(long tipo_servico_id) {
        this.tipo_servico_id = tipo_servico_id;
    }

    /**
     * @return the tipoServico
     */
    public String getTipoServico() {
        return tipoServico;
    }

    /**
     * @param tipoServico the tipoServico to set
     */
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

}

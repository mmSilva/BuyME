/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Di
 */
@Entity
public class Servico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long servico_id;
    @Enumerated(EnumType.ORDINAL)
    private TipoServico tipoServico;// criar enun p/ tipos de servicos

    /**
     * @return the servico_id
     */
    public long getServico_id() {
        return servico_id;
    }

    /**
     * @param servico_id the servico_id to set
     */
    public void setServico_id(long servico_id) {
        this.servico_id = servico_id;
    }

    /**
     * @return the tipoServico
     */
    public TipoServico getTipoServico() {
        return tipoServico;
    }

    /**
     * @param tipoServico the tipoServico to set
     */
    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

}

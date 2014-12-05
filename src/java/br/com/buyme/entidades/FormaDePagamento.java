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
import javax.persistence.OneToOne;

/**
 *
 * @author Di
 */
@Entity
public class FormaDePagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long formas_de_pagamento_id;
    @OneToOne
    @Enumerated(EnumType.ORDINAL)
    private TipoDePagamento tipoDePagamento;
    private boolean autorizacao;
    private String descricao;

    public boolean isAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(boolean autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the formas_de_pagamento_id
     */
    public long getFormas_de_pagamento_id() {
        return formas_de_pagamento_id;
    }

    /**
     * @param formas_de_pagamento_id the formas_de_pagamento_id to set
     */
    public void setFormas_de_pagamento_id(long formas_de_pagamento_id) {
        this.formas_de_pagamento_id = formas_de_pagamento_id;
    }

    /**
     * @return the tipoDePagamento
     */
    public TipoDePagamento getTipoDePagamento() {
        return tipoDePagamento;
    }

    /**
     * @param tipoDePagamento the tipoDePagamento to set
     */
    public void setTipoDePagamento(TipoDePagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

}

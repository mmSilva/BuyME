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
public enum TipoDePagamento {

    AVISTA(0, "Á VISTA"), PAGSEGURO(1, "PAGSEGURO"), MERCADOPAGO(2, "MERCADOPAGO"), PAYPAL(3, "PAYPAL");

    @Id
    private long id;
    private String tipoDePagamento;

    private TipoDePagamento(long id, String tipoDePagamento) {
        this.id = id;
        this.tipoDePagamento = tipoDePagamento;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the tipoDePagamento
     */
    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    /**
     * @param tipoDePagamento the tipoDePagamento to set
     */
    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

}

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
 * @author Di
 */
@Entity
public enum TipoArquivo {

    INDENTIDADE(0, "INDENTIDADE");

    @Id
    private long tipo_arquivo_id;
    private String tipoArquivo;

    private TipoArquivo(long tipo_arquivo_id, String tipoArquivo) {
        this.tipo_arquivo_id = tipo_arquivo_id;
        this.tipoArquivo = tipoArquivo;
    }

    /**
     * @return the tipo_arquivo_id
     */
    public long getTipo_arquivo_id() {
        return tipo_arquivo_id;
    }

    /**
     * @param tipo_arquivo_id the tipo_arquivo_id to set
     */
    public void setTipo_arquivo_id(long tipo_arquivo_id) {
        this.tipo_arquivo_id = tipo_arquivo_id;
    }

    /**
     * @return the tipoArquivo
     */
    public String getTipoArquivo() {
        return tipoArquivo;
    }

    /**
     * @param tipoArquivo the tipoArquivo to set
     */
    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

}

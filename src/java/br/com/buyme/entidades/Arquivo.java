/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
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
public class Arquivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long arquivo_id;
    @Enumerated(EnumType.ORDINAL)
    private TipoArquivo tipoArquivo;
    @Basic(optional = false)
    @Column(unique = true)
    private String caminhoDoArquivo;

    public TipoArquivo getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(TipoArquivo tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public String getCaminhoDoArquivo() {
        return caminhoDoArquivo;
    }

    public void setCaminhoDoArquivo(String caminhoDoArquivo) {
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    /**
     * @return the arquivo_id
     */
    public long getArquivo_id() {
        return arquivo_id;
    }

    /**
     * @param arquivo_id the arquivo_id to set
     */
    public void setArquivo_id(long arquivo_id) {
        this.arquivo_id = arquivo_id;
    }

}

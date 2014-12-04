/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.entidades;

/**
 *
 * @author Di
 */
public enum Genero {

    MASCULINO(0, "MASCULINO"), FEMININO(1, "FEMININO"), OUTROS(2, "OUTROS");

    private long genero_id;
    private String genero;

    Genero(long id, String genero) {
        this.genero_id = id;
        this.genero = genero;
    }

    /**
     * @return the genero_id
     */
    public long getGenero_id() {
        return genero_id;
    }

    /**
     * @param genero_id the genero_id to set
     */
    public void setGenero_id(long genero_id) {
        this.genero_id = genero_id;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

}

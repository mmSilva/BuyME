/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Di
 */
@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Usuario implements Serializable {

    @Basic(optional = false)
    public String nome;
    @Basic(optional = false)
    @Column(unique = true)
    public String login;
    public String senha;
    public String apelido;
    @Temporal(TemporalType.DATE)
    public Calendar dataNascminento;
    @OneToOne
    @Enumerated(EnumType.ORDINAL)
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Calendar getDataNascminento() {
        return dataNascminento;
    }

    public void setDataNascminento(Calendar dataNascminento) {
        this.dataNascminento = dataNascminento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}

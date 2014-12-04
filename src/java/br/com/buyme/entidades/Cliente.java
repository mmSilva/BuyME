/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.entidades;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Di
 */
//@Entity
//@DiscriminatorValue("COLABORADOR")
public class Cliente extends Usuario implements Serializable{
    public String nome, login, senha, nick;
    public Date dataNascminento;
    public int genero;

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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Date getDataNascminento() {
        return dataNascminento;
    }

    public void setDataNascminento(Date dataNascminento) {
        this.dataNascminento = dataNascminento;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    
}

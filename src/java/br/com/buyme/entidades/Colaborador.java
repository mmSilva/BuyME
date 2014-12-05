/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Di
 */
@Entity
@DiscriminatorValue("COLABORADOR")
public class Colaborador extends Usuario implements Serializable {

    @OneToOne
    @Enumerated(EnumType.ORDINAL)
    private Genero genero;
    @Basic(optional = false)
    private String nome;
    private String senha;
    @Basic(optional = false)
    @Column(unique = true)
    private String login;
    private String apelido;
    private String descricao;
    private double cache;
    @Temporal(TemporalType.DATE)
    private Calendar dataDeNascimento;
    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "endereco_id"))
    private List<Endereco> enderecos;
    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "arquivo_id"))
    private List<Arquivo> arquivos;
    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "forma_de_pagamento_id"))
    private List<FormaDePagamento> formasDePagamentos;
    @OneToMany
    @JoinTable(joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "servico_id"))
    @Enumerated(EnumType.ORDINAL)
    private List<TipoServico> servicos;

    public Colaborador() {
        this.arquivos = new ArrayList<>();
        this.enderecos = new ArrayList<>();
        this.formasDePagamentos = new ArrayList<>();
        this.servicos = new ArrayList<>();
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the cache
     */
    public double getCache() {
        return cache;
    }

    /**
     * @param cache the cache to set
     */
    public void setCache(double cache) {
        this.cache = cache;
    }

    /**
     * @return the dataDeNascimento
     */
    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * @param dataDeNascimento the dataDeNascimento to set
     */
    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    /**
     * @return the enderecos
     */
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    /**
     * @return the arquivos
     */
    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    /**
     * @param arquivos the arquivos to set
     */
    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    /**
     * @return the formasDePagamentos
     */
    public List<FormaDePagamento> getFormasDePagamentos() {
        return formasDePagamentos;
    }

    /**
     * @param formasDePagamentos the formasDePagamentos to set
     */
    public void setFormasDePagamentos(List<FormaDePagamento> formasDePagamentos) {
        this.formasDePagamentos = formasDePagamentos;
    }

    /**
     * @return the servicos
     */
    public List<TipoServico> getServicos() {
        return servicos;
    }

    /**
     * @param servicos the servicos to set
     */
    public void setServicos(List<TipoServico> servicos) {
        this.servicos = servicos;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public void addArquivo(Arquivo arquivo) {
        this.arquivos.add(arquivo);
    }
    
    public void addFormaDePagamento(FormaDePagamento formaDePagamento){
        this.formasDePagamentos.add(formaDePagamento);
    }
    
    public void addServico(TipoServico tipoServico){
        this.servicos.add(tipoServico);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.aspects;

/**
 *
 * @author jurandir.pereira
 */
public enum Banco {

    MySQL("persistenceMySQL", 0), Postgres("persistencePostgres", 1);

    private final String banco;
    private final int index;

    Banco(String banco, int index) {
        this.banco = banco;
        this.index = index;
    }

    public String getBanco() {
        return banco;
    }

    public int getInt() {
        return index;
    }
}
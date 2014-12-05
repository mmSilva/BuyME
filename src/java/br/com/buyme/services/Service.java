/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.buyme.services;

import br.com.buyme.aspects.SimpleEntityManager;
import br.com.buyme.daos.DAO;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 *
 * @author jurandir.pereira
 * @param <T>
 */
public abstract class Service<T> {

    protected DAO dao;
    protected SimpleEntityManager simpleEntityManager;

    public Service(SimpleEntityManager simpleEntityManager) {
        this.simpleEntityManager = simpleEntityManager;
        this.dao = this.createrDAO();
    }

    public abstract DAO createrDAO();

    public abstract T getById(long pk);

    public abstract void save(T obj);

    public abstract T saveReturn(T obj);

    public abstract void update(T obj);

    public abstract void delete(T obj);

    public abstract List<T> findAll();

    public static String convertPasswordMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        BigInteger hash = new BigInteger(1, md.digest(password.getBytes()));

        return String.format("%32x", hash);
    }

}

package br.com.caelum.ingresso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.ingresso.model.Ingresso;

@Repository
public class IngressoDao {

    @PersistenceContext
    private EntityManager manager;


    public List<Ingresso> findAll() {
        return manager.createQuery("select i from Ingresso i", Ingresso.class).getResultList();
    }
}

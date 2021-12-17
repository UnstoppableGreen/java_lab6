package ru.rsatu.service;

import ru.rsatu.pojo.Gift;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SantaClausService {
    @Inject
    EntityManager em;

    @Transactional
    public void createGift() {
        Gift gift = new Gift();
        gift.setName("Zhg");
        em.persist(gift);
    }

    @Transactional
    public Gift insertGift(Gift gift) {
       // em.persist(gift);
        em.merge(gift);
        em.flush();
        return gift;
    }

    @Transactional
    public List<Gift> getGift() {
        return em.createQuery(" select g from Gift g ", Gift.class).getResultList();
    }
}
